package com.zyl.learn.basic.generics;

/**
 * ClassName:GenericMethod
 * Package:com.zyl.learn.basic.generics
 * Description:
 *
 * @Date:2023/3/7 16:37
 * @Author:zhangyulong@qq.com
 */
public class GenericMethod {
    public static <T> T getObject(Class<T> clazz) throws Exception {
        T t = clazz.getDeclaredConstructor().newInstance();
        return t;
    }

    public static void main(String[] args) throws Exception {
        Object o = getObject(Class.forName("com.zyl.learn.basic.generics.User"));
        System.out.println(o);
        User user = getObject(User.class);
        System.out.println(user);
    }
}
class User {
    private String name = "zyl";
    private int age = 31;

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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}