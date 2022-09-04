package com.zyl.learn.io.bio.inputstream.bytestream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ClassName:FileInputStreamApply
 * Package:com.zyl.learn.io.bio.inputstream.bytestream
 * Description:
 *
 * @Date:2022/2/13 20:01
 * @Author:zhangyulong@qq.com
 */
public class FileInputStreamApply {

    //每次从文件读取的字节数
    private final static int ARR_LENGTH = 10;

    //假设每个中文字符的UTF-8编码都是3个字节（4个字节的中文字符平时使用很少）
    private final static int UTF8_LENGTH = 3;

    //每个中文字符的GBK编码为2个字节
    private final static int GBK_LENGTH = 2;

    /**
     * read():读取单个字节，返回字符值（int类型），如果遇到文件末尾返回-1
     */
    public void readSingleByte() {
        FileInputStream input = null;
        try {
            //IDEA的默认根目录是在它的Project工程下,相当于eclipse的工作空间下
            input = new FileInputStream("IO\\src\\bbb.txt");
            int in = 0;
            while ((in = input.read()) != -1) {
                System.out.print((char) in);
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    /**
     * read(byte[] b):读取文件内容到byte数组，返回读取个数，遇到文件末尾返回-1
     */
    public void readBytes() {
        FileInputStream input = null;
        try {
            //IDEA的默认根目录是在它的Project工程下,相当于eclipse的工作空间下
//            String fileName = "IO\\src\\aaa.txt";
//            int chLength = UTF8_LENGTH;
            String fileName = "IO\\src\\ccc.txt";
            int chLength = GBK_LENGTH;

            input = new FileInputStream(fileName);
            byte[] arr = new byte[ARR_LENGTH];
            byte[] output = new byte[ARR_LENGTH + chLength];
            byte[] notWrite = new byte[chLength];
            int notWriteNum = 0;
            int numRead;
            while ((numRead = input.read(arr)) != -1) {

                for (int i = 0; i < notWriteNum; i++) {
                    output[i] = notWrite[i];
                }
                for (int i = 0; i < numRead; i++) {
                    output[i + notWriteNum] = arr[i];
                }

                int outputActLength = notWriteNum + numRead;
                int notWriteNumTemp = 0;
                if (output[outputActLength - 1] < 0){
                    for (int i = outputActLength - 1; i >= 0; i--) {
                        if (output[i] > 0) {
                            notWriteNumTemp = (outputActLength -1 -i) % chLength;
                            break;
                        }
                        if ( i == 0 && output[i] < 0) {
                            notWriteNumTemp = outputActLength % chLength;
                        }
                    }
                }

                System.out.print(new String(output, 0, outputActLength - notWriteNumTemp,
                        chLength == UTF8_LENGTH ? "utf-8" : "GBK"));
                for (int i = 0; i < notWriteNumTemp; i++) {
                    notWrite[i] = output[i + outputActLength - notWriteNumTemp];
                }
                notWriteNum = notWriteNumTemp;
            }
            System.out.println();
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        FileInputStreamApply apply = new FileInputStreamApply();
        apply.readSingleByte();
        System.out.println("--------------------------");
        apply.readBytes();
    }
}
