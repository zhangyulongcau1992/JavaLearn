package com.zyl.learn.hibernate.xml.test;


import com.zyl.learn.hibernate.xml.entity.many2many.Course;
import com.zyl.learn.hibernate.xml.entity.single.People;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * ClassName:Test
 * Package:com.zyl.learn.hibernate.test
 * Description:
 *
 * @Date:2022/3/25 15:24
 * @Author:zhangyulong@qq.com
 */
public class TestSingle {
    public void testRead() {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        Criteria crit = session.createCriteria(People.class);
        crit.add(Restrictions.eq("name", null));
        List list = crit.list();
        if (list.size() > 0) {
            People people = (People) list.get(0);
            System.out.println(people);
        }


        session.close();
    }

    public void testRead_Update_NotSave() {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        People people = session.get(People.class, 1);
        people.setMoney((double) 1010);

        session.beginTransaction().commit();
        session.close();
    }

    public void testRead_Update_ReadOther_Save() {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        People people = session.get(People.class, 1);
        people.setMoney((double) 101011);

        Course course = session.get(Course.class, 2);
        course.setName("asasd");
        session.saveOrUpdate(people);

        session.beginTransaction().commit();
        session.close();
    }

    public void testSave() {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        People people = new People();
        people.setMoney(200D);
        people.setName("李四");
        people.setNation("China");
        session.save(people);

        session.beginTransaction().commit();
        session.close();
    }

    public void test_Save_Read_commit() {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        People people = new People();
        people.setMoney(200D);
        people.setName("树先生2");
        people.setNation("China");
        session.saveOrUpdate(people);

        Criteria crit = session.createCriteria(People.class);
        crit.add(Restrictions.eq("name", "树先生2"));
        List list = crit.list();
        if (list.size() > 0) {
            People people2 = (People) list.get(0);
            System.out.println(people2);
        }

        transaction.commit();
        session.close();
    }

    public void test_Save_commit_read() {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        People people = new People();
        people.setMoney(200D);
        people.setName("大马哈");
        people.setNation("China");
        session.save(people);

        session.beginTransaction().commit();
        session.close();

        Session session2 = factory.openSession();
        Criteria crit = session2.createCriteria(People.class);
        crit.add(Restrictions.eq("name", "大马哈"));
        List list = crit.list();
        if (list.size() > 0) {
            People people2 = (People) list.get(0);
            System.out.println(people2);
        }
        session2.close();


    }
    public static void main(String[] args) {
        TestSingle test = new TestSingle();
        test.testRead_Update_ReadOther_Save();

    }
}
