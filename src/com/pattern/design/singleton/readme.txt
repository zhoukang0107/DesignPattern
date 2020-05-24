有一些对象在我们的应用程序中其实只需要一个对象，比方说：线程池、缓存、对话框、注册表对象、日志对象、充当打印机、显卡等设备的驱动程序的对象，事实上这些类对象只能有一个实例，如果制造出多个实例，就会导致许多问题产生；
单例模式：确保一个类只有一个实例，并提供一个全局访问点。
1、如果使用多个类加载器可能导致单例失效，导致多个实例产生；
2、单例模式要私有化构造方法、一个静态方法、一个静态变量；

1、饿汉模式/即时加载（线程安全）：在类加载时创建单例对象；在调用单例方法是对象已经被实例化
public class Singleton {
    private static final Singleton sInstance = new Singleton();
    private Singleton() {
    }

    public static Singleton getsInstance() {
        return sInstance;
    }
}

2、使用静态代码块实现单例模式（线程安全）:与饿汉模式原理一致
public class Singleton {
    private static final Singleton sInstance;
    static {
        sInstance = new Singleton();
    }
    private Singleton() {
    }
    public static Singleton getsInstance() {
        return sInstance;
    }
}

3、延时加载/懒汉模式（非线程安全）:在第一次调用getsInstance方法时单例对象才被创建
public class Singleton {
    private static Singleton sInstance = null;
    private Singleton() {
    }

    public static Singleton getsInstance() {
        if (sInstance == null){
            sInstance = new Singleton();
        }
        return sInstance;
    }
}

4、改造过的延时加载/懒汉模式（线程安全）:在第一次调用getsInstance方法时单例对象才被创建
   线程安全：但每次使用单例对象都需要进入同步代码块，效率较低
public class Singleton{
    private static Singleton sInstance = null;
    private Singleton() {
    }

    /**
     *
     * @return
     */
    public static synchronized Singleton getsInstance() {
        if (sInstance == null){
            sInstance = new Singleton();
        }
        return sInstance;
    }

//    public static Singleton getsInstance() {
//        synchronized (Singleton.class){
//            if (sInstance==null){
//                sInstance = new Singleton();
//            }
//            return sInstance;
//        }
//    }
}

5、dcl双检查锁机制（线程安全）
public class Singleton {
    private static volatile Singleton sInstance = null;
    private Singleton04() {
    }

    public static Singleton getsInstance() {
        if (sInstance == null){
            synchronized (Singleton.class){
                if (sInstance == null){
                    sInstance = new Singleton();
                }
            }
        }
        return sInstance;
    }
}

6、使用静态内置类实现单例模式（线程安全）
public class Singleton {
    private Singleton() {
    }
    public static Singleton getsInstance() {
        return SingleHolder.sInstance;
    }

    private static class SingleHolder{
        private static final Singleton sInstance = new Singleton();
    }
}

7、使用静态内置类实现单例模式可以达到线程安全问题，但如果遇到序列化对象时，使用默认的方式运行得到的结果还是多例的
   单例实现了 serializable 接口，反序列化时会通过反射调用无参构造方法创建一个新的实例，这时就要重写 readResolve 方法规避序列化破坏单例
public class Singleton implements Serializable {
    private Singleton() {
    }

    public static Singleton getsInstance() {
        return SingleHolder.sInstance;
    }

    private static class SingleHolder{
        private static final Singleton sInstance = new Singleton();
    }

    /**
     * 防止反序列化，重写readResolve方法
     * @return
     * @throws ObjectStreamException
     */
    public Object readResolve() throws ObjectStreamException{
        System.out.println("readResolve");
        return SingleHolder.sInstance;
    }

    public static void main(String[] args){
        try{
            Singleton singleton = Singleton.getsInstance();
            FileOutputStream fos = new FileOutputStream(new File("obj.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(singleton);
            oos.close();
            System.out.println(singleton);//com.pattern.design.singleton.Singleton07@6d6f6e28
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(new File("obj.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Singleton singleton = (Singleton) ois.readObject();
            ois.close();
            System.out.println(singleton);//com.pattern.design.singleton.Singleton07@7699a589
        }  catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

8、 使用enum枚举数据类型实现单例模式(线程安全且防止反序列化重新创建新对象)：枚举和静态代码块的特性相似，在使用枚举时，构造方法会被自动调用
枚举在序列化的时候仅是将枚举对象的 name 属性输出到结果中，反序列化时通过 java.lang.Enum 的 valueOf 方法根据 name 查找枚举对象。同时，编译器是不允许任何对这种序列化机制的定制的，因此禁用了 writeObject、readObject、readObjectNoData、writeReplace 和 readResolve 等方法。
也就是说，枚举的反序列化不是通过反射实现的，所以不会破坏单例模式。
public enum  Singleton implements Serializable {
    sInstance;
    public static Singleton08 getsInstance() {
        return sInstance;
    }
    public static void main(String[] args){
        try{
            Singleton08 singleton = Singleton08.getsInstance();
            FileOutputStream fos = new FileOutputStream(new File("obj.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(singleton);
            oos.close();
            System.out.println(singleton);//sInstance
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(new File("obj.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Singleton08 singleton = (Singleton08) ois.readObject();
            ois.close();
            System.out.println(singleton);//sInstance
        }  catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

