package com.zyl.learn.designpattern.pattern.behavioral.memento;

import java.io.*;

/**
 * ClassName:Main
 * Package:com.zyl.learn.designpattern.pattern.behavioral.memento
 * Description:
 *
 * @Date:2022/7/13 17:34
 * @Author:zhangyulong@qq.com
 */
public class Main {
    public static void main(String[] args) {
        PersonMemento pm = new PersonMemento(new Person("zhangsan", 18, new Location("bj", 101), 12345));
        pm.save();
        Person p = pm.load();
        System.out.println(p);

        pm.setPerson(new Person("lisi", 26, new Location("sh", 201), 67890));
        pm.save();
        p = pm.load();
        System.out.println(p);

    }
}

class PersonMemento {
    private final static String FILE_PATH = "DesignPattern\\file\\person.data";
    private Person person;
    public PersonMemento(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void save() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream(FILE_PATH));
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Person load() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
            Person person = (Person) ois.readObject();
            return person;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}

class Person implements Serializable {
    private static final long serialVersionUID = 7488423651688261974L;
    private String name;
    private int age;
    private Location loc;
    private transient int id;

    public Person(String name, int age, Location loc, int id) {
        this.name = name;
        this.age = age;
        this.loc = loc;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", loc=" + loc +
                ", id=" + id +
                '}';
    }
}
class Location implements Serializable {
    private static final long serialVersionUID = -8577089514110017711L;
    String city;
    int roomNum;

    public Location(String city, int roomNum) {
        this.city = city;
        this.roomNum = roomNum;
    }

    @Override
    public String toString() {
        return "Location{" +
                "city='" + city + '\'' +
                ", roomNum=" + roomNum +
                '}';
    }
}