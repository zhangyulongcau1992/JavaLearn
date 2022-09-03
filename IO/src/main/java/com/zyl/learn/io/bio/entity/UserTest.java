package com.zyl.learn.io.bio.entity;

import java.io.Serial;
import java.io.Serializable;

/**
 * ClassName:UserTest
 * Package:com.zyl.learn.io.utils
 * Description:
 *
 * @Date:2022/2/20 21:46
 * @Author:zhangyulong@qq.com
 */
public class UserTest implements Serializable {

    /**
     * 序列化版本号ID：保证序列化的类和反序列化的类是一个类
     */
    @Serial
    private static final long serialVersionUID = 5727789442902990642L;

    String name;

    /**
     * transient修饰的属性不会被序列化
     */
    transient int age;

    /**
     * 静态成员不会被序列化
     */
    public static String country = "china";

    public UserTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
