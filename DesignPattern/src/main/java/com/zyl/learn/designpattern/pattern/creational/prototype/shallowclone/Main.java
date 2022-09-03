package com.zyl.learn.designpattern.pattern.creational.prototype.shallowclone;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.creational.prototype
 * Description:
 *
 * @Date:2022/7/13 14:46
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p = new Person();
        Person copy = (Person) p.clone();

        System.out.println(p);
        System.out.println(copy);
        System.out.println(p.loc == copy.loc);
        p.loc.city = "shanghai";
        System.out.println(copy.loc.city);
    }
}
class Person implements Cloneable {
    int id = 1;
    int age = 10;
    String name = "zhangsan";
    Location loc = new Location("beijing", 101);

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", loc=" + loc +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Location {
    String city;
    int roomNo;

    public Location(String city, int roomNo) {
        this.city = city;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Location{" +
                "city='" + city + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }
}