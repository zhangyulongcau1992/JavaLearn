package com.zyl.learn.designpattern.pattern.behavioral.iterator;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.behavioral.iterator
 * Description:
 *
 * @Date:2022/7/4 22:19
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        Collection_<String> list = new LinkedList_();
        for (int i = 0; i < 15; i++) {
            list.add("S" + i);
        }
        System.out.println(list.size());
        Iterator_<String> iterator = list.iterator();
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
