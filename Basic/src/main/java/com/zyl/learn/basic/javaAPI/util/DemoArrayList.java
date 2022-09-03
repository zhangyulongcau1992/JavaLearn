package com.zyl.learn.basic.javaAPI.util;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        /* 1、ArrayList添加元素 */
        list.add(1);
        list.add(new int[]{1,2});
        list.add(1.2);
        list.add("zyl");
        list.add('z');

        /* 2、打印ArrayList */
        System.out.println(list);

        /* 3、获取ArrayList元素 */
        int num = (int) list.get(0);
        System.out.println(num);

        /* 4、删除ArrayList中某一元素 */
        char removeItem = (char) list.remove(4);
        System.out.println(removeItem);

        /* 5、获取ArrayList元素个数 */
        int size = list.size();
        System.out.println("集合的长度：" + size);

        /* 6、ArrayList初始化，泛型不同时的表现 */
        ArrayList<String> strList1 = new ArrayList();
        ArrayList strList2 = new ArrayList<String>();
        ArrayList<String> strList3 = new ArrayList<>();
        ArrayList<String> strList4 = list;

        strList1.add("zyl");
        strList2.add("zyl");
        strList3.add("zyl");

        //strList1.add(1); //报错
        strList2.add(1);
        //strList3.add(1); //报错

        String zyl1 = strList1.get(0);
        String zyl2 = (String) strList2.get(0);// 此处必须进行强制类型转换
        String zyl3 = strList3.get(0);
        String zyl4 = strList4.get(3);
        //int num2 = (int)strList4.get(0); //报错
    }
}
