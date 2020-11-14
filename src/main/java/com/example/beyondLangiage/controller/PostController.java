package com.example.beyondLangiage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.beyondLangiage.dao.UsersDao;
import com.example.beyondLangiage.languages.English;
import com.example.beyondLangiage.languages.French;
import com.example.beyondLangiage.languages.Punjabi;

@Controller
public class PostController {

    
    English eng = new English();
    Punjabi pbi = new Punjabi();
    French fr = new French();
    
    
    
     // this should be managed through post conttroller
    public ModelAndView loginAgain(String userName,String lang) {

        System.out.println(userName);
       
        String language = lang.replace(" ", "");
        System.out.println(language);
        ModelAndView modelView = new ModelAndView();
        boolean langtest = language=="pa";
        System.out.println(langtest);
        if(language.contentEquals("en")) {
        modelView.addObject("notice", "Congratulations! "+userName+"<br>You have been Registered..");

        modelView.addObject("signIn", eng.getSignIn());
        modelView.addObject("email", eng.getEnterEmail());
        modelView.addObject("password", eng.getPassword());
        modelView.addObject("Login", eng.getLogIn());
        modelView.addObject("english", eng.getLangLink());
        modelView.addObject("punjabi", pbi.getLangLink());
        modelView.addObject("french", fr.getLangLink());
        modelView.addObject("createAnAccount", eng.getCreateNewAccount());
        modelView.addObject("createlink", eng.getCreateLinkNav());
        } else
            if(language.contentEquals("pa")) {
            
           
           
            
            modelView.addObject("notice", "ਵਧਾਈਆਂ!" + userName + "<br> ਤੁਸੀਂ ਰਜਿਸਟਰ ਹੋ.");
            modelView.addObject("signIn", pbi.getSignIn());
            modelView.addObject("email", pbi.getEnterEmail());
            modelView.addObject("password", pbi.getPassword());
            modelView.addObject("Login", pbi.getLogIn());
            modelView.addObject("punjabi", pbi.getLangLink());
            modelView.addObject("english", eng.getLangLink());
            modelView.addObject("french", fr.getLangLink());
            modelView.addObject("createAnAccount", pbi.getCreateNewAccount());
            modelView.addObject("createlink", pbi.getCreateLinkNav());
           
        } else if(language.contentEquals("fr")) {
            
            modelView.addObject("notice", "\"Toutes nos félicitations!" + userName + "<br> Vous êtes inscrit.\" ");
            modelView.addObject("signIn", fr.getSignIn());
            modelView.addObject("email", fr.getEnterEmail());
            modelView.addObject("password", fr.getPassword());
            modelView.addObject("Login", fr.getLogIn());
            modelView.addObject("punjabi", pbi.getLangLink());
            modelView.addObject("english", eng.getLangLink());
            modelView.addObject("french", fr.getLangLink());
            modelView.addObject("createlink", fr.getCreateLinkNav());
            modelView.addObject("createAnAccount", fr.getCreateNewAccount());
        }
       
        modelView.setViewName("home.jsp");

        return modelView;
    }
    
    
    
    @RequestMapping("dashboard")
    public ModelAndView dashboard(@RequestParam("email") String email){
       
        //get username and Preffered language form dataabase and pass it to The required method
        
        String userName = (UsersDao.emailAndLanguage(email)[0]); // userName
        String lang =(UsersDao.emailAndLanguage(email)[1]); //Lang
        
         ModelAndView mv= new ModelAndView("dashboard.jsp");
        
         mv.addObject("name", userName );
      //   mv.addObject("lang", lang);
        
        
        
        
        return mv;
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

