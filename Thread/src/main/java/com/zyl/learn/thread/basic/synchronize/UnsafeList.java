package com.zyl.learn.thread.basic.synchronize;

import java.util.ArrayList;

/**
 * ClassName:UnsafeList
 * Package:com.zyl.learn.thread.synchronize
 * Description:
 *
 * @Date:2022/3/15 15:46
 * @Author:zhangyulong@qq.com
 */
public class UnsafeList {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                list.add(Thread.currentThread().getName());
            }).start();
        }
        Thread.sleep(5000);
        System.out.println("集合的个数是：" + list.size());
    }
}
