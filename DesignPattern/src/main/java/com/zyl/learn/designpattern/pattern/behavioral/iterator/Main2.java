package com.zyl.learn.designpattern.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ClassName:Main2
 * Package:com.zyl.learn.designpattern.pattern.behavioral.iterator
 * Description:
 *
 * @Date:2022/7/4 22:27
 * @Author:zhangyulong@qq.com
 */
public class Main2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList();
        for (int i = 0; i < 15; i++) {
            list.add("S" + i);
        }
        System.out.println(list.size());
        Iterator<String> iterator = list.iterator();
        iterator.remove();
        while(iterator.hasNext()) {
            String o = iterator.next();
            if (o.equals("S5")) {
                iterator.remove();
            } else {
                System.out.println(o);
            }
        }
        System.out.println(list.size());
    }
}
