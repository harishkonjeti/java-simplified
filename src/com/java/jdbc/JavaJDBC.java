package com.java.jdbc;
/*
 * Java JDBC Practical
 */

import java.sql.*;

public class JavaJDBC {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        
        String url ="jdbc:mysql://localhost:3306/hareesh";
        String username = "root";
        String password = "root";
        String query = "select * from student;";
        Class.forName("com.mysql.cj.jdbc.Driver");
//        com.mysql.jdbc.Driver.class
    
        /*
         * select studentname from student where rollno=4;
         */
        
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()) {
//        	System.out.println("output "+rs.getString("studentname"));
        	String studentData = rs.getInt(1)+" : " +rs.getString(2);
        	System.out.println(studentData);
        }
        
        st.close();
        con.close();
    }
}