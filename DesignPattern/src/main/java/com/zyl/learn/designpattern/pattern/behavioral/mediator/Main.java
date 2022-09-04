package com.zyl.learn.designpattern.pattern.behavioral.mediator;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.behavioral.mediator
 * Description:
 *
 * @Date:2022/6/28 17:20
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        AbstractMarrageAgency agency = new MarryageAgency();
        AbstractPerson person1 = new Person(agency, "zhangsan", 28, Sex.MAN, 18);
        AbstractPerson person2 = new Person(agency, "zhangsi", 27, Sex.MAN, 20);
        AbstractPerson person3 = new Person(agency, "zhangwu", 19, Sex.MAN, 19);
        AbstractPerson person4 = new Person(agency, "lisan", 18, Sex.WOMAN, 28);
        AbstractPerson person5 = new Person(agency, "lisi", 22, Sex.WOMAN, 18);
        AbstractPerson person6 = new Person(agency, "liwu", 20, Sex.WOMAN, 28);
        person1.findCouples();
    }

}
