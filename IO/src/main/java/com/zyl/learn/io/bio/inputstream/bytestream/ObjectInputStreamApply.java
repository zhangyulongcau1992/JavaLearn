package com.zyl.learn.io.bio.inputstream.bytestream;

import com.zyl.learn.io.bio.entity.StudentTest;
import com.zyl.learn.io.bio.entity.UserTest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * ClassName:ObjectInputStreamApply
 * Package:com.zyl.learn.io.bio.inputstream.bytestream
 * Description:
 *
 * @Date:2022/2/20 21:28
 * @Author:zhangyulong@qq.com
 */
public class ObjectInputStreamApply {
    public void readChar() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IO\\src\\chars.txt"));
        char in;
        while (true) {
            try {
                in = ois.readChar();
                System.out.print(in);
            } catch (Exception e) {
                break;
            }
        }
        System.out.println();
        ois.close();
    }
    public void readDouble() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IO\\src\\double.txt"));
        double in = ois.readDouble();
        System.out.println(in);
        ois.close();
    }
    public void readObject() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IO\\src\\object.txt"));
        UserTest user = (UserTest) ois.readObject();
        System.out.println(user.getName() + "  " + user.getAge());
        StudentTest student = (StudentTest) ois.readObject();
        System.out.println(student.getStuName() + "  " + student.getStuAge());
        ois.close();
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStreamApply apply = new ObjectInputStreamApply();
        apply.readChar();
        apply.readDouble();
        apply.readObject();
    }
}
