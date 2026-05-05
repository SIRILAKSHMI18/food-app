package com.food_app;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class OrderFood {
    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();

            int user_id = 1;   // existing user id
            int food_id = 1;   // Pizza
            int quantity = 2;

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO orders(user_id, food_id, quantity) VALUES(?,?,?)"
            );

            ps.setInt(1, user_id);
            ps.setInt(2, food_id);
            ps.setInt(3, quantity);

            ps.executeUpdate();

            System.out.println("Order Placed ✅");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}