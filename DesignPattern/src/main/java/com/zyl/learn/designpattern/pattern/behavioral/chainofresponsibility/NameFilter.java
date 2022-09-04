package com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility;

/**
 * ClassName:NameFilter
 * Package:com.zyl.learn.designpattern.pattern.behavioral.chainofresponsibility
 * Description:
 *
 * @Date:2022/6/30 11:02
 * @Author:zhangyulong@qq.com
 */
public class NameFilter implements Filter {
    @Override
    public boolean doFilter(Message msg) {
        String msgStr = msg.getMsgStr();
        msgStr = msgStr.replace("张彧龙", "张三");
        msg.setMsgStr(msgStr);
        return true;
    }
}
