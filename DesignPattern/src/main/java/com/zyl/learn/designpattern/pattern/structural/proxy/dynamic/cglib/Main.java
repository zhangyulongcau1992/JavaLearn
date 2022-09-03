package com.zyl.learn.designpattern.pattern.structural.proxy.dynamic.cglib;

import net.sf.cglib.proxy.*;

import java.lang.reflect.Method;

/**
 * Description: cglib代理的生成原理是生成目标类的子类，而子类是增强过的，这个子类对象就是代理对象。
 * 所以使用cglib要求目标类必须能够被继承，即不能是final的类。
 * cglib经常被用在框架中，如Spring、Hibernate等，它的效率高于jdk的动态代理
 * 底层实现：asm
 */
public class Main {
    public static void main(String[] args) {
        final UserService target = new UserService();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                if (method.getName().equals("test")) {
                    System.out.println("before...");

                    Object object = methodProxy.invokeSuper(o, objects);
                    //Object object = method.invoke(target, objects);//效果同上
                    //Object object = methodProxy.invoke(target, objects); //效果同上
                    //Object object = method.invoke(o, objects); //报错：java.lang.reflect.InvocationTargetException
                    //Object object = methodProxy.invokeSuper(target, objects); //报错：java.lang.ClassCastException
                    //Object object = methodProxy.invoke(o, objects); //报错：java.lang.StackOverflowError

                    System.out.println("after...");
                    return object;
                }
                return methodProxy.invokeSuper(o, objects);
            }
        });
        UserService userService = (UserService) enhancer.create();
        userService.test();

        System.out.println("---------------");
        /*
        实现方式2：类似JDK的动态代理
         */
        final UserInterface target2 = new UserService2();
        UserInterface userService2 = (UserInterface) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target2.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        if (method.getName().equals("test")) {
                            System.out.println("before...");
                            Object object = method.invoke(target2, objects);
                            System.out.println("after...");
                            return object;
                        }
                        return method.invoke(target2, objects);
                    }
                }
        );
        userService2.test();
    }
}
