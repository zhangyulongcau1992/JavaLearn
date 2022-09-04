package com.zyl.learn.designpattern.pattern.creational.singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用！
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 */
public class Singleton01 {
    private static final Singleton01 INSTANCE = new Singleton01();
    private Singleton01() {}
    public static Singleton01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton01.getInstance().hashCode());
                }
            }).start();
        }
    }
}
