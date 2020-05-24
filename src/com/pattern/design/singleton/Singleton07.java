package com.pattern.design.singleton;

import java.io.*;

/**
 * 使用静态代码块实现单例模式:与饿汉模式一致
 */
public class Singleton07 implements Serializable {
    private static final Singleton07 sInstance;
    static {
        sInstance = new Singleton07();
    }
    private Singleton07() {
    }

    /**
     * @return
     */
    public static Singleton07 getsInstance() {
        return sInstance;
    }

    public static void main(String[] args){
        try{
            Singleton07 singleton = Singleton07.getsInstance();
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
            Singleton07 singleton = (Singleton07) ois.readObject();
            ois.close();
            System.out.println(singleton);
        }  catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
