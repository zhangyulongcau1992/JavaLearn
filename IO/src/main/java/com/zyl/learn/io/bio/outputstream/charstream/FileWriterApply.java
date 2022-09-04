package com.zyl.learn.io.bio.outputstream.charstream;

import java.io.FileWriter;

/**
 * ClassName:FileWriterApply
 * Package:com.zyl.learn.io.bio.outputstream.charstream
 * Description:
 *
 * @Date:2022/2/26 9:25
 * @Author:zhangyulong@qq.com
 */
public class FileWriterApply {
    public void writeSingleChar() throws Exception {
        FileWriter writer = new FileWriter("IO\\src\\aaa.txt", true);
        char output = '张';
        writer.write(output);
        writer.flush();
        writer.close();
    }

    public void writeChars() throws Exception {
        FileWriter writer = new FileWriter("IO\\src\\aaa.txt", true);
        char[] output = {'d', 'h', 'r'};
        writer.write(output);
        writer.flush();
        writer.close();
    }

    public void writeString() throws Exception {
        FileWriter writer = new FileWriter("IO\\src\\aaa.txt", true);
        String output = "张彧龙\r\n";
        writer.write(output);
        writer.flush();
        writer.close();
    }

    public static void main(String[] args) throws Exception {
        FileWriterApply apply = new FileWriterApply();
        apply.writeSingleChar();
        apply.writeString();
        apply.writeChars();
    }
}
