package com.zyl.learn.io.bio.outputstream.charstream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * ClassName:OutputStreamWriterApply
 * Package:com.zyl.learn.io.bio.outputstream.charstream
 * Description:
 *
 * @Date:2022/2/27 15:22
 * @Author:zhangyulong@qq.com
 */
public class OutputStreamWriterApply {
    public void writeSingleChar() throws Exception {
        OutputStreamWriter writer = new OutputStreamWriter(
                new FileOutputStream("IO\\src\\ccc.txt", true), "GBK");
        writer.write("张");
        writer.flush();
        writer.close();
    }

    public void writeChars() throws Exception {
        OutputStreamWriter writer = new OutputStreamWriter(
                new FileOutputStream("IO\\src\\ccc.txt", true), "GBK");
        char[] output = {'h', 'h', 'h'};
        writer.write(output);
        writer.flush();
        writer.close();
    }

    public void writeString() throws Exception {
        OutputStreamWriter writer = new OutputStreamWriter(
                new FileOutputStream("IO\\src\\ccc.txt", true), "GBK");
        String output = "哈哈哈";
        writer.write(output);
        writer.flush();
        writer.close();
    }

    public static void main(String[] args) throws Exception {
        OutputStreamWriterApply apply = new OutputStreamWriterApply();
        apply.writeSingleChar();
        apply.writeChars();
        apply.writeString();
    }
}
