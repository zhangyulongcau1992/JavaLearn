package com.zyl.learn.io.bio.outputstream.charstream;

import com.zyl.learn.io.bio.inputstream.charstream.BufferedReaderApply;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * ClassName:BufferedWriterApply
 * Package:com.zyl.learn.io.bio.outputstream.charstream
 * Description:
 *
 * @Date:2022/2/26 15:07
 * @Author:zhangyulong@qq.com
 */
public class BufferedWriterApply {
    public void writeSingleChar() throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter("IO\\src\\aaa.txt", true));
        char output = '哈';
        writer.write(output);
        writer.flush();
        writer.close();
    }

    public void writeChars() throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter("IO\\src\\aaa.txt", true));
        char[] output = {'h', 'h', 'h'};
        writer.write(output);
        writer.flush();
        writer.close();
    }

    public void writeString() throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter("IO\\src\\aaa.txt", true));
        String output = "哈哈哈";
        writer.write(output);
        writer.newLine(); // 写入一个换行符，对于Windows为\r\n，对于linux为\n
        writer.flush();
        writer.close();
    }

    public static void main(String[] args) throws Exception {
        BufferedWriterApply apply = new BufferedWriterApply();
        apply.writeSingleChar();
        apply.writeChars();
        apply.writeString();
    }
}
