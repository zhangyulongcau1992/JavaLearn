package com.zyl.learn.basic.objectOriented.demo2;

public class Teacher extends Employee {
    public int id = 1;

    //@Override 此处报错，静态方法不能被重写
    public static void staticMethod(){
        System.out.println("子类静态方法执行了...");
    }
    static {
        System.out.println("子类静态代码块执行了...");
    }
    {
        System.out.println("子类构造代码块执行了...");
    }
    public Teacher(){
        //super(); //此行代码编译时自动添加
        System.out.println("子类无参构造函数执行了...");
    }

    public Teacher(String name, int age) {
        super(name,age);//如果不指定父类构造方法，则编译时默认调用父类无参构造方法
        //this(); //此处报错，在构造函数中，this和super调用其他构造函数时，都必须是在首行
        System.out.println("子类有参构造函数执行了...");
    }

    /*
    方法覆盖重写的注意事项:

    1、必须父子类之间方法的名称相同，参数列表也相同。
    @Override写在方法前面，用来检测是不是有效的正确覆盖重写。
    这个注解就算不写，只要满足要求，也是正确的方法覆盖重写。

    2、子类方法的返回值必须【小于等于】父类方法的返回值范围。
    提示：java.lang.Object类是所有类的公共最高父类，范围最大

    3、子类方法的权限必须【大于等于】父类方法的权限修饰符
    提示：public>protected>(default)>private
     */
    @Override
    public void method(){
        //super();  //报错，只有子类构造方法，才能调用父类构造方法
        //this();  //报错，只用构造方法，才能调用其他构造方法
        //super.method();
        //System.out.println("子类可以在此添加功能...");
        System.out.println("子类method方法执行了...");
    }

    public void show(){
        int id=-1;
        System.out.println(id);
        System.out.println(this.id);
        System.out.println(super.id);
    }
}
