package com.zyl.learn.designpattern.pattern.behavioral.command;

import java.util.Arrays;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.behavioral.command
 * Description:
 *
 * @Date:2022/7/13 9:53
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        // Content content = new Content("hello");
        //
        // Command insertCommand = new InsertCommand(content, " world");
        // insertCommand.doit();
        // System.out.println(content.getContentValue());
        // insertCommand.undo();
        // System.out.println(content.getContentValue());
        //
        // Command deleteCommand = new DeleteCommand(content, 3);
        // deleteCommand.doit();
        // System.out.println(content.getContentValue());
        // deleteCommand.undo();
        // System.out.println(content.getContentValue());
        // 按指定模式在字符串查找
        // String line = "";
        // String pattern1 = "\\d\\d[M][/]";
        // String pattern2 = "\\d\\d[M]";
        //
        // // 创建 Pattern 对象
        // Pattern r = Pattern.compile(pattern1);
        // // 现在创建 matcher 对象
        // Matcher m = r.matcher(line);
        // String result = "";
        // if (m.find()) {
        //     result = m.replaceAll("");
        // }
        // System.out.println(result);
        // r = Pattern.compile(pattern2);
        // m = r.matcher(result);
        // if (m.find()) {
        //     result = m.replaceAll("");
        //
        // }
        // if ("".equals(result)) {
        //     System.out.println("result已空");
        // } else {
        //     System.out.println(result);
        // }

        String str = "a,b,,,a";
        String[] ary = str.split(",");
        //预期大于 3，结果是 3
        System.out.println(ary.length);
        System.out.println(Arrays.toString(ary));
    }
}
