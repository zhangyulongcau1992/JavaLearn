package com.zyl.learn.designpattern.pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ClassName:MarryageAgency
 * Package:com.zyl.learn.designpattern.pattern.behavioral.mediator
 * Description:
 *
 * @Date:2022/6/28 17:00
 * @Author:zhangyulong@qq.com
 */
public class MarryageAgency extends AbstractMarrageAgency {

    @Override
    public void register(AbstractPerson person) {
        personList.add(person);
    }

    @Override
    public void pair(AbstractPerson person) {
        if (null == person) {
            return;
        }
        List<AbstractPerson> person2MatchList = new ArrayList<AbstractPerson>();
        for (AbstractPerson person2Match : personList) {
            if (person2Match.sex != person.sex
                    && person2Match.age == person.ageExpected
                    && person2Match.ageExpected == person.age) {
                person2MatchList.add(person2Match);
            }
        }
        System.out.println("符合您要求的有：");
        System.out.println(person2MatchList);;
    }
}
