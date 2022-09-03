package com.zyl.learn.designpattern.pattern.structural.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description: 使用JDK的动态代理，要求目标类与代理类实现相同的接口。
 * 若目标类不存在接口，则无法使用该方式实现。
 * 底层实现：asm
 */
public class Main {
    public static void main(String[] args) {
        final UserInterface realUserService = new UserService();
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        UserInterface userService = (UserInterface) Proxy.newProxyInstance(
                realUserService.getClass().getClassLoader(), realUserService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                if (method.getName().equals("test")) {
                    System.out.println("before...");
                    Object object = method.invoke(realUserService, objects);
                    System.out.println("after...");
                    return object;
                }
                return method.invoke(realUserService, objects);
            }
        });
        userService.test();
    }
}
