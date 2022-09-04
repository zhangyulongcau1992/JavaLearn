package com.zyl.learn.hibernate.xml.entity.one2many;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * ClassName:Customer
 * Package:com.zyl.learn.hibernate.entity
 * Description:
 *
 * @Date:2022/3/24 16:04
 * @Author:zhangyulong@qq.com
 */
@Getter
@Setter
public class Customer {
    private Integer id;
    private String name;
    private Set<Orders> orders;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
