package com.zyl.learn.designpattern.pattern.behavioral.visitor.asm;


import org.objectweb.asm.*;

import java.io.IOException;


public class ClassPrinter implements ClassVisitor {

    public static void main(String[] args) throws IOException {
        ClassPrinter cp = new ClassPrinter();
        ClassReader cr = new ClassReader("java.lang.Runnable");
        cr.accept(cp, 0);
    }

    @Override
    public void visit(int i, int i1, String s, String s1, String s2, String[] strings) {
        System.out.println(s + " extends " + s2 + "{");
    }

    @Override
    public FieldVisitor visitField(int i, String s, String s1, String s2, Object o) {
        System.out.println("  " + s);
        return null;
    }

    @Override
    public MethodVisitor visitMethod(int i, String s, String s1, String s2, String[] strings) {
        System.out.println("  " + s + "()");
        return null;
    }

    @Override
    public void visitEnd() {
        System.out.println("}");
    }

    @Override
    public void visitSource(String s, String s1) {

    }

    @Override
    public void visitOuterClass(String s, String s1, String s2) {

    }

    @Override
    public AnnotationVisitor visitAnnotation(String s, boolean b) {
        return null;
    }


    @Override
    public void visitAttribute(Attribute attribute) {

    }

    @Override
    public void visitInnerClass(String s, String s1, String s2, int i) {

    }
}
