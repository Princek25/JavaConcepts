package com.workspace.jdbc;

import java.sql.*;

public class FetchData {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost: 3306/w3resource", "root", "mysql!159");

        PreparedStatement ps = con.prepareStatement("select * from countries");

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            int country_id = rs.getInt("country_id");
            System.out.println("Country Id: " + country_id);
            String country_name = rs.getNString("country_name");
            System.out.println("Country Name: " + country_name);
            int region_id = rs.getInt("region_id");
            System.out.println("Country region ID: " + region_id);
            System.out.println("*********************************");
        }
        con.close();
    }
}
