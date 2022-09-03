package com.zyl.learn.designpattern.pattern.creational.singleton;

/**
 * 懒汉式
 * 通过在方法加synchronized解决03线程不安全问题，单也带来效率下降
 */
public class Singleton04 {
    private static Singleton04 INSTANCE;
    private Singleton04() {}
    public static synchronized Singleton04 getInstance() {
        if (null == INSTANCE) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton04.getInstance().hashCode());
                }
            }).start();
        }
    }
}
