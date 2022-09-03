package com.zyl.learn.javaweb.jdbc.utils;

import java.sql.*;
import java.util.Properties;

/**
 * ClassName:JDBCUtils
 * Package:com.zyl.learn.javaweb.jdbc.utils
 * Description:
 *
 * @Date:2022/8/5 10:19
 * @Author:zhangyulong@qq.com
 */
public class JDBCUtils {
    private static String driver;
    private static String userName;
    private static String password;
    private static String url;

    static {
        Properties properties = PropertiesReader.readProperties("jdbc.properties");
        driver = properties.getProperty("mysql.driver");
        userName = properties.getProperty("mysql.username");
        password = properties.getProperty("mysql.password");
        url = properties.getProperty("mysql.url");

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, userName, password);
    }

    public static void close(Connection conn, Statement statement, ResultSet rs) {
        CommonUtils.safeClose(rs);
        close(conn, statement);
    }

    public static void close(Connection conn, Statement statement) {
        CommonUtils.safeClose(statement);
        close(conn);
    }
    
    public static void close(Connection conn) {
        CommonUtils.safeClose(conn);
    }


}
