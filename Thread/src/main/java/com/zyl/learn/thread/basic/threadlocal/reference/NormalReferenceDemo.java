package com.zyl.learn.thread.basic.threadlocal.reference;

public class NormalReferenceDemo {
    public static void main(String[] args) throws InterruptedException {
        M m = new M();
        System.out.println("第一次GC");
        System.gc();
        Thread.sleep(500);

        m = null;
        System.out.println("第二次GC");
        System.gc();
        Thread.sleep(500);//阻塞Main线程（如果Main线程退出，JVM也会退出，垃圾回收线程跟着退出）
    }
}
