package com.zyl.learn.thread.basic.apply;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName:PrintTime
 * Package:com.zyl.learn.thread.apply
 * Description:
 *
 * @Date:2022/3/14 21:02
 * @Author:zhangyulong@qq.com
 */
public class PrintTime implements Runnable{
    @Override
    public void run() {
        Date time = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:MM:ss");
        for (int i = 0; i < 30; i++) {
            System.out.println(sdf.format(time));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            time = new Date();
        }
    }

    public static void main(String[] args) {
        new Thread(new PrintTime()).start();
    }
}
