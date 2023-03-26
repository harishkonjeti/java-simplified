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
        
        int rollno = 6;
        String studentname = "vijay";
        String query = "insert into student values(?,?);";
        Class.forName("com.mysql.cj.jdbc.Driver");    
                
        Connection con = DriverManager.getConnection(url, username, password);
        /*
         * com.mysql.jdbc.Driver.class
         * select studentname from student where rollno=4;
         * insert into student values(4, "Ram");
         * Statement st = con.createStatement();
         * int count = st.executeUpdate(query);
         * for adding dynamic values to DB we use Prepared Statement
         */
        
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, rollno);
        st.setString(2, studentname);
        int count = st.executeUpdate();
        System.out.println(count+" row/s affected");
        
        st.close();
        con.close();
       
    }
}