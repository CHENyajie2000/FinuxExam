package com.neu.DBUtil;

import redis.clients.jedis.Jedis;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 连接数据库
 */
public class DbHelper {
    private static String url = "jdbc:mysql://120.48.9.90:3306/FinalLinux";  //数据库地址
    private static String userName = "root";  //数据库用户名
    private static String passWord = "CHENyajie@20000702";  //数据库密码
    private static Connection conn = null;

    //private static Jedis jedis = null;

    private DbHelper() {
    }

    public static Connection getConnection() {
        if (null == conn) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, userName, passWord);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static void main(String[] args) {  //测试数据库是否连通
        System.err.println(getConnection());
    }
}
