package com.food_app;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterUser {
    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();

            String name = "Siri";
            String email = "siri@gmail.com";
            String password = "1234";

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO users(name, email, password) VALUES(?,?,?)"
            );

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);

            ps.executeUpdate();

            System.out.println("User Registered ✅");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}