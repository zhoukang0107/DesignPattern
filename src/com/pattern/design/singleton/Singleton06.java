package com.pattern.design.singleton;

import java.io.*;

/**
 * 使用静态内置类实现单例模式可以达到线程安全问题，但如果遇到序列化对象是，使用默认的方式运行得到的结果还是多例的
 * 单例实现了 serializable 接口，反序列化时会通过反射调用无参构造方法创建一个新的实例，这时就要重写 readResolve 方法规避序列化破坏单例
 */
public class Singleton06 implements Serializable {
    private Singleton06() {
    }

    /**
     * @return
     */
    public static Singleton06 getsInstance() {
        return SingleHolder.sInstance;
    }

    private static class SingleHolder{
        private static final Singleton06 sInstance = new Singleton06();
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
            Singleton06 singleton = Singleton06.getsInstance();
            FileOutputStream fos = new FileOutputStream(new File("obj.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(singleton);
            oos.close();
            System.out.println(singleton);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(new File("obj.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Singleton06 singleton = (Singleton06) ois.readObject();
            ois.close();
            System.out.println(singleton);
        }  catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
