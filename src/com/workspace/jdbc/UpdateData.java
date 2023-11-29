package com.workspace.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // step1 - load and registered the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // step2 - create connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost: 3306/w3resource", "root", "mysql!159");

        // step3 - create statement
        PreparedStatement ps = con.prepareStatement("update countries set region_id = '18' where country_name = 'Armenia'");

        // step4 - execute sql statement
        int i = ps.executeUpdate();

        // step5 - process the result
        if (i>0){
            System.out.println("updated successfully");
        }
        else System.out.println("update fail");

        // step6 - close the connection
        con.close();
    }
}
