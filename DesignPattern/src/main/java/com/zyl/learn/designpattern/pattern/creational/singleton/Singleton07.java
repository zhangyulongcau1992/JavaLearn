package com.zyl.learn.designpattern.pattern.creational.singleton;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Singleton07 {

    private Singleton07() {}
    private static class InnerClass {
        private final static Singleton07 INSTANCE = new Singleton07();
    }
    public static Singleton07 getInstance() {
        return InnerClass.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton07.getInstance().hashCode());
                }
            }).start();
        }
    }
}
