package com.zyl.learn.hibernate.xml.entity.one2many;

import java.util.Set;

/**
 * ClassName:Orders
 * Package:com.zyl.learn.hibernate.entity
 * Description:
 *
 * @Date:2022/3/24 16:07
 * @Author:zhangyulong@qq.com
 */
public class Orders {
    private Integer id;
    private String name;
    private Customer customer;
    private Set<OrderItem> orderItems;

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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
