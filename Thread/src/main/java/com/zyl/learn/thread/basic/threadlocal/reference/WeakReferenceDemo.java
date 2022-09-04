package com.zyl.learn.thread.basic.threadlocal.reference;

import java.lang.ref.WeakReference;

/**
 * ClassName:WeakReferenceDemo
 * Package:com.zyl.learn.thread.basic.threadlocal.reference
 * Description:
 *
 * @Date:2022/7/15 19:07
 * @Author:zhangyulong@qq.com
 */
public class WeakReferenceDemo {
    public static void main(String[] args) throws InterruptedException {
        WeakReference<M> weakReference = new WeakReference<>(new M());
        System.out.println(weakReference.get());

        System.out.println("第一次主动GC");
        System.gc();
        Thread.sleep(500);
        System.out.println(weakReference.get());

    }
}
