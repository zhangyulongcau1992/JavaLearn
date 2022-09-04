package com.zyl.learn.io.bio.inputstream.charstream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * ClassName:InputStreamReaderApply
 * Package:com.zyl.learn.io.bio.inputstream.charstream
 * Description:
 *
 * @Date:2022/2/27 15:11
 * @Author:zhangyulong@qq.com
 */
public class InputStreamReaderApply {
    public void readSingleChar() throws Exception {
        InputStreamReader reader = new InputStreamReader(new FileInputStream("IO\\src\\ccc.txt"), "GBK");
        int in;
        while ((in = reader.read()) != -1) {
            System.out.print((char)in);
        }
        System.out.println();
        System.out.println("--------------------------");
        reader.close();
    }

    public void readChars() throws Exception {
        InputStreamReader reader = new InputStreamReader(new FileInputStream("IO\\src\\ccc.txt"), "GBK");
        char[] input = new char[5];
        int numRead = 0;
        while ((numRead = reader.read(input)) != -1) {
            System.out.print(new String(input, 0, numRead));
        }
        System.out.println();
        System.out.println("--------------------------");
        reader.close();
    }

    public static void main(String[] args) throws Exception {
        InputStreamReaderApply apply = new InputStreamReaderApply();
        apply.readSingleChar();
        apply.readChars();
    }
}
