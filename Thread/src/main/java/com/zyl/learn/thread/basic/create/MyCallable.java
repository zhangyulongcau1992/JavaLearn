package com.zyl.learn.thread.basic.create;

import java.util.concurrent.*;

/**
 * ClassName:MyCallable
 * Package:com.zyl.learn.thread.create
 * Description:优点：1、可以定义返回值 2、可以抛出异常
 *
 * @Date:2022/3/13 9:24
 * @Author:zhangyulong@qq.com
 */
public class MyCallable implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        System.out.println("myCallable start:" + Thread.currentThread().getName());
        Thread.sleep(2000);
        System.out.println("myCallable end:" + Thread.currentThread().getName());
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable callable = new MyCallable();
        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<Boolean> submit1 = service.submit(callable);
        Future<Boolean> submit2 = service.submit(callable);
        Future<Boolean> submit3 = service.submit(callable);
        System.out.println(submit1.get());
        System.out.println(submit2.get());
        System.out.println(submit3.get());
        service.shutdown();
    }
}
