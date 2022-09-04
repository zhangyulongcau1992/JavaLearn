package com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility;

/**
 * ClassName:SensitiveFilter
 * Package:com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility
 * Description:
 *
 * @Date:2022/6/30 10:51
 * @Author:zhangyulong@qq.com
 */
public class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Message msg) {
        String msgStr = msg.getMsgStr();
        if (msgStr.contains("996")) {
            msgStr = msgStr.replace("996", "955");
            msg.setMsgStr(msgStr);
            return false;
        }
        return true;
    }
}
