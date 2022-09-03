package com.zyl.learn.designpattern.pattern.structural.adapter;

import java.io.*;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.structural.adapter
 * Description:
 *
 * @Date:2022/7/12 20:03
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("DesignPattern\\file\\ccc.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String in;
        while ((in = br.readLine()) != null) {
            System.out.println(in);
        }
        br.close();
    }
}
