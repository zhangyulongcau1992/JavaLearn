package com.zyl.learn.designpattern.pattern.creational.singleton;

/**
 * 使用枚举类，不仅可以解决线程同步问题，还可以防止反序列化
 */
public enum Singleton08 {
    INSTANCE;

    public void test() {

    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton08.INSTANCE.hashCode());
                }
            }).start();
        }

        Singleton08.INSTANCE.test();
    }
}
