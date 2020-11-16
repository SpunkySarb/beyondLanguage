package com.example.beyondLangiage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Database {

    static Connection conn = null;
    
  
    
public Database() {
        
        try {
            conn =
               DriverManager.getConnection("jdbc:mysql://localhost/multilingualdb?" +
                                           "user=root&password=1212");
System.out.println("connected");
            // Do something with the Connection

          System.out.println("Connected");
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    
    
}
    




public static String addUser(String userName, String email, String lang, String password) {
    
    String query= " INSERT INTO `multilingualdb`.`users` ( `userName`, `email`, `password`, `lang`) VALUES ( '"+userName+"', '"+email+"', '"+password+"', '"+lang+"');";

    
    
    
    
    return query;
}



public static String getUsername(String email) {
    
    String query= " select `userName`, `lang` from `multilingualdb`.`users` where email= '"+email+"' ;";

    
    
    
    
    return query;
}



public static String getAllPosts() {
    
    String query= " select `user`, `en` , `pa`, `fr` from `multilingualdb`.`posts` order by time DESC ;";

    
    
    
    
    return query;
}


public static String addPostQuery(String user, String msgEn, String msgPa, String msgFr) {
    
    String query= " INSERT INTO `multilingualdb`.`posts` ( `user`, `en`, `pa`, `fr`) VALUES ( '"+user+"', '"+msgEn+"', '"+msgPa+"', '"+msgFr+"');";

    
    
    
    
    return query;
}
    
    
    
    
    
    
    
    
    
    
    
    
    
}
