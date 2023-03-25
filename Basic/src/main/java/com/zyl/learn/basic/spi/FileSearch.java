package com.zyl.learn.basic.spi;

/**
 * ClassName:FileSearch
 * Package:com.zyl.learn.basic.spi
 * Description:
 *
 * @Date:2023/3/8 10:38
 * @Author:zhangyulong@qq.com
 */
public class FileSearch implements Search {
    @Override
    public void search(String keyword) {
        System.out.println("FileSearch for " + keyword);
    }
}
