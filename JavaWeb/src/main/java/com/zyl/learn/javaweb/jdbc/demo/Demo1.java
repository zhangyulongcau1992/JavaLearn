package com.zyl.learn.javaweb.jdbc.demo;

import com.zyl.learn.javaweb.jdbc.entity.People;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Demo1
 * Package:com.zyl.learn.javaweb.jdbc.demo
 * Description:
 *
 * @Date:2022/8/4 14:14
 * @Author:zhangyulong@qq.com
 */
public class Demo1 {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //com.mysql.jdbc.Driver 是 mysql-connector-java 5中的，
            //com.mysql.cj.jdbc.Driver 是 mysql-connector-java 6以及以上中的
            String driverName = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/test";
            String userName = "root";
            String password = "root";
            String sql = "select * from people";

            Class.forName(driverName);
            conn = DriverManager.getConnection(url, userName, password);
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            List<People> peoples = new ArrayList<>();
            while (rs.next()) {
                People people = new People();
                people.setId(rs.getInt("id"));
                people.setMoney(rs.getDouble("money"));
                people.setName(rs.getString("name"));
                people.setNation(rs.getString("nation"));
                peoples.add(people);
            }
            System.out.println(peoples);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (null != rs) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != ps) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != conn) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
