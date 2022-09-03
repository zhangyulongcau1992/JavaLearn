package com.zyl.learn.jvm.clazz.structure;

/**
 * ClassName:ExceptionImplement
 * Package:com.zyl.jvm.clazz.structure
 * Description:
 *
 * @Date:2022/2/1 17:12
 * @Author:zhangyulong@qq.com
 */
public class ExceptionImplement {
    public int inc () {
        int x;
        try {
            x = 1;;
            return x;

        } catch (Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
        }
    }
}
/**
Classfile /D:/Java学习/idea_projects/JVM/src/com/zyl/jvm/clazz/structure/ExceptionImplement.class
Last modified 2022-2-1; size 466 bytes
        MD5 checksum 74a10bb02f5ea32b2d4f5b1735826ea4
        Compiled from "ExceptionImplement.java"
public class com.zyl.jvm.clazz.structure.ExceptionImplement
        SourceFile: "ExceptionImplement.java"
        minor version: 0
        major version: 61
        flags: ACC_PUBLIC, ACC_SUPER
        Constant pool:
        #1 = Methodref          #2.#3          //  java/lang/Object."<init>":()V
        #2 = Class              #4             //  java/lang/Object
        #3 = NameAndType        #5:#6          //  "<init>":()V
        #4 = Utf8               java/lang/Object
        #5 = Utf8               <init>
   #6 = Utf8               ()V
           #7 = Class              #8             //  java/lang/Exception
           #8 = Utf8               java/lang/Exception
           #9 = Class              #10            //  com/zyl/jvm/clazz/structure/ExceptionImplement
           #10 = Utf8               com/zyl/jvm/clazz/structure/ExceptionImplement
           #11 = Utf8               Code
           #12 = Utf8               LineNumberTable
           #13 = Utf8               inc
           #14 = Utf8               ()I
           #15 = Utf8               StackMapTable
           #16 = Class              #17            //  java/lang/Throwable
           #17 = Utf8               java/lang/Throwable
           #18 = Utf8               SourceFile
           #19 = Utf8               ExceptionImplement.java
           {
public com.zyl.jvm.clazz.structure.ExceptionImplement();
        flags: ACC_PUBLIC
        Code:
        stack=1, locals=1, args_size=1
        0: aload_0
        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
        4: return
        LineNumberTable:
        line 11: 0

public int inc();
        flags: ACC_PUBLIC
        Code:
        stack=1, locals=5, args_size=1
        0: iconst_1
        1: istore_1
        2: iload_1
        3: istore_2
        4: iconst_3
        5: istore_1
        6: iload_2
        7: ireturn
        8: astore_2
        9: iconst_2
        10: istore_1
        11: iload_1
        12: istore_3
        13: iconst_3
        14: istore_1
        15: iload_3
        16: ireturn
        17: astore        4
        19: iconst_3
        20: istore_1
        21: aload         4
        23: athrow
        Exception table:
        from    to  target type
        0     4     8   Class java/lang/Exception
        0     4    17   any
        8    13    17   any
        17    19    17   any
        LineNumberTable:
        line 15: 0
        line 16: 2
        line 21: 4
        line 16: 6
        line 17: 8
        line 18: 9
        line 19: 11
        line 21: 13
        line 19: 15
        line 21: 17
        line 22: 21
        StackMapTable: number_of_entries = 2
        frame_type = 72
        stack = [ class java/lang/Exception ]
        frame_type = 72
        stack = [ class java/lang/Throwable ]

}

*/