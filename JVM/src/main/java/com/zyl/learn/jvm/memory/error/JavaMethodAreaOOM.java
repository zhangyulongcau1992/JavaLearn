package com.zyl.learn.jvm.memory.error;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Description: 模仿方法区OutOfMemoryError
 * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M 要求JDK版本：JDK7或以下
 * VM Args: -XX:MetaspaceSize=10M -XX:MaxMetaspaceSize=10M 要求JDK版本：JDK8或以上
 * 报错： java.lang.OutOfMemoryError
 */
public class JavaMethodAreaOOM {
    static class OOMObject {

    }
    public static void main(String[] args) {
        while (true) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    return methodProxy.invokeSuper(o, objects);
                }
            });
            enhancer.create();
        }
    }
}
