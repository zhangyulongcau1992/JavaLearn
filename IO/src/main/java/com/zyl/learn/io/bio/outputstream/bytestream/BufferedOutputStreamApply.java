package com.zyl.learn.io.bio.outputstream.bytestream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/**
 * ClassName:BufferedOutputStreamApply
 * Package:com.zyl.learn.io.bio.outputstream.bytestream
 * Description:
 *
 * @Date:2022/2/20 18:53
 * @Author:zhangyulong@qq.com
 */
public class BufferedOutputStreamApply {
    public void writeSingleByte() throws Exception {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IO\\src\\bbb.txt", true));
        bos.write(97);
        bos.write('B');
        bos.flush();
        bos.close();
    }

    public void writeBytes() throws Exception {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IO\\src\\bbb.txt", true));
        bos.write("adsfdsf".getBytes(StandardCharsets.UTF_8));
        bos.flush();
        bos.close();
    }

    public static void main(String[] args) throws Exception {
        BufferedOutputStreamApply apply = new BufferedOutputStreamApply();
        apply.writeSingleByte();
        apply.writeBytes();
    }
}
