package com.zyl.learn.jvm.memory.error;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:模仿堆内存OutOfMemoryError
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=.\HeapOOM.hprof
 * 报错： java.lang.OutOfMemoryError: Java heap space
 */
public class HeapOOM {
    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while(true) {
            list.add(new OOMObject());
        }
    }
}
