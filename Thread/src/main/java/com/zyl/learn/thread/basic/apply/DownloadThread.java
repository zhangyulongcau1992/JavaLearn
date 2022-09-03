package com.zyl.learn.thread.basic.apply;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * ClassName:DownloadThread
 * Package:com.zyl.learn.thread.apply
 * Description:
 *
 * @Date:2022/3/12 19:07
 * @Author:zhangyulong@qq.com
 */
public class DownloadThread extends Thread {
    private String urlSpec;
    private String fileName;
    public DownloadThread(String urlSpec, String fileName) {
        this.urlSpec = urlSpec;
        this.fileName = fileName;
    }
    @Override
    public void run() {
        WebDownloader downloader = new WebDownloader();
        downloader.download(urlSpec, fileName);
        System.out.println("已下载文件：" + fileName);
    }

    public static void main(String[] args) {
        DownloadThread thread1 = new DownloadThread("https://img2.baidu.com/it/u=1814268193,3619863984&fm=253&fmt=auto&app=138&f=JPEG?w=632&h=500", "Thread\\download\\1.jpeg");
        DownloadThread thread2 = new DownloadThread("https://img1.baidu.com/it/u=4020015307,4170910140&fm=253&fmt=auto&app=138&f=JPEG?w=499&h=312", "Thread\\download\\2.jpeg");
        DownloadThread thread3 = new DownloadThread("https://img0.baidu.com/it/u=3879724579,2384271901&fm=253&fmt=auto&app=120&f=JPEG?w=1200&h=675", "Thread\\download\\3.jpeg");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class WebDownloader {
    public void download(String urlSpec, String fileName) {
        try {
            URL source = new URL(urlSpec);
            File file = new File(fileName);
            FileUtils.copyURLToFile(source, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
