package com.example.beyondLangiage.model;

import org.springframework.stereotype.Component;

@Component
public class AppLanguage {

private String langCode, loginButton, postButton, fname, lname, appTitle;

public String getLangCode() {
    return langCode;
}

public void setLangCode(String langCode) {
    this.langCode = langCode;
}

public String getLoginButton() {
    return loginButton;
}

public void setLoginButton(String loginButton) {
    this.loginButton = loginButton;
}

public String getPostButton() {
    return postButton;
}

public void setPostButton(String postButton) {
    this.postButton = postButton;
}

public String getFname() {
    return fname;
}

public void setFname(String fname) {
    this.fname = fname;
}

public String getLname() {
    return lname;
}

public void setLname(String lname) {
    this.lname = lname;
}

public String getAppTitle() {
    return appTitle;
}

public void setAppTitle(String appTitle) {
    this.appTitle = appTitle;
}
    
    
    
    
    
    
    
    
    
    
    
    
}
