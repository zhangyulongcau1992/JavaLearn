package com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility;

/**
 * ClassName:Message
 * Package:com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility
 * Description:
 *
 * @Date:2022/6/30 10:46
 * @Author:zhangyulong@qq.com
 */
public class Message {
    private String msgStr;

    public Message(String msgStr) {
        if (null == msgStr) {
            this.msgStr = "";
            return;
        }
        this.msgStr = msgStr;
    }

    public String getMsgStr() {
        return msgStr;
    }

    public void setMsgStr(String msgStr) {
        this.msgStr = msgStr;
    }
}
