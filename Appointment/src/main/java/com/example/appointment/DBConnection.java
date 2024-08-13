package com.example.appointment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection
{
    private final String user= "user";
    private final String password = "pass";
    private final String dbURL = "jdbc:mysql://localhost/test";
    private static Connection con;

   public static Connection connect(){
       try{
           Class.forName("");
       }catch(Exception e){
           e.printStackTrace();
           System.out.print("Connection failed");

       }
       //con = DriverManager.getConnection(dbURL, user, password);
       return con;
   }
   public static void dbEnd(){
       try{
           con.close();
       }catch(Exception e){
           e.printStackTrace();
           System.out.print("Connection wasn't closed");

       }

    }


}

