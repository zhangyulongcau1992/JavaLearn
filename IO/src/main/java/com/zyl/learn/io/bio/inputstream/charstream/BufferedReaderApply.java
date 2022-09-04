package com.zyl.learn.io.bio.inputstream.charstream;

import com.zyl.learn.io.bio.outputstream.bytestream.BufferedOutputStreamApply;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * ClassName:BufferedReaderApply
 * Package:com.zyl.learn.io.bio.inputstream.charstream
 * Description:
 *
 * @Date:2022/2/26 14:46
 * @Author:zhangyulong@qq.com
 */
public class BufferedReaderApply {
    public void readSingleChar() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("IO\\src\\aaa.txt"));
        int in;
        while ((in = reader.read()) != -1) {
            System.out.print((char)in);
        }
        System.out.println();
        System.out.println("------------------------");
        reader.close();
    }

    public void readChars() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("IO\\src\\aaa.txt"));
        char[] in = new char[10];
        int numRead = 0;
        while ((numRead = reader.read(in)) != -1) {
            System.out.print(new String(in, 0, numRead));
        }
        System.out.println();
        System.out.println("------------------------");
        reader.close();
    }

    public void readLine() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("IO\\src\\aaa.txt"));
        String in;
        while ((in = reader.readLine()) != null) {
            System.out.println(in);
        }
        System.out.println("------------------------");
        reader.close();
    }

    public static void main(String[] args) throws Exception {
        BufferedReaderApply apply = new BufferedReaderApply();
        apply.readSingleChar();
        apply.readChars();
        apply.readLine();
    }
}
