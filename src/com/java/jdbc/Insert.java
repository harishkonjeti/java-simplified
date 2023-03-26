package com.java.jdbc;
/*
 * Java JDBC Practical
 */

import java.sql.*;

public class Insert {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        
        String url ="jdbc:mysql://localhost:3306/hareesh";
        String username = "root";
        String password = "root";
        String query = "insert into student values(5, \"Arjun\");";
        Class.forName("com.mysql.cj.jdbc.Driver");
//        com.mysql.jdbc.Driver.class
    
        /*
         * select studentname from student where rollno=4;
         */
        
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        int count = st.executeUpdate(query);
        System.out.println(count+" row/s affected");
        
        st.close();
        con.close();
       
    }
}