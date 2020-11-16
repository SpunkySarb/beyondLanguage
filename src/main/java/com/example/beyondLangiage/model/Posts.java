package com.example.beyondLangiage.model;

import org.springframework.stereotype.Component;

@Component
public class Posts {

    
    private String user;
    private String en, fr, pa;
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getEn() {
        return en;
    }
    public void setEn(String en) {
        this.en = en;
    }
    public String getFr() {
        return fr;
    }
    public void setFr(String fr) {
        this.fr = fr;
    }
    public String getPa() {
        return pa;
    }
    public void setPa(String pa) {
        this.pa = pa;
    }
   
}

