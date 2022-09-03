package com.zyl.learn.io.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * ClassName:IOUtils
 * Package:com.zyl.learn.io.utils
 * Description:
 *
 * @Date:2022/2/19 14:26
 * @Author:zhangyulong@qq.com
 */
public class IOUtils {
    public enum Code {
        UTF_8("UTF-8"), GBK("GBK"), UNICODE("UNICODE"), UTF_16BE("UTF_16BE");
        private final String code;
        Code(String code) {
            this.code = code;
        }
    }
    public static Code getCode(String fileName) throws Exception {
        BufferedInputStream bin = new BufferedInputStream(new FileInputStream(fileName));
        int p = (bin.read() << 8) + bin.read();
        bin.close();
        Code code;

        switch (p) {
            case 0xefbb:
                code = Code.UTF_8;
                break;
            case 0xfffe:
                code = Code.UNICODE;
                break;
            case 0xfeff:
                code = Code.UTF_16BE;
                break;
            default:
                code = Code.GBK;
        }

        return code;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getCode("IO\\src\\aaa.txt"));
    }
}
