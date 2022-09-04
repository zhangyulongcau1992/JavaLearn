package com.zyl.learn.designpattern.pattern.behavioral.command.improve;

/**
 * ClassName:Content
 * Package:com.zyl.learn.designpattern.pattern.behavioral.command
 * Description:
 *
 * @Date:2022/7/13 9:51
 * @Author:zhangyulong@qq.com
 */
public class Content {
    private String contentValue;

    public Content(String contentValue) {
        this.contentValue = contentValue;
    }

    public String getContentValue() {
        return contentValue;
    }

    public void setContentValue(String contentValue) {
        this.contentValue = contentValue;
    }
}
