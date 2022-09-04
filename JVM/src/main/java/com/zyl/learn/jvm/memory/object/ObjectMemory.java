package com.zyl.learn.jvm.memory.object;
import org.openjdk.jol.info.ClassLayout;
/**
 * ClassName:ObjectMemory
 * Package:com.zyl.jvm.memory.object
 * Description:
 *
 * @Date:2022/4/10 8:32
 * @Author:zhangyulong@qq.com
 */
public class ObjectMemory {
    private static class T {
        double d;
        int i;
        boolean b;
        String s = "zyl";
        float f;
        byte aByte;
        short aShort;
        long l;
        char c;
    }

    public static void main(String[] args) {
        final T t = new T();
        //System.out.println(t.hashCode());
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (t) {
                    System.out.println(ClassLayout.parseInstance(t).toPrintable());
                }
            }
        }).start();
        System.out.println(ClassLayout.parseInstance(t).toPrintable());
        synchronized (t) {
            System.out.println(ClassLayout.parseInstance(t).toPrintable());
        }
        System.out.println(ClassLayout.parseInstance(t).toPrintable());
    }
}
