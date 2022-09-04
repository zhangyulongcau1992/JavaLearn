package com.zyl.learn.javaweb.jdbc.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * ClassName:CommonUtils
 * Package:com.zyl.learn.javaweb.jdbc.utils
 * Description:
 *
 * @Date:2022/8/5 14:38
 * @Author:zhangyulong@qq.com
 */
public class CommonUtils {
    public static void safeClose(Closeable in) {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void safeClose(AutoCloseable in) {
        if (in != null) {
            try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
