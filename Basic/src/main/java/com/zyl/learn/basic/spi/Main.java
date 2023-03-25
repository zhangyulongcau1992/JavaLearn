package com.zyl.learn.basic.spi;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * ClassName:Main
 * Package:com.zyl.learn.basic.spi
 * Description:
 *
 * @Date:2023/3/8 10:40
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        ServiceLoader<Search> load = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = load.iterator();
        while (iterator.hasNext()) {
            Search next = iterator.next();
            System.out.println(next.getClass().getName());
            next.search("cat");
        }

        System.out.println("-----------------------");

        // POM文件中引入mysql的依赖即可
        ServiceLoader<Driver> load2 = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator2 = load2.iterator();
        while (iterator2.hasNext()) {
            Driver next = iterator2.next();
            System.out.println(next.getClass().getName());
        }
    }
}
