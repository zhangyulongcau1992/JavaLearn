package com.zyl.learn.basic.javaAPI.util;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        /* 1、Scanner对象初始化，参数System.in代表键盘输入 */
        Scanner sc = new Scanner(System.in);
        try {
            /* 2、接收键盘输入的整形数字，如果输入的不是整形数字则运行报错 */
            int num = sc.nextInt();
            System.out.println("输入的数字为：" + num);

            /* 3、接收键盘输入的字符串 */
            String str = sc.next();
            System.out.println("输入的字符串为：" + str);

        }catch(Exception e){
            System.out.println("输入数据异常:");
            e.printStackTrace();
            System.out.println("e.getMessage="+e.getMessage());
            System.out.println("e="+e);
        }
    }
}
