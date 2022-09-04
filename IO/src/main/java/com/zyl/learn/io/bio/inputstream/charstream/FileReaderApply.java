package com.zyl.learn.io.bio.inputstream.charstream;

import java.io.FileReader;

/**
 * ClassName:FileReaderApply
 * Package:com.zyl.learn.io.bio.inputstream.charstream
 * Description:
 *
 * @Date:2022/2/24 21:11
 * @Author:zhangyulong@qq.com
 */
public class FileReaderApply {
    public void readSingleChar() throws Exception {
        FileReader reader = new FileReader("IO\\src\\aaa.txt");
        int in;
        while((in = reader.read()) != -1) {
            System.out.print((char)in);
        }
        System.out.println();
        System.out.println("------------------------");
        reader.close();
    }

    public void readChars() throws Exception {
        FileReader reader = new FileReader("IO\\src\\aaa.txt");
        char[] input = new char[10];
        int numRead =0;
        while ((numRead = reader.read(input)) != -1) {
            System.out.print(new String(input, 0, numRead));
        }
        System.out.println();
        System.out.println("------------------------");
        reader.close();
    }

    public static void main(String[] args) throws Exception {
        FileReaderApply apply = new FileReaderApply();
        apply.readSingleChar();
        apply.readChars();
    }
}
