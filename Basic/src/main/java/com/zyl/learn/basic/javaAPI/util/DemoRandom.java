package com.zyl.learn.basic.javaAPI.util;

import java.util.Random;

public class DemoRandom {
    public static void main(String[] args) {
        Random random = new Random();

        try {
            /* 1、在int范围内生成随机数 */
            int num1 = random.nextInt();
            System.out.println("随机数字为：" + num1);

            /* 2、在[0，bound)范围内生成随机数 */
            int num2 = random.nextInt(5);
            System.out.println("[0,5)中的随机数：" + num2);

            /* 3、在[a，a+bound)范围内生成随机数 */
            int a = -10;
            int num3 = random.nextInt(20) + a;
            System.out.println("[-10,10)中的随机数：" + num3);

            /* 4、bound为负数或0时，运行报错 */
            int num4 = random.nextInt(0);

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("e.getMessage="+e.getMessage());
            System.out.println("e="+e);
        }
    }
}
