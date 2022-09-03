package com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility;

/**
 * ClassName:HTMLFilter
 * Package:com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility
 * Description:
 *
 * @Date:2022/6/30 10:44
 * @Author:zhangyulong@qq.com
 */
public class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Message msg) {
        String msgStr = msg.getMsgStr();
        msgStr = msgStr.replace('<', '[');
        msgStr = msgStr.replace('>', ']');
        msg.setMsgStr(msgStr);
        return true;
    }
}
