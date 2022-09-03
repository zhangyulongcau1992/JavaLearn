package com.zyl.learn.designpattern.pattern.creational.singleton;

/**
 * 懒汉式
 * 双重检查，解决了03线程不安全的问题，同时效率比04高
 */
public class Singleton06 {
    private static volatile Singleton06 INSTANCE;
    private Singleton06() {}
    public static Singleton06 getInstance() {
        if (null == INSTANCE) {
            synchronized (Singleton06.class) {
                if (null == INSTANCE) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Singleton06();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton06.getInstance().hashCode());
                }
            }).start();
        }
    }
}
