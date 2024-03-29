package com.zyl.learn.hibernate.xml.entity.one2many;

import java.util.Set;

/**
 * ClassName:Customer
 * Package:com.zyl.learn.hibernate.entity
 * Description:
 *
 * @Date:2022/3/24 16:04
 * @Author:zhangyulong@qq.com
 */
public class Customer {
    private Integer id;
    private String name;
    private Set<Orders> orders;

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

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
