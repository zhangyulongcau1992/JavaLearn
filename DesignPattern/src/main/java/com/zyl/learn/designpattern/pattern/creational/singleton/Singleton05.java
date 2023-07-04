package com.zyl.learn.designpattern.pattern.creational.singleton;

/**
 * 懒汉式
 * 通过在方法内部加synchronized解决03线程不安全问题，虽然效率比04高，但是依然有线程不安全问题：
 * 1.第一个线程进来判断这个对象是个null，它去创建对象。
 * 2.如果第二个线程在还没有创建的时候就进来，也会卡在synchronized 这里，只有一个线程能拿到这个锁。
 * 3.第一个线程创建完后会释放锁，线程2就可以拿到这个锁了，但是线程2这个时候是卡在synchronized 这里了。
 * 4.线程2拿到锁以后还是会创建这个对象，同样破坏了单例的一个线程安全。
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
