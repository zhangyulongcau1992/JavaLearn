package com.zyl.learn.designpattern.pattern.behavioral.observer.improve;

/**
 * ClassName:PlayEvent
 * Package:com.zyl.learn.designpattern.pattern.behavioral.observer.improve
 * Description:
 *
 * @Date:2022/6/30 22:08
 * @Author:zhangyulong@qq.com
 */
public class PlayEvent extends Event {
    public PlayEvent(Source source) {
        this.source = source;
    }
}
