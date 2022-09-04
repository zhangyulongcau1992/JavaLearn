package com.zyl.learn.basic.helloWorld;

import java.io.UnsupportedEncodingException;

public class HelloWorld {
    public HelloWorld(){
        return;
    }
    public static void main(String[] args) throws UnsupportedEncodingException {
        Double a = 1.1000000000000000000000000001;
        Double b = 1.1000000000000000000000000002;
        System.out.println(a);//1.1
        System.out.println(b);//1.1
        System.out.println(a==b?"equal":"not equal");//not equal
        System.out.println(a.equals(b)?"equal":"not equal");//equal
        System.out.println(a.compareTo(b));//0

        double aa = 1.1000000000000000000000000001;
        double bb = 1.1000000000000000000000000002;
        System.out.println(aa==bb?"equal":"not equal");//equal

        String q = "h哈";
        System.out.println(q.getBytes("gbk").length);//3
        System.out.println(q.getBytes().length);//4
        System.out.println("系统默认编码方式：" + System.getProperty("file.encoding"));//系统默认编码方式：UTF-8

        int aaa =0;
        if(1<2 || (aaa=1)<2){
            System.out.println(aaa);//0
        }
        if(1<2 | (aaa=2)<2){
            System.out.println(aaa);//2
        }
    }
}

/*
一个类文件中只能有一个public修饰的class，且该class必须与类文件同名
顶层类（非内部类），只能用public或者（default）来修饰
 */
class OtherClass{
    private class InnerClass{

    }

}