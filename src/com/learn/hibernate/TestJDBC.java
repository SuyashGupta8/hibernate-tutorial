package com.learn.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * downloaded jdbc driver for mysql --> sqlconnector/j from dev mysql website which will be internally used by java driver manager
 * build connection as below
 * additionally we have hibernate jar(dowonloaded from : hibernate.org) whih is not required here for jdbc connection
 */
public class TestJDBC {

    public static void main (String[] args){
        String jdbcurl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
        String passsword = "Random@8";
        String user = "hbstudent";

         try{
             System.out.print("testing jdbc");
             Connection myConnection = DriverManager.getConnection(jdbcurl, user, passsword);
             System.out.print("connection established successfully to url:  "+ jdbcurl);
         }catch (Exception exception){
             System.out.print(exception);
         }
    }
}
