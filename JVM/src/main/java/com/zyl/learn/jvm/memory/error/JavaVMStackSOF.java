package com.zyl.learn.jvm.memory.error;

/**
 * Description:模仿虚拟机栈StackOverflowError
 * VM Args: -Xss180k
 * 报错：java.lang.StackOverflowError
 */
public class JavaVMStackSOF {
    private int satckLength = 0;
    public void stackLeak() {
        satckLength++;
        stackLeak();
    }
    public static void main(String[] args) throws Throwable{
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("Stack Length:" + oom.satckLength);
            throw e;
        }
    }
}
