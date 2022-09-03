package com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility.improve;

/**
 * ClassName:Request
 * Package:com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility.improve
 * Description:
 *
 * @Date:2022/6/30 13:45
 * @Author:zhangyulong@qq.com
 */
public class Request {
    private String requestStr;

    public Request(String requestStr) {
        this.requestStr = requestStr;
    }

    public String getRequestStr() {
        return requestStr;
    }

    public void setRequestStr(String requestStr) {
        this.requestStr = requestStr;
    }
}
