package com.example.beyondLangiage.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.beyondLangiage.model.Users;

public class UsersDao extends Database {

    
  

public static void registerUser(Users newUser) {
      
    Statement addStmt = null; 
    
    try {
        addStmt = conn.createStatement();
        addStmt.executeUpdate(addUser(newUser.getUserName(), newUser.getEmail(), newUser.getPrefLang(),  newUser.getPassword()));
    
    
    addStmt.close();
    }catch (SQLException ex){
        // handle any errors
        
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
      
      
      
  }
    

public static String[] emailAndLanguage(String email) {
    
    String[] details = new String[2];
    Statement stmt = null;
    ResultSet rs = null;

    try {
        stmt = conn.createStatement();
        rs = stmt.executeQuery(getUsername(email));

        while (rs.next()) {
            
            details[0]=rs.getString("userName");
            details[1]= rs.getString("lang");
               

            }
        stmt.close();
        // Now do something with the ResultSet ....
        }
    catch (SQLException ex){
        // handle any errors
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    } 
    
    return details;
    
    
}



    
    
    
}
