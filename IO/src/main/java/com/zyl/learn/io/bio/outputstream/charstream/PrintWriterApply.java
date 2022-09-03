package com.zyl.learn.io.bio.outputstream.charstream;

import com.zyl.learn.io.bio.outputstream.bytestream.PrintStreamApply;

import java.io.PrintWriter;

/**
 * ClassName:PrintWriterApply
 * Package:com.zyl.learn.io.bio.outputstream.charstream
 * Description:
 *
 * @Date:2022/2/27 15:06
 * @Author:zhangyulong@qq.com
 */
public class PrintWriterApply {
    public void print() throws Exception {
        PrintWriter out = new PrintWriter("IO\\src\\aaa.txt");
        out.println(97);
        out.println(true);
        out.println(3.14);
        out.println('a');
        out.println("hhh");
        out.flush();
        out.close();
    }

    public static void main(String[] args) throws Exception {
        PrintWriterApply apply = new PrintWriterApply();
        apply.print();
    }
}
