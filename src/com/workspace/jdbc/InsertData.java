package com.workspace.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver class loaded successfully");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/w3resource", "root", "mysql!159");
            PreparedStatement ps = con.prepareStatement("insert into countries values(104, 'Armenia', 56)");

            int i = ps.executeUpdate();
            if (i > 0) { // if the value successfully inserted in the database then the value of i will be greater than 0
                System.out.println("insert successfully");
            } else System.out.println("insertion failed");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("dsf");
        }
    }
}
