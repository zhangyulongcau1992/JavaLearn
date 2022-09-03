package com.zyl.learn.designpattern.pattern.behavioral.strategy.extra;

/**
 * ClassName:AnimalWeightComparator
 * Package:com.zyl.learn.designpattern.pattern.behavioral.strategy.extra
 * Description:
 *
 * @Date:2022/6/12 18:00
 * @Author:zhangyulong@qq.com
 */
public class AnimalWeightComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
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
