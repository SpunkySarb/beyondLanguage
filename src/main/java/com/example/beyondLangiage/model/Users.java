package com.example.beyondLangiage.model;

import org.springframework.stereotype.Component;

@Component
public class Users {

   
    
   private String userName;
    private String email;
    private String prefLang;
    private String password;
    
    
    public String getPrefLang() {
        return prefLang;
    }
    public void setPrefLang(String prefLang) {
        this.prefLang = prefLang;
    }
   
   
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
