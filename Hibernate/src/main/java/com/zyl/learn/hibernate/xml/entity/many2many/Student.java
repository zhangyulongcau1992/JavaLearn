package com.zyl.learn.hibernate.xml.entity.many2many;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * ClassName:Student
 * Package:com.zyl.learn.hibernate.entity.many2many
 * Description:
 *
 * @Date:2022/3/26 20:52
 * @Author:zhangyulong@qq.com
 */
@Getter
@Setter
public class Student {
    private Integer id;
    private String name;
    private Set<Course> courses;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
