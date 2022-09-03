package com.zyl.learn.designpattern.pattern.creational.singleton;

/**
 * 饿汉式
 * 跟01是一个意思
 */
public class Singleton02 {
    private static final Singleton02 INSTANCE;
    static {
        INSTANCE = new Singleton02();
    }
    private Singleton02() {}
    public static Singleton02 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton02.getInstance().hashCode());
                }
            }).start();
        }
    }
}
