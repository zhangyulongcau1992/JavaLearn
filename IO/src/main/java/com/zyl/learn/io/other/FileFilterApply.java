package com.zyl.learn.io.other;

import java.io.File;
import java.io.FileFilter;

/**
 * ClassName:FileFilterApply
 * Package:com.zyl.learn.io.other.file
 * Description:
 *
 * @Date:2022/2/28 19:08
 * @Author:zhangyulong@qq.com
 */
public class FileFilterApply {

    /**
     * 打印出文件夹所有文件，过滤掉文件夹
     */
    public void filterFileWithoutDirectory() {
        File dir = new File("IO\\src");
        if (dir.isDirectory()) {
            File[] fileList = dir.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.isDirectory() ? false : true;
                }
            });
            for (File file : fileList) {
                System.out.println(file.getName());
            }
        }
    }

    public static void main(String[] args) {
        FileFilterApply apply = new FileFilterApply();
        apply.filterFileWithoutDirectory();
    }
}
