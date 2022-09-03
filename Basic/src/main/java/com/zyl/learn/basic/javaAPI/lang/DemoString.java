package com.zyl.learn.basic.javaAPI.lang;

import java.util.Arrays;

public class DemoString {
    public static void main(String[] args) {
        /* 1、字符串初始化 */
        System.out.println("第一个字符串：" + new String());//第一个字符串：
        System.out.println("第二个字符串：" + new String(new char[]{'a','b','c'}));//第二个字符串：abc
        System.out.println("第三个字符串：" + new String(new byte[]{97,98,99}));;//第三个字符串：abc
        System.out.println("第四个字符串：" + new String("abc"));//第四个字符串：abc

        /* 2、字符串地址比较，参考网址： https://www.jianshu.com/p/cf78e68e3a99 */
        compare1();
        compare2();
        compare3();

        /* 3、字符串内容比较:equals、equalsIgnoreCase */
        System.out.println("abc".equals(new String("abc")));//true
        System.out.println("ABC".equalsIgnoreCase(new String("abc")));//true

        /* 4、字符串获取方法：length、charAt、indexOf、lastIndexOf、concat*/
        System.out.println("hello树先生".length());//8
        System.out.println("hello树先生".charAt(1));//e
        System.out.println("hello树先生".indexOf("lo"));//3
        System.out.println("hello树先生".indexOf("hh"));//-1
        System.out.println("hello树先生".lastIndexOf("l"));//3
        System.out.println("hello树先生".concat("world"));//hello树先生world

        /* 5、字符串的截取：subString */
        System.out.println("hello树先生".substring(2));//llo树先生
        System.out.println("hello树先生".substring(2,4));//ll

        /* 6、字符串转换方法：toCharArray、getBytes、replace */
        System.out.println(Arrays.toString("hello树先生".toCharArray()));//[h, e, l, l, o, 树, 先, 生]
        System.out.println(Arrays.toString("hello树先生".getBytes()));//[104, 101, 108, 108, 111, -26, -96, -111, -27, -123, -120, -25, -108, -97]
        System.out.println("hello树先生".replace("hello","HELLO"));//HELLO树先生

        /* 7、字符串分割方法：split，其参数为正则表达式 */
        String[] stringArray = "a,b,c".split(",");
        System.out.println(Arrays.toString(stringArray));//[a, b, c]
        System.out.println(Arrays.toString("a.b.c".split(".")));//[]
        System.out.println(Arrays.toString("a.b.c".split("\\.")));//[a, b, c]
    }
    public static void compare1(){
        String str1 = "人工智能";
        String str2 = new String("人工智能");
        System.out.println(str1==str2);//false
        str2 = str2.intern();
        System.out.println(str1==str2);//true
    }
    public static void compare2(){
        String str = new String("计算机");
        System.out.println(str==str.intern());//false
    }
    public static void compare3(){
        String str1 = new String("软件");
        String str2 = new String("工程师");
        String str3 = str1+str2;
        System.out.println(str3==str3.intern());//JDK7.0及以上为true，JDK6.0及以下为false
    }
}
