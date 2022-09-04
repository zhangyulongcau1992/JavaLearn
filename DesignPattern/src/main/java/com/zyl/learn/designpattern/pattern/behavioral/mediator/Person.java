package com.zyl.learn.designpattern.pattern.behavioral.mediator;

import java.util.List;

/**
 * ClassName:Person
 * Package:com.zyl.learn.designpattern.pattern.behavioral.mediator
 * Description:
 *
 * @Date:2022/6/28 16:51
 * @Author:zhangyulong@qq.com
 */
public class Person extends AbstractPerson {

    public Person(AbstractMarrageAgency agency, String name, int age, Sex sex, int ageExpected) {
        super(agency, name,age, sex, ageExpected);
        agency.register(this);

    }

    @Override
    public void findCouples() {
        agency.pair(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", ageExpected=" + ageExpected +
                '}';
    }
}

