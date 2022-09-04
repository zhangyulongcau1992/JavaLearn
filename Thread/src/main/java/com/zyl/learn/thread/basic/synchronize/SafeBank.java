package com.zyl.learn.thread.basic.synchronize;

/**
 * ClassName:SafeBank
 * Package:com.zyl.learn.thread.synchronize
 * Description:
 *
 * @Date:2022/3/15 15:24
 * @Author:zhangyulong@qq.com
 */
public class SafeBank {
    static class Account {
        public String name;
        public int balance;
        public Account(String name, int balance) {
            this.name = name;
            this.balance = balance;
        }
    }

    static class DrawingMoney extends Thread {
        private int drawing;
        private Account account;
        private String name;
        public DrawingMoney(Account account, int drawing, String name) {
            this.drawing = drawing;
            this.account = account;
            this.name = name;
        }

        @Override
        public void run() {
            drawingMoney();
        }

        public void drawingMoney() {
            synchronized (account) {
                if (account.balance-drawing < 0) {
                    System.out.println("余额不足");
                    return;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.balance = account.balance - drawing;
                System.out.println(name + "取走了：" + drawing + ",余额为：" + account.balance);
            }
        }
    }

    public static void main(String[] args) {
        Account account = new Account("家庭收入", 10000);
        DrawingMoney father = new DrawingMoney(account, 8000, "爸爸");
        DrawingMoney mother = new DrawingMoney(account, 1500, "妈妈");
        DrawingMoney son = new DrawingMoney(account, 1500, "儿子");
        father.start();
        mother.start();
        son.start();
    }
}