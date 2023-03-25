package com.zyl.learn.hibernate.xml.test;

import com.zyl.learn.hibernate.xml.entity.one2many.Customer;
import com.zyl.learn.hibernate.xml.entity.one2many.OrderItem;
import com.zyl.learn.hibernate.xml.entity.one2many.Orders;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName:TestOne2Many
 * Package:com.zyl.learn.hibernate.xml.test
 * Description:
 *
 * @Date:2022/3/26 21:22
 * @Author:zhangyulong@qq.com
 */
public class TestOne2Many {
    public void testSave() {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        Customer customer = session.get(Customer.class, 2);
        Orders orders = new Orders();
        orders.setName("订单14");
        orders.setId(0);
        orders.setCustomer(customer);

        OrderItem orderItem = new OrderItem();
        orderItem.setId(0);
        orderItem.setName("苹果2");
        orderItem.setOrders(orders);
        Set<OrderItem> orderItems = new HashSet<>();
        orderItems.add(orderItem);
        orders.setOrderItems(orderItems);

        session.save(orders);
        session.save(orderItem);

        session.beginTransaction().commit();
        session.close();
    }

    public void testSaveOrders() {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        Customer customer = new Customer();
        customer.setId(1);
        Orders orders = new Orders();
        orders.setName("订单1");
        orders.setCustomer(customer);
        session.save(orders);

        session.beginTransaction().commit();
        session.close();
    }


    public void testReadCustomer() {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        Customer customer = session.get(Customer.class, 1);
        Hibernate.initialize(customer.getOrders());

        session.close();
        if (null != customer.getOrders()) {
            System.out.println(customer.getOrders());
        }
    }

    public void testReadOrders() {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        Orders orders = session.get(Orders.class, 1);
        System.out.println(orders);
        System.out.println(orders.getCustomer());

        session.close();
    }

    public void testDeleteCustomer() {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        Customer customer = session.get(Customer.class, 5);
        session.delete(customer);

        session.beginTransaction().commit();
        session.close();
    }

    public static void main(String[] args) {
        TestOne2Many test = new TestOne2Many();
        test.testSave();
    }
}
