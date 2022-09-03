package com.zyl.learn.jvm.memory.error;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Description: 模仿直接内存OutOfMemoryError
 * VM Args: -Xmx20M -XX:MaxDirectMemorySize=10M
 * 报错： java.lang.OutOfMemoryError
 */
public class DirectMemoryOOM {
    private static final int _1MB = 1024 * 1024;
    public static void main(String[] args) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe usafe = (Unsafe) unsafeField.get(null);
        while (true) {
            usafe.allocateMemory(_1MB);
        }
    }
}
