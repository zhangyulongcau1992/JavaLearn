package com.zyl.learn.basic.exception;

import java.io.FileNotFoundException;

/**
 * ClassName:Demo3
 * Package:com.zyl.learn.basic.exception
 * Description:
 *
 * @Date:2023/2/17 16:48
 * @Author:zhangyulong@qq.com
 */
public class Demo3 {
    static void a() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
    static void b() throws FileNotFoundException {
        a();
    }
    static void c() throws FileNotFoundException {
        b();
    }

    public static void main(String[] args) {
        try {
            c();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
