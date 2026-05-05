package com.food_app;

import java.sql.*;

public class LoginUser {
    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();

            String email = "siri@gmail.com";
            String password = "1234";

            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM users WHERE email=? AND password=?"
            );

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Login Successful ✅");
            } else {
                System.out.println("Invalid Credentials ❌");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}