package com.zyl.learn.io.bio.outputstream.bytestream;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/**
 * ClassName:FileOutputStreamApply
 * Package:com.zyl.learn.io.bio.outputstream.bytestream
 * Description:
 *
 * @Date:2022/2/19 16:41
 * @Author:zhangyulong@qq.com
 */
public class FileOutputStreamApply {

    /*
    write(int b)写入单个字节到文件中
     */
    public void writeSingleByte() throws Exception {
        FileOutputStream fos = new FileOutputStream("IO\\src\\aaa.txt", true);
        fos.write(97);
        fos.write('b');
        fos.close();
    }

    /*
    write(byte[] b)写入byte数组的内容到文件
     */
    public void writeBytes() throws Exception {
        FileOutputStream fos = new FileOutputStream("IO\\src\\ccc.txt");
        String output = "数据和if搜集到佛物sd";
        fos.write(output.getBytes("gbk"));
        fos.close();
    }

    public static void main(String[] args) throws Exception {
        FileOutputStreamApply apply = new FileOutputStreamApply();
        apply.writeSingleByte();
        apply.writeBytes();
    }
}
