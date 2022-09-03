package com.zyl.learn.hibernate.xml.entity.many2many;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * ClassName:Course
 * Package:com.zyl.learn.hibernate.entity.many2many
 * Description:
 *
 * @Date:2022/3/26 20:53
 * @Author:zhangyulong@qq.com
 */
@Getter
@Setter
public class Course {
    private Integer id;
    private String name;
    private Set<Student> students;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
