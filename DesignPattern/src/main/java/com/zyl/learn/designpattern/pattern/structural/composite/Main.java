package com.zyl.learn.designpattern.pattern.structural.composite;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.structural.composite
 * Description:
 *
 * @Date:2022/7/1 14:47
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode C1 = new BranchNode("C1");
        BranchNode C2 = new BranchNode("C2");
        BranchNode C11 = new BranchNode("C11");
        Node C12 = new LeafNode("C12");
        Node C111 = new LeafNode("C111");
        Node C21 = new LeafNode("C21");

        root.add(C1);
        root.add(C2);
        C1.add(C11);
        C1.add(C12);
        C2.add(C21);
        C11.add(C111);

        Node.tree(root, 0);
    }
}
