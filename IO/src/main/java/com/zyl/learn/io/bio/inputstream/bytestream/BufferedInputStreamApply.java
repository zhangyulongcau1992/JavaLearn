package com.zyl.learn.io.bio.inputstream.bytestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * ClassName:BufferedInputStreamApply
 * Package:com.zyl.learn.io.bio.inputstream.bytestream
 * Description:
 *
 * @Date:2022/2/20 9:20
 * @Author:zhangyulong@qq.com
 */
public class BufferedInputStreamApply {
    public void readSingleByte() throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("IO\\src\\bbb.txt"));
        int in = 0;
        while ((in = bis.read()) != -1) {
            System.out.print((char)in);
        }
        System.out.println();
        bis.close();
    }

    public void readBytes() throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("IO\\src\\bbb.txt"));
        byte[] arr = new byte[10];
        int numRead = 0;
        while ((numRead = bis.read(arr)) != -1) {
            System.out.print(new String(arr, 0, numRead));
        }
        bis.close();
    }

    public static void main(String[] args) throws Exception {
        BufferedInputStreamApply apply = new BufferedInputStreamApply();
        apply.readSingleByte();
        System.out.println("-------------------------------");
        apply.readBytes();
    }
}
