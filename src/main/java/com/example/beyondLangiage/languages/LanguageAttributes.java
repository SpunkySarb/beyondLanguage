package com.example.beyondLangiage.languages;

public abstract class LanguageAttributes {

    
    /**
     * declaring default homepage text variables which are gonna vary according to the lannguage chosen
     * 
     */
    
    protected String signIn= "Sign in", username= "Username", langLink="English(US)",
           password = "Password", logIn= "Login", createNewAccount= "Create an Account",
           createLinkNav="createAC",
           
           //CreateAcountPage
           enterUN= "Enter Username",
           enterEmail="Enter Email",
           enterPassword="Enter Password",
           register="Register",
           cancel="Cancel",
           cancelLink="home"
           
           
           
           ;

    public String getCancelLink() {
        return cancelLink;
    }


    public String getCreateLinkNav() {
        return createLinkNav;
    }


    public String getEnterUN() {
        return enterUN;
    }



    public String getEnterEmail() {
        return enterEmail;
    }



    public String getEnterPassword() {
        return enterPassword;
    }


    public String getRegister() {
        return register;
    }


    public String getCancel() {
        return cancel;
    }



    public String getLangLink() {
        return langLink;
    }



    



    public String getSignIn() {
        return signIn;
    }

   

    public String getUsername() {
        return username;
    }

  

    public String getPassword() {
        return password;
    }

   

    public String getLogIn() {
        return logIn;
    }

   

    public String getCreateNewAccount() {
        return createNewAccount;
    }

    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
