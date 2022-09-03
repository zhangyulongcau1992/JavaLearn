package com.zyl.learn.hibernate.xml.test;

import com.zyl.learn.hibernate.xml.entity.many2many.Student;
import com.zyl.learn.hibernate.xml.entity.single.People;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 注意：要想验证死锁，每次需要设置不同的姓名
 */
public class TestDeadLock {
    public static void main(String[] args) throws org.hibernate.exception.LockAcquisitionException {

        for (int i = 0; i < 50; i++) {
            Configuration configuration = new Configuration().configure();
            SessionFactory factory = configuration.buildSessionFactory();
            int randomNumber = (int) (Math.random() * 1000);

            new Thread(() -> {

                Session session = factory.openSession();

                Student student = session.get(Student.class, 3);
                student.setName("王五" + randomNumber);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                People people = session.get(People.class, 1);
                people.setName("李四" + randomNumber);

                session.beginTransaction().commit();
                session.close();
            }).start();

            new Thread(() -> {
                Session session = factory.openSession();

                People people = session.get(People.class, 1);
                people.setName("陆雪琪" + randomNumber);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Student student = session.get(Student.class, 3);
                student.setName("张小凡" + randomNumber);

                session.beginTransaction().commit();
                session.close();

            }).start();
        }
    }
}
