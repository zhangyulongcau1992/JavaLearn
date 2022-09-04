package com.zyl.learn.thread.basic.state;

/**
 * ClassName:TestJoin
 * Package:com.zyl.learn.thread.state
 * Description:
 * Thread对象调用join，CPU会阻塞其他线程，优先执行调用join的线程，当调用join的线程执行完毕，其他线程从阻塞状态变为就绪状态
 *
 * @Date:2022/3/15 8:13
 * @Author:zhangyulong@qq.com
 */
public class TestJoin {
    public static class MyJoin implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "线程运行" + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyJoin myJoin = new MyJoin();
        Thread threadVip = new Thread(myJoin, "VIP");
        threadVip.start();
        for (int i = 0; i < 100; i++) {
            if (i == 50) {
                threadVip.join();
            }
            System.out.println("主线程运行" + i);
        }
    }
}
