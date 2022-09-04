package com.zyl.learn.hibernate.xml.entity.one2many;

import lombok.Getter;
import lombok.Setter;

/**
 * ClassName:Orders
 * Package:com.zyl.learn.hibernate.entity
 * Description:
 *
 * @Date:2022/3/24 16:07
 * @Author:zhangyulong@qq.com
 */
@Getter
@Setter
public class Orders {
    private Integer id;
    private String name;
    private Customer customer;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
