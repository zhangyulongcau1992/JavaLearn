package com.zyl.learn.designpattern.pattern.structural.composite;

/**
 * ClassName:Node
 * Package:com.zyl.learn.designpattern.pattern.structural.composite
 * Description:
 *
 * @Date:2022/7/1 14:38
 * @Author:zhangyulong@qq.com
 */
public abstract class Node {
    public abstract void print();
    public static void tree(Node node, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        node.print();
        if (node instanceof BranchNode) {
            for (Node subNode : ((BranchNode) node).subNodes) {
                tree(subNode, level + 1);
            }
        }
    }
}