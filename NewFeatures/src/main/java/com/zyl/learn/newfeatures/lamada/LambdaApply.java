package com.zyl.learn.newfeatures.lamada;

/**
 * ClassName:LamadaApply
 * Package:com.zyl.learn.newfeatures.lamada
 * Description:对于函数式接口，可以使用Lambda表达式来创建该接口的对象
 *
 * @Date:2022/3/13 17:49
 * @Author:zhangyulong@qq.com
 */
public class LambdaApply {
    class LambdaImpl2 implements LambdaInterface {
        @Override
        public int test(int a) {
            System.out.println("成员内部类实现接口");
            return a;
        }
    }

    static class LambdaImpl3 implements LambdaInterface {
        @Override
        public int test(int a) {
            System.out.println("静态内部类实现接口");
            return a;
        }
    }

    public static void main(String[] args) {
        LambdaInterface lambdaInterface = null;
        int result = 0;
        //1、外部类
        lambdaInterface = new LambdaImpl1();
        result = lambdaInterface.test(1);
        System.out.println("返回结果是：" + result);

        //2、成员内部类
        lambdaInterface = new LambdaApply().new LambdaImpl2();
        result = lambdaInterface.test(2);
        System.out.println("返回结果是：" + result);

        //3、静态内部类
        lambdaInterface = new LambdaApply.LambdaImpl3();
        result = lambdaInterface.test(3);
        System.out.println("返回结果是：" + result);

        //4、局部内部类
        class LambdaImpl4 implements LambdaInterface {
            @Override
            public int test(int a) {
                System.out.println("局部内部类实现接口");
                return a;
            }
        }
        lambdaInterface = new LambdaImpl4();
        result = lambdaInterface.test(4);
        System.out.println("返回结果是：" + result);

        //5、匿名内部类
        lambdaInterface = new LambdaInterface(){
            @Override
            public int test(int a) {
                System.out.println("匿名内部类实现接口");
                return a;
            }
        };
        result = lambdaInterface.test(5);
        System.out.println("返回结果是：" + result);

        //6、lambda表达式
        lambdaInterface = (a) -> {
            System.out.println("Lambda表达式实现接口");
            return a;
        };
        result = lambdaInterface.test(6);
        System.out.println("返回结果是：" + result);
    }
}

//定义一个函数式接口(只包含一个抽象方法的接口)
interface LambdaInterface {
    int test(int a);
}

class LambdaImpl1 implements LambdaInterface {

    @Override
    public int test(int a) {
        System.out.println("外部类实现接口");
        return a;
    }
}