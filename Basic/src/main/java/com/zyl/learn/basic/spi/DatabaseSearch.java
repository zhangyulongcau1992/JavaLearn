package com.zyl.learn.basic.spi;

/**
 * ClassName:DatabaseSearch
 * Package:com.zyl.learn.basic.spi
 * Description:
 *
 * @Date:2023/3/8 10:39
 * @Author:zhangyulong@qq.com
 */
public class DatabaseSearch implements Search {
    @Override
    public void search(String keyword) {
        System.out.println("DatabaseSearch for " + keyword);
    }
}
