package com.example.beyondLangiage.languages;

public class French extends LanguageAttributes {

    
    @Override
    public String getSignIn() {
        return "se connecter";
    }
  
    
    @Override
    public String getUsername() {
        return "Nom d'utilisateur";
    }
    
    @Override
    public String getPassword() {
        return "mot de passe";
    }
   
    @Override
    public String getLogIn() {
        return "s'identifier";
    }
   
    @Override
    public String getCreateNewAccount() {
        return "Créer un compte";
    }
   
    @Override
    public String getLangLink() {
        // TODO Auto-generated method stub
        return "français";
    }
    
    /**
     * page 2 after this method
     */
    @Override
    public String getCreateLinkNav() {
        return "FcreateAC";
    }

    @Override
    public String getEnterUN() {
        return "Saisissez votre nom d'utilisateur";
    }


    @Override
    public String getEnterEmail() {
        return "Entrez votre e-mail";
    }


    @Override
    public String getEnterPassword() {
        return "Entrer le mot de passe";
    }

    @Override
    public String getRegister() {
        return "S'inscrire";
    }

    @Override
    public String getCancel() {
        return "Annuler";
    }

    @Override
    public String getCancelLink() {
       
        return "frenchHome";
    }
    
    
    
}
