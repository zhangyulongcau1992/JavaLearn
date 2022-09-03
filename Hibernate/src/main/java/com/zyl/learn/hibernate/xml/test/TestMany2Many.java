package com.zyl.learn.hibernate.xml.test;

import com.zyl.learn.hibernate.xml.entity.many2many.Course;
import com.zyl.learn.hibernate.xml.entity.many2many.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName:TestMany2Many
 * Package:com.zyl.learn.hibernate.xml.test
 * Description:
 *
 * @Date:2022/3/26 21:48
 * @Author:zhangyulong@qq.com
 */

public class TestMany2Many {
    public void testSave() {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        Student student = new Student();
        student.setName("张三");
        Course course = new Course();
        course.setName("数学");
        Set<Course> courses = new HashSet<Course>();
        courses.add(course);
        student.setCourses(courses);
        session.save(course);
        session.save(student);

        session.beginTransaction().commit();
        session.close();

    }

    public void updateStudent() {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        Student student = session.get(Student.class, 3);
        student.setName("李四");
        session.saveOrUpdate(student);

        session.beginTransaction().commit();
        session.close();
    }

    public void testReadCourse() {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        Course course = session.get(Course.class, 2);
        System.out.println(course);
        System.out.println(course.getStudents());

        session.close();
    }

    public void testReadStudent() {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        Student student = session.get(Student.class, 3);
        System.out.println(student);
        System.out.println(student.getCourses());

        session.close();
    }

    public static void main(String[] args) {
        TestMany2Many test = new TestMany2Many();
        test.updateStudent();
    }
}
