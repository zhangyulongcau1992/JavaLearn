package com.zyl.learn.designpattern.pattern.behavioral.strategy;

import java.util.Arrays;
import java.util.Collections;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.behavioral.strategy
 * Description:
 *
 * @Date:2022/6/11 19:50
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {

        //应用Comparable进行排序，只能有一种排序方式
        Dog[] dogs = {
                new Dog(9, 6),
                new Dog(3, 8),
                new Dog(1, 5),
                new Dog(3, 9)
        };
        Sorter.sort(dogs);
        System.out.println(Arrays.toString(dogs));
        System.out.println("----------------------");

        //策略模式：应用Comparator进行排序，可以自定义不同的排序策略
        Cat[] cats = {
                new Cat(10, 4),
                new Cat(3, 8),
                new Cat(1, 5),
                new Cat(12, 3)
        };
        Sorter.sort(cats, new CatHeightComparator());
        System.out.println(Arrays.toString(cats));
        System.out.println("----------------------");

        Sorter.sort(cats, new CatWeightComparator());
        System.out.println(Arrays.toString(cats));
        System.out.println("----------------------");

        Sorter.sort(cats, new CatTotallyComparator());
        System.out.println(Arrays.toString(cats));
        System.out.println("----------------------");
    }
}
