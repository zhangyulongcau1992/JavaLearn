package com.zyl.learn.javaweb.jdbc.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ClassName:PropertiesReader
 * Package:com.zyl.learn.javaweb.jdbc.utils
 * Description:
 *
 * @Date:2022/8/5 14:11
 * @Author:zhangyulong@qq.com
 */
public class PropertiesReader {
    public static Properties readProperties(String fileName) {
        Properties properties = new Properties();
        InputStream in = null;
        try {
            in = PropertiesReader.class.getClassLoader().getResourceAsStream(fileName);
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            CommonUtils.safeClose(in);
        }
        return properties;
    }
}
