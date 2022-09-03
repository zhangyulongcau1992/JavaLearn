package com.zyl.learn.designpattern.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:BranchNode
 * Package:com.zyl.learn.designpattern.pattern.structural.composite
 * Description:
 *
 * @Date:2022/7/1 14:41
 * @Author:zhangyulong@qq.com
 */
public class BranchNode extends Node {
    private String name;
    public List<Node> subNodes = new ArrayList<>();

    public BranchNode(String name) {
        this.name = name;
    }

    public void add(Node node) {
        subNodes.add(node);
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
