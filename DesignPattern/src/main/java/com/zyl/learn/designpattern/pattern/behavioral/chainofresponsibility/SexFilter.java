package com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility;

/**
 * ClassName:SexFilter
 * Package:com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility
 * Description:
 *
 * @Date:2022/6/30 11:03
 * @Author:zhangyulong@qq.com
 */
public class SexFilter implements Filter {
    @Override
    public boolean doFilter(Message msg) {
        String msgStr = msg.getMsgStr();
        msgStr = msgStr.replace("男", "*");
        msgStr = msgStr.replace("女", "*");
        msg.setMsgStr(msgStr);
        return true;
    }
}
