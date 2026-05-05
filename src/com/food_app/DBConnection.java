package com.food_app;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/food_app",
                "root",
                "Bhanu@2006"
            );

            System.out.println("Connected Successfully ✅");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}