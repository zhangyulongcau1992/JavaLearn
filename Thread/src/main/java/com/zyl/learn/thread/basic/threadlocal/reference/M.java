package com.zyl.learn.thread.basic.threadlocal.reference;

/**
 * ClassName:M
 * Package:com.zyl.learn.thread.basic.threadlocal.reference
 * Description:
 *
 * @Date:2022/7/15 17:27
 * @Author:zhangyulong@qq.com
 */
public class M {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
    }
}
