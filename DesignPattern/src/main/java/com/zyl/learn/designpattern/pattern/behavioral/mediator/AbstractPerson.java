package com.zyl.learn.designpattern.pattern.behavioral.mediator;

import java.util.List;

/**
 * ClassName:Person
 * Package:com.zyl.learn.designpattern.pattern.behavioral.mediator
 * Description:
 *
 * @Date:2022/6/28 16:37
 * @Author:zhangyulong@qq.com
 */
public abstract class AbstractPerson {
    String name;
    int age;
    Sex sex;
    int ageExpected;
    protected AbstractMarrageAgency agency;

    public AbstractPerson(AbstractMarrageAgency agency, String name, int age, Sex sex, int ageExpected) {
        this.agency = agency;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.ageExpected = ageExpected;
    }
    public abstract void findCouples();
}

enum Sex {
    MAN, WOMAN;
}
