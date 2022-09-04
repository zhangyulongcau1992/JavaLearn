package com.zyl.learn.basic.objectOriented.demo2;

public class Demo2 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("张三",8);
        //Teacher teacher3 = (Teacher) new Employee();  //运行报错
        Teacher teacher4 = new Teacher();
        Employee employee1 = new Teacher();
        Employee employee2 = new Employee();

        System.out.println(employee1.id);//0
        System.out.println(employee2.id);//0
        System.out.println(teacher4.id);//1

        employee1.method();//子类method方法执行了...
        employee2.method();//父类method方法执行了...
        teacher4.method();//子类method方法执行了...

        employee1.staticMethod();//父类静态方法执行了...
        employee2.staticMethod();//父类静态方法执行了...
        teacher4.staticMethod();//子类静态方法执行了...

        employee1.methodStatic();//祖宗类静态方法执行了...
        employee2.methodStatic();//祖宗类静态方法执行了...
        teacher4.methodStatic();//祖宗类静态方法执行了...

        //employee1.show();  //编译报错
        teacher4.show();

        /*
        对象的向下转型，其实是一个【还原】的动作
        格式：子类名称 对象名 = （子类名称）父类对象；
        含义：将父类对象，【还原】成为本来的子类对象。
        注意事项：必须保证对象本来创建的时候，就是子对象，才能向下转型成为子对象,否则会运行报错
         */
        Employee employee = new Teacher();
        Teacher teacher = (Teacher) employee;//运行正常
        Employee e = new Employee();
        //Teacher t = (Teacher) e;//运行报错ClassCastException

        /*
        如何才能知道一个父类引用的对象，本来是什么子类？
        格式：对象 instanceof 类名称
        这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例
         */
        Employee ee = new Teacher();
        if(ee instanceof Teacher){
            Teacher tt = (Teacher) ee;//一般向下转型都要先用instanceof进行判断
            tt.show();
        }

    }
}
