package com.zyl.learn.designpattern.pattern.creational.singleton;

/**
 * 懒汉式
 * 通过在方法内部加synchronized解决03线程不安全问题，虽然效率比04高，但是依然有线程不安全问题
 */
public class Singleton05 {
    private static Singleton05 INSTANCE;
    private Singleton05() {}
    public static Singleton05 getInstance() {
        if (null == INSTANCE) {
            synchronized (Singleton05.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Singleton05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton05.getInstance().hashCode());
                }
            }).start();
        }
    }
}
