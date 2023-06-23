package com.mycompany.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    private static Connection conn = null;
static String root="root";
static String password="";
    public static Connection getConnection() {
        if (conn != null) {
            return conn;
        } else {
            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/project?user="+root);
                return conn;
//            } catch (e) {
//                System.out.println("Failed to load MySQL JDBC driver.");
            } catch (SQLException e) {
                System.out.println("Failed to establish a database connection: " + e.getMessage());
            }
        }
        return null;
    }

//    public static void closeConnection() {
//        if (conn != null) {
//            try {
//                conn.close();
//            } catch (SQLException e) {
//                System.out.println("Failed to close the database connection: " + e.getMessage());
//            }
//        }
//    }
}
