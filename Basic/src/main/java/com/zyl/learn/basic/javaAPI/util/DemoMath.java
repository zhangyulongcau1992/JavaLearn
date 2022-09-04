package com.zyl.learn.basic.javaAPI.util;

public class DemoMath {
    public static void main(String[] args) {
        /* 1、取绝对值方法：abs */
        System.out.println(Math.abs(-1.2));//1.2

        /* 2、向上取整方法：ceil */
        System.out.println(Math.ceil(-1.2));//-1.0
        System.out.println(Math.ceil(3.01));//4.0

        /* 3、向下取整方法：floor */
        System.out.println(Math.floor(-1.2));//-2.0
        System.out.println(Math.floor(3.01));//3.0

        /* 4、四舍五入方法：round */
        System.out.println(Math.round(-1.2));//-1
        System.out.println(Math.round(3.51));//4

        /* 5、圆周率：PI */
        System.out.println(Math.PI);//3.141592653589793
    }
}
