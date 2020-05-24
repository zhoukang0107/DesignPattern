package com.pattern.design.singleton;

import java.io.*;

/**
 * 使用enum枚举数据类型实现单例模式：
 * 枚举和静态代码块的特性相似，在使用枚举时，构造方法会被自动调用
 * 而枚举在序列化的时候仅是将枚举对象的 name 属性输出到结果中，反序列化时通过 java.lang.Enum 的 valueOf 方法根据 name 查找枚举对象。同时，编译器是不允许任何对这种序列化机制的定制的，因此禁用了 writeObject、readObject、readObjectNoData、writeReplace 和 readResolve 等方法。
 * 也就是说，枚举的反序列化不是通过反射实现的，所以不会破坏单例模式。
 */
public enum  Singleton08 implements Serializable {
    sInstance;

    /**
     * @return
     */
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
            System.out.println(singleton);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(new File("obj.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Singleton08 singleton = (Singleton08) ois.readObject();
            ois.close();
            System.out.println(singleton);
        }  catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
