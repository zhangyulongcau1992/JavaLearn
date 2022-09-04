package com.zyl.learn.designpattern.pattern.behavioral.strategy.extra;

import java.util.Arrays;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.behavioral.strategy.extra
 * Description:
 *
 * @Date:2022/6/12 18:02
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        Pig[] pigs = {
                new Pig(9, 6),
                new Pig(3, 8),
                new Pig(1, 5),
                new Pig(4, 9)
        };

        Sorter.sort(pigs, new AnimalWeightComparator());
        System.out.println(Arrays.toString(pigs));
    }
}
