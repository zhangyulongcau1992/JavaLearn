package com.zyl.learn.thread.basic.communication;

/**
 * ClassName:ProducerConsumer
 * Package:com.zyl.learn.thread.basic.communication
 * Description:
 *
 * @Date:2022/3/17 17:27
 * @Author:zhangyulong@qq.com
 */
public class ProducerConsumer {
    public static class Product {
        //当前已生产的产品数量
        public int current;
        //当前剩余库存
        public int remain;
        public Product(int current, int remain) {
            this.current = current;
            this.remain = remain;
        }
    }
    public static class Producer implements Runnable {
        private Product product;
        public Producer(Product product) {
            this.product = product;
        }
        @Override
        public void run() {
            while (true) {
                synchronized (product) {
                    if (product.remain > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        product.remain--;
                        if (product.current == 0) {
                            product.notifyAll();
                        }
                        product.current++;
                        System.out.println("生产者生产1个产品，目前产品数量：" + product.current + "，剩余库存为：" + product.remain);
                    } else {
                        try {
                            product.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static class Consumer implements Runnable {
        private Product product;
        public Consumer(Product product) {
            this.product = product;
        }
        @Override
        public void run() {
            while (true) {
                synchronized (product) {
                    if (product.current > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        product.current--;
                        if (product.remain == 0) {
                            product.notifyAll();
                        }
                        product.remain++;
                        System.out.println("消费者消费1个产品，目前产品数量：" + product.current + "，剩余库存为：" + product.remain);
                    } else {
                        try {
                            product.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Product product = new Product(0,10);
        Producer producer = new Producer(product);
        Consumer consumer = new Consumer(product);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
