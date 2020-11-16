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
           cancelLink="home",
           
           
           
           //dashboard page
           title="to Beyond Language App",
           postMsg="Post a Message:",
           hint= "What are you thinking to write ?",
           postButton="POST",
           list="List View",
           grid= "Grid VIew",
           sent= "Message has been posted...",
           welcome="Welcome "
           
           
           
           ;

    public String getWelcome() {
        return welcome;
    }


    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getPostMsg() {
        return postMsg;
    }


    public void setPostMsg(String postMsg) {
        this.postMsg = postMsg;
    }


    public String getHint() {
        return hint;
    }


    public void setHint(String hint) {
        this.hint = hint;
    }


    public String getPostButton() {
        return postButton;
    }


    public void setPostButton(String postButton) {
        this.postButton = postButton;
    }


    public String getList() {
        return list;
    }


    public void setList(String list) {
        this.list = list;
    }


    public String getGrid() {
        return grid;
    }


    public void setGrid(String grid) {
        this.grid = grid;
    }


    public String getSent() {
        return sent;
    }


    public void setSent(String sent) {
        this.sent = sent;
    }


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
