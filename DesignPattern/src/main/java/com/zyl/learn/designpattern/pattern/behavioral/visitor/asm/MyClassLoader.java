package com.zyl.learn.designpattern.pattern.behavioral.visitor.asm;

/**
 * ClassName:MyClassLoader
 * Package:com.zyl.learn.designpattern.pattern.behavioral.visitor.asm
 * Description:
 *
 * @Date:2022/7/8 21:23
 * @Author:zhangyulong@qq.com
 */
public class MyClassLoader extends ClassLoader {
    public Class defineClass(String name, byte[] b) {
        return defineClass(name, b, 0, b.length);
    }
}
