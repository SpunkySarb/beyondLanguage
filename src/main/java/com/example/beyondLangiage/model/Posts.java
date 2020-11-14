package com.example.beyondLangiage.model;

import org.springframework.stereotype.Component;

@Component
public class Posts {

    
    private int postID;
    private String en, fr, sp, ar, pa;
    public int getPostID() {
        return postID;
    }
    public void setPostID(int postID) {
        this.postID = postID;
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
    public String getSp() {
        return sp;
    }
    public void setSp(String sp) {
        this.sp = sp;
    }
    public String getAr() {
        return ar;
    }
    public void setAr(String ar) {
        this.ar = ar;
    }
    public String getPa() {
        return pa;
    }
    public void setPa(String pa) {
        this.pa = pa;
    }
    
    
    
    
    
    
    
    
    
    
    
}

