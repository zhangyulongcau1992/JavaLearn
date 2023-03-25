package com.zyl.learn.hibernate.xml.entity.one2many;

/**
 * ClassName:OrderItem
 * Package:com.zyl.learn.hibernate.xml.entity.one2many
 * Description:
 *
 * @Date:2022/11/17 9:24
 * @Author:zhangyulong@qq.com
 */
public class OrderItem {
    private Integer id;
    private String name;
    private Orders orders;

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

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
