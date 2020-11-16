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
    
    //Dadhboard page


    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return "vers l'application Beyond Language";
    }

    @Override
    public String getPostMsg() {
        // TODO Auto-generated method stub
        return "Envoyer un message:";
    }

    @Override
    public String getPostButton() {
        // TODO Auto-generated method stub
        return "PUBLIER";
    }

    @Override
    public String getHint() {
        // TODO Auto-generated method stub
        return "Que pensez-vous écrire?";
    }

    @Override
    public String getList() {
        // TODO Auto-generated method stub
        return "Vue en liste";
    }

    @Override
    public String getGrid() {
        // TODO Auto-generated method stub
        return "Vue Grille";
    }
        

        
        
        @Override
        public String getSent() {
            // TODO Auto-generated method stub
            return "Le message a été posté ...";
        }
        
        
        @Override
        public String getWelcome() {
            return "Bienvenu ";
        }
        
    
    
}
