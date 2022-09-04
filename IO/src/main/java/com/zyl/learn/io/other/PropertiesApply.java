package com.zyl.learn.io.other;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * ClassName:PropertiesApply
 * Package:com.zyl.learn.io.other
 * Description:
 *
 * @Date:2022/2/28 19:31
 * @Author:zhangyulong@qq.com
 */
public class PropertiesApply {
    public void storeProperties() throws Exception {
        Properties properties = new Properties();
        properties.setProperty("姓名", "张三");
        properties.setProperty("年龄", "18");

        FileOutputStream out = new FileOutputStream("IO\\src\\my.properties");
        properties.store(out, "my.properties");
        out.close();
    }

    public void LoadProperties() throws Exception {
        FileInputStream in = new FileInputStream("IO\\src\\my.properties");
        Properties properties = new Properties();
        properties.load(in);
        in.close();
        Iterator iterator = properties.keySet().iterator();
        while(iterator.hasNext()) {
            String name = (String)iterator.next();
            String value = properties.getProperty(name);
            System.out.println(name + "=" + value);
        }
    }

    public static void main(String[] args) throws Exception {
        PropertiesApply apply = new PropertiesApply();
        apply.storeProperties();
        apply.LoadProperties();
    }
}
