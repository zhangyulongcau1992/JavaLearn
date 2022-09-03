package com.zyl.learn.javaweb.jdbc.entity;

/**
 * ClassName:People
 * Package:com.zyl.learn.hibernate.entity
 * Description:
 *
 * @Date:2022/3/25 11:10
 * @Author:zhangyulong@qq.com
 */
public class People {
    private Integer id;
    private String name;
    private Double money;
    private String nation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", nation='" + nation + '\'' +
                '}';
    }
}
