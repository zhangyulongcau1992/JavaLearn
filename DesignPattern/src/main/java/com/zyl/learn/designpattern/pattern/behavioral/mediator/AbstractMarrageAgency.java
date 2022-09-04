package com.zyl.learn.designpattern.pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:MarrageAgency
 * Package:com.zyl.learn.designpattern.pattern.behavioral.mediator
 * Description:
 *
 * @Date:2022/6/28 16:43
 * @Author:zhangyulong@qq.com
 */
public abstract class AbstractMarrageAgency {
    protected List<AbstractPerson> personList = new ArrayList<AbstractPerson>();
    public abstract void register(AbstractPerson person);
    public abstract void pair(AbstractPerson person);
}
