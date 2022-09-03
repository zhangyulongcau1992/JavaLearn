package com.zyl.learn.basic.exception;

/**
 * ClassName:Demo1
 * Package:com.zyl.learn.basic.exception
 * Description:
 *
 * @Date:2022/8/4 15:41
 * @Author:zhangyulong@qq.com
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
        try…catch…finally中的return只要能执行，就都执行了，他们共同向同一个内存地址写入返回值，
        后执行的将覆盖先执行的数据，而真正被调用者取的返回值就是最后一次写入的
        */
        System.out.println(test1());
        System.out.println(test2());

        //finally中的return会抑制（消灭）前面try或者catch块中的异常
        try {
            test3();
            System.out.println("没有捕捉到异常");
        } catch (Exception e) {
            System.out.println("捕捉到异常");
        }

        //finally中的异常会覆盖（消灭）前面try或者catch中的异常
        try {
            test4();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕捉到try中异常");
        } catch (ArithmeticException e) {
            System.out.println("捕捉到finally中异常");
        }
    }

    public static int test1() {
        try {
            int i = 1 / 0;
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static int test2() {
        try {
            int i = 1 / 0;
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            try {
                int i = 1 / 0;
                return 3;
            } catch (Exception e) {
                return 4;
            }
        }
    }

    public static int test3() {
        try {
            int i = 1 / 0;
            return 1;
        } finally {
            return 2;
        }
    }

    public static void test4() {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } finally {
            throw new ArithmeticException();
        }
    }
}
