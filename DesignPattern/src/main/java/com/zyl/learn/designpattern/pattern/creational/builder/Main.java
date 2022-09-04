package com.zyl.learn.designpattern.pattern.creational.builder;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.creational.builder
 * Description:
 *
 * @Date:2022/7/11 20:53
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Person.PersonBuilder()
                .basicInfo(1, "zhangsan", 18)
                .height(178.5)
                .weight(90)
                .loc("beijing", "23")
                .build();

        System.out.println(p);

        String output = new StringBuilder().append("a").append("b").append("c").toString();
        System.out.println(output);
    }
}
