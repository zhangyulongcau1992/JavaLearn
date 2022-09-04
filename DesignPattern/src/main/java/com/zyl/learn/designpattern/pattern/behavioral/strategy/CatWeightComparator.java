package com.zyl.learn.designpattern.pattern.behavioral.strategy;

/**
 * ClassName:CatWeightComparator
 * Package:com.zyl.learn.designpattern.pattern.behavioral.strategy
 * Description:
 *
 * @Date:2022/6/12 17:18
 * @Author:zhangyulong@qq.com
 */
public class CatWeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1 == null && o2 == null) return 0;
        if (o1 == null) return -1;
        if (o2 == null) return 1;
        if (o1.weight > o2.weight) {
            return 1;
        } else if (o2.weight > o1.weight) {
            return -1;
        } else {
            return 0;
        }
    }
}
