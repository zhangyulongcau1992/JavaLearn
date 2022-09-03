package com.zyl.learn.designpattern.pattern.behavioral.visitor.asm;

import org.objectweb.asm.*;

import java.io.File;
import java.io.FileOutputStream;

import static org.objectweb.asm.Opcodes.INVOKESTATIC;

/**
 * 模拟动态代理
 */
public class ClassTransformerTest {
    public static void main(String[] args) throws Exception {
        ClassReader cr = new ClassReader(
                ClassTransformerTest.class.getClassLoader().getResourceAsStream(
                        "com/zyl/learn/designpattern/pattern/behavioral/visitor/asm/Tank.class"));
        ClassWriter cw = new ClassWriter(0);
        ClassVisitor cv = new ClassAdapter(cw) {
            @Override
            public MethodVisitor visitMethod(int i, String s, String s1, String s2, String[] strings) {
                return new MethodAdapter(super.visitMethod(i, s, s1, s2, strings)) {
                    @Override
                    public void visitCode() {
                        visitMethodInsn(INVOKESTATIC, "TimeProxy", "before", "()V");
                        super.visitCode();
                    }
                };
            }

        };
        cr.accept(cv, 0);
        byte[] b = cw.toByteArray();
        String path = (String) System.getProperties().get("user.dir");
        File f = new File(path + "/DesignPattern/com/zyl/learn/designpattern/pattern/behavioral/visitor/asm/");
        f.mkdirs();

        FileOutputStream fos = new FileOutputStream(
                new File(path + "/DesignPattern/com/zyl/learn/designpattern/pattern/behavioral/visitor/asm/Tank_0.class"));
        fos.write(b);
        fos.flush();
        fos.close();
    }
}
