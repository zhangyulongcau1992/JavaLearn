package com.zyl.learn.designpattern.pattern.behavioral.observer.improve;

/**
 * ClassName:Event
 * Package:com.zyl.learn.designpattern.pattern.behavioral.observer
 * Description:
 *
 * @Date:2022/6/30 20:32
 * @Author:zhangyulong@qq.com
 */
public abstract class Event {
    protected Source source;

    public Source getSource() {
        return source;
    }
}
