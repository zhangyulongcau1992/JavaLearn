package com.zyl.learn.designpattern.pattern.structural.composite;

/**
 * ClassName:LeafNode
 * Package:com.zyl.learn.designpattern.pattern.structural.composite
 * Description:
 *
 * @Date:2022/7/1 14:39
 * @Author:zhangyulong@qq.com
 */
public class LeafNode extends Node {
    private String name;

    public LeafNode(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
