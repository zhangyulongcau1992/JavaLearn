package com.zyl.learn.designpattern.pattern.creational.builder;

/**
 * ClassName:Person
 * Package:com.zyl.learn.designpattern.pattern.creational.builder
 * Description:
 *
 * @Date:2022/7/11 20:46
 * @Author:zhangyulong@qq.com
 */
public class Person {
    int id;
    String name;
    int age;
    double weight;
    double height;
    Location loc;

    private Person() {}

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", loc=" + loc +
                '}';
    }

    public static class PersonBuilder {
        Person person = new Person();

        public PersonBuilder basicInfo(int id, String name, int age) {
            person.id = id;
            person.name = name;
            person.age = age;
            return this;
        }

        public PersonBuilder weight(double weight) {
            person.weight = weight;
            return this;
        }

        public PersonBuilder height(double height) {
            person.height = height;
            return this;
        }

        public PersonBuilder loc(String street, String roomNo) {
            person.loc = new Location(street, roomNo);
            return this;
        }

        public Person build() {
            return person;
        }
    }
}

class Location {
    String street;
    String roomNo;

    public Location(String street, String roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo='" + roomNo + '\'' +
                '}';
    }
}
