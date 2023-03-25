package com.zyl.learn.io.other;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName:FileApply
 * Package:com.zyl.learn.io.file
 * Description:
 *
 * @Date:2022/2/27 21:30
 * @Author:zhangyulong@qq.com
 */
public class FileApply {

    /**
     * 文件分隔符
     */
    public void separator() {
        System.out.println("路径分隔符：" + File.pathSeparator);
        System.out.println("分隔符：" + File.separator); //UNIX systems:'/'; Windows systems:'\\'
    }

    /**
     * 文件相关操作
     * @throws Exception
     */
    public void fileOperation() throws Exception {
        //1、文件创建
        File file = new File("IO\\src\\newFile.txt");
        if (!file.exists()) {
            boolean createResult = file.createNewFile();
            System.out.println("文件创建成功？" + createResult);
        }
        //2、文件删除
        //2.1 直接删除
//        boolean deleteResult = file.delete();
//        System.out.println("文件删除成功？" + deleteResult);
        //2.2 使用jvm退出时删除
//        file.deleteOnExit();
//             Thread.sleep(5000);
    
        //3、获取文件信息
        System.out.println("文件的绝对路径：" + file.getAbsolutePath());
        System.out.println("文件的路径：" + file.getPath());
        System.out.println("文件的名称：" + file.getName());
        System.out.println("文件的父目录：" + file.getParent());
        System.out.println("文件的长度：" + file.length());
        System.out.println("文件的上次修改时间：" + new SimpleDateFormat().format(new Date(file.lastModified())));

        //4、判断
        System.out.println("文件是否可读？" + file.canRead());
        System.out.println("文件是否可写？" + file.canWrite());
        System.out.println("文件是否隐藏？" + file.isHidden());
        System.out.println("文件是否为文件？" + file.isFile());

    }

    /**
     * 文件夹相关操作
     * @throws Exception
     */
    public void directoryOperation() throws Exception {
        //1、创建文件夹
        File dir = new File("IO\\src\\newDirectory");
        if (!dir.exists()) {
            boolean createResult = dir.mkdirs();
            System.out.println("文件夹创建成功？" + createResult);
        }
        //2、删除文件夹
        //2.1 直接删除（只能删除空目录，如果目录中有文件则删除失败）
//        boolean deleteResult = dir.delete();
//        System.out.println("文件夹删除成功？" + deleteResult);
        //2.2 使用jvm退出时删除
//        dir.deleteOnExit();
//        Thread.sleep(5000);
        //3、获取文件夹信息
        System.out.println("文件夹的绝对路径：" + dir.getAbsolutePath());
        System.out.println("文件夹的路径：" + dir.getPath());
        System.out.println("文件夹的名称：" + dir.getName());
        System.out.println("文件夹的父目录：" + dir.getParent());
        System.out.println("文件夹的长度：" + dir.length());
        System.out.println("文件夹的上次修改时间：" + new SimpleDateFormat().format(new Date(dir.lastModified())));
        //4、判断
        System.out.println("文件夹是否隐藏？" + dir.isHidden());
        System.out.println("文件夹是否为文件夹？" + dir.isDirectory());
        //5、递归遍历文件夹
        printDirectory(dir, 0);

    }

    private void printDirectory(File dir, int level) {
        if (dir == null) {
            System.out.println("null");
        }
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        System.out.println(dir.getName());
        if (dir.isDirectory()) {
            level++;
            for (File file : dir.listFiles()) {
                printDirectory(file, level);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        // FileApply apply = new FileApply();
        // apply.separator();
        // System.out.println("-------------------");
        // apply.fileOperation();
        // System.out.println("-------------------");
        // apply.directoryOperation();
        String a = "abc-c";
        String b = null;
        if (null != a && a.contains("-")) {
            b = a.split("-")[0];

        } else {
            b = a;
        }
        System.out.println(b);
    }
}
