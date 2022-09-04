package com.zyl.learn.io.bio.outputstream.bytestream;

import com.zyl.learn.io.bio.entity.StudentTest;
import com.zyl.learn.io.bio.entity.UserTest;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * ClassName:ObjectOutputStreamApply
 * Package:com.zyl.learn.io.bio.outputstream.bytestream
 * Description:
 *
 * @Date:2022/2/20 20:01
 * @Author:zhangyulong@qq.com
 */
public class ObjectOutputStreamApply {
    public void writeChars() throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IO\\src\\chars.txt"));
        oos.writeChars("zy龙");
        oos.flush();
        oos.close();
    }
    public void writeDouble() throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IO\\src\\double.txt"));
        oos.writeDouble(1.5);
        oos.flush();
        oos.close();
    }

    public void writeObject() throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IO\\src\\object.txt"));
        oos.writeObject(new UserTest("zyl", 30));
        oos.writeObject(new StudentTest("zyl", 30));
        oos.flush();
        oos.close();
    }

    public static void main(String[] args) throws Exception {
        ObjectOutputStreamApply apply = new ObjectOutputStreamApply();
        apply.writeChars();
        apply.writeDouble();
        apply.writeObject();
    }
}
