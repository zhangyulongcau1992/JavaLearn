package com.zyl.learn.jvm.memory.error;

/**
 * Description:模仿虚拟机栈OutOfMemoryError
 * VM Args: -Xss2M
 * 32位系统会报错： java.lang.OutOfMemoryError: unable to create native thread
 */
public class JavaVMStackOOM {
    private void dontStop() {
        while (true) {
        }
    }
    public void stackLeakByThread () {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
