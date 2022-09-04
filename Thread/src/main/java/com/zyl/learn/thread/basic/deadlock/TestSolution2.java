package com.zyl.learn.thread.basic.deadlock;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:TestSolution2
 * Package:com.zyl.learn.thread.deadlock
 * Description:
 *
 * @Date:2022/3/17 16:40
 * @Author:zhangyulong@qq.com
 */
public class TestSolution2 {
    public static class MyRunnable1 implements Runnable {
        private List<String> list1;
        private List<String> list2;
        public MyRunnable1(List<String> list1, List<String> list2) {
            this.list1 = list1;
            this.list2 = list2;
        }
        @Override
        public void run() {
            synchronized (list1) {
                list1.add("list1-myRunnable1");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (list2) {
                    list2.add("list2-myRunnable1");
                }
            }
            System.out.println("myRunnable1 end");
        }
    }

    public static class MyRunnable2 implements Runnable {
        private List<String> list1;
        private List<String> list2;
        public MyRunnable2(List<String> list1, List<String> list2) {
            this.list1 = list1;
            this.list2 = list2;
        }
        @Override
        public void run() {
            synchronized (list1) {
                list1.add("list1-myRunnable2");
                synchronized (list2) {
                    list2.add("list2-myRunnable2");
                }
            }
            System.out.println("myRunnable2 end");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        MyRunnable1 myRunnable1 = new MyRunnable1(list1, list2);
        MyRunnable2 myRunnable2 = new MyRunnable2(list1, list2);
        new Thread(myRunnable1).start();
        new Thread(myRunnable2).start();

        Thread.sleep(1000);
        System.out.println(list1);
        System.out.println(list2);
    }
}
