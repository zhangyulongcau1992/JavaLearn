package com.zyl.learn.thread.basic.threadlocal;

/**
 * ClassName:Main
 * Package:com.zyl.learn.thread.basic.threadlocal
 * Description:
 *
 * @Date:2022/7/15 16:51
 * @Author:zhangyulong@qq.com
 */
public class Main {
    static ThreadLocal<String> s1 = new ThreadLocal<>();
    static ThreadLocal<String> s2 = new ThreadLocal<>();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    String threadName = Thread.currentThread().getName();
                    s1.set(" a" + i);
                    s2.set(" b" + i);
                    System.out.println(threadName + s1.get());
                    System.out.println(threadName + s2.get());
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    String threadName = Thread.currentThread().getName();
                    s1.set(" c" + i);
                    s2.set(" d" + i);
                    System.out.println(threadName + s1.get());
                    System.out.println(threadName + s2.get());
                }

            }
        }).start();

    }

}
