package com.zyl.learn.jvm.memory.error;

import java.util.HashSet;
import java.util.Set;

/**
 * Description: 模仿运行时常量池OutOfMemoryError
 * VM Args: -Xmx6m
 * 报错： java.lang.OutOfMemoryError: Java heap space
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
