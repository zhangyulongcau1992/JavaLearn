package com.zyl.learn.designpattern.pattern.behavioral.observer.improve;

/**
 * ClassName:CryEvent
 * Package:com.zyl.learn.designpattern.pattern.behavioral.observer.improve
 * Description:
 *
 * @Date:2022/6/30 22:02
 * @Author:zhangyulong@qq.com
 */
public class CryEvent extends Event {
    public CryEvent(Source source) {
        this.source = source;
    }
}
