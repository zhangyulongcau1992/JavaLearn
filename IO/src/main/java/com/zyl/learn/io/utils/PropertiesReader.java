package com.zyl.learn.io.utils;

import java.io.*;
import java.util.Locale;
import java.util.Properties;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * ClassName:PropertiesReader
 * Package:com.zyl.learn.io.utils
 * Description:
 *
 * @Date:2022/8/5 11:26
 * @Author:zhangyulong@qq.com
 */
public class PropertiesReader {

    //1、基于ClassLoader的getResourceAsStream方法读取配置文件
    public static Properties readProperties1(String fileName) {
        Properties properties = new Properties();
        InputStream in = null;
        try {
            in = PropertiesReader.class.getClassLoader().getResourceAsStream(fileName);
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            safeClose(in);
        }
        return properties;
    }

    private static void safeClose(InputStream in) {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //2、基于Class的getResourceAsStream()方法读取配置文件
    public static Properties readProperties2(String fileName) throws IOException {
        Properties properties = new Properties();
        InputStream in = PropertiesReader.class.getResourceAsStream(fileName);
        properties.load(in);
        return properties;
    }

    //3、基于ClassLoader类的getSystemResourceAsStream()静态方法读取配置文件
    public static Properties readProperties3(String fileName) throws IOException {
        Properties properties = new Properties();
        InputStream in = ClassLoader.getSystemResourceAsStream(fileName);
        properties.load(in);
        return properties;
    }

    //4、基于 FileInputStream 读取配置文件
    public static Properties readProperties4(String fileName) throws IOException {
        Properties properties = new Properties();
        InputStream in = new BufferedInputStream(new FileInputStream(fileName));
        properties.load(in);
        return properties;
    }

    //5、基于 FileReader 读取配置文件
    public static Properties readProperties5(String fileName) throws IOException {
        Properties properties = new Properties();
        Reader in = new BufferedReader(new FileReader(fileName));
        properties.load(in);
        return properties;
    }

    //6、基于 ResourceBundle 读取配置文件
    public static ResourceBundle readProperties6(String resourceName) throws IOException {
       return ResourceBundle.getBundle(resourceName);
    }
    public static ResourceBundle readProperties6(String resourceName, Locale locale) throws IOException {
        return ResourceBundle.getBundle(resourceName, locale);
    }

    //7、基于PropertyResourceBundle读取配置文件
    public static ResourceBundle readProperties7(String resourceName) throws IOException {
        return PropertyResourceBundle.getBundle(resourceName);
    }
    public static ResourceBundle readProperties7(String resourceName, Locale locale) throws IOException {
        return PropertyResourceBundle.getBundle(resourceName, locale);
    }

    public static void main(String[] args) throws IOException {
        String fileName1 = "IO\\src\\main\\resources\\config.properties";
        String fileName2 = "config.properties";
        String fileName3 = "/config.properties";
        String sourceName = "name";

        System.out.println(readProperties1(fileName2).getProperty("name"));
        System.out.println(readProperties2(fileName3).getProperty("name"));
        System.out.println(readProperties3(fileName2).getProperty("name"));
        System.out.println(readProperties4(fileName1).getProperty("name"));
        System.out.println(readProperties5(fileName1).getProperty("name"));
        System.out.println(readProperties6(sourceName).getString("name"));
        System.out.println(readProperties6(sourceName, new Locale("en", "US")).getString("name"));
        System.out.println(readProperties7(sourceName).getString("name"));
        System.out.println(readProperties7(sourceName, new Locale("en", "US")).getString("name"));
    }
}
