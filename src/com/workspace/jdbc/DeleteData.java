package com.workspace.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost: 3306/w3resource", "root", "mysql!159");

        // delete a row
        PreparedStatement ps = con.prepareStatement("delete from countries where region_id = '18'");

        int i = ps.executeUpdate();

        if (i>0){
            System.out.println("delete successfully");
        }
        else System.out.println("delete fail");

        con.close();
    }
}
