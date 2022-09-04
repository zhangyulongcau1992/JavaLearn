package com.zyl.learn.io.bio.outputstream.bytestream;

import java.io.PrintStream;

/**
 * ClassName:PrintStreamApply
 * Package:com.zyl.learn.io.bio.outputstream.bytestream
 * Description:
 *
 * @Date:2022/2/27 14:27
 * @Author:zhangyulong@qq.com
 */
public class PrintStreamApply {
    public void print() throws Exception {
        PrintStream out = new PrintStream("IO\\src\\aaa.txt");
        out.println(97);
        out.println(true);
        out.println(3.14);
        out.println('a');
        out.println("hhh");
        out.flush();
        out.close();
    }

    public static void main(String[] args) throws Exception {
        PrintStreamApply apply = new PrintStreamApply();
        apply.print();
    }
}
