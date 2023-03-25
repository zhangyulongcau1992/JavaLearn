package com.zyl.learn.basic.exception;

/**
 * ClassName:Demo2
 * Package:com.zyl.learn.basic.exception
 * Description:
 *
 * @Date:2023/2/17 16:44
 * @Author:zhangyulong@qq.com
 */
public class Demo2 {
    static void a() {
        int i = 1/0;
    }
    static void b() {
        a();
    }
    static void c() {
        b();
    }

    public static void main(String[] args) {
        c();
    }
}

