package com.zyl.learn.io.bio.entity;

import java.io.Serial;
import java.io.Serializable;

/**
 * ClassName:StudentTest
 * Package:com.zyl.learn.io.utils
 * Description:
 *
 * @Date:2022/2/24 20:49
 * @Author:zhangyulong@qq.com
 */
public class StudentTest implements Serializable {
    @Serial
    private static final long serialVersionUID = -6726235327574837094L;

    private String stuName;
    private int stuAge;

    public StudentTest(String name, int age) {
        this.stuName = name;
        this.stuAge = age;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }
}
