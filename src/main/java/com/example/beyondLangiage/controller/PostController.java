package com.example.beyondLangiage.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.beyondLangiage.dao.PostsDao;
import com.example.beyondLangiage.dao.UsersDao;
import com.example.beyondLangiage.languages.English;
import com.example.beyondLangiage.languages.French;
import com.example.beyondLangiage.languages.Punjabi;
import com.example.beyondLangiage.model.Posts;
import com.example.beyondLangiage.translator.Translator;

@Controller
public class PostController {

    English eng = new English();
    Punjabi pbi = new Punjabi();
    French fr = new French();
    
    
    private String currentUser, userEmail;

    

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    // this should be managed through post conttroller
    public ModelAndView loginAgain(String userName, String lang) {
        setCurrentUser(userName );
        System.out.println(userName);

        String language = lang.replace(" ", "");
        System.out.println(language);
        ModelAndView modelView = new ModelAndView();
        boolean langtest = language == "pa";
        System.out.println(langtest);
        if (language.contentEquals("en")) {
            modelView.addObject("notice", "Congratulations! " + userName + "<br>You have been Registered..");

            
            
            
            modelView.addObject("signIn", eng.getSignIn());
            modelView.addObject("email", eng.getEnterEmail());
            modelView.addObject("password", eng.getPassword());
            modelView.addObject("Login", eng.getLogIn());
            modelView.addObject("english", eng.getLangLink());
            modelView.addObject("punjabi", pbi.getLangLink());
            modelView.addObject("french", fr.getLangLink());
            modelView.addObject("createAnAccount", eng.getCreateNewAccount());
            modelView.addObject("createlink", eng.getCreateLinkNav());
        } else if (language.contentEquals("pa")) {

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

        } else if (language.contentEquals("fr")) {

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
    public ModelAndView dashboard(@RequestParam("email") String email) {

        // get username and Preffered language form dataabase and pass it to The
        // required method
        setUserEmail(email);
        String userName = (UsersDao.emailAndLanguage(email)[0]); // userName
        String lang = (UsersDao.emailAndLanguage(email)[1]); // Lang

        setCurrentUser(userName );
        
        
        ModelAndView mv = new ModelAndView("dashboard.jsp");

        if(lang.contentEquals("en")) {
            
            mv.addObject("dash", eng);
        }else if(lang.contentEquals("pa")) {
            
            mv.addObject("dash", pbi);
        }else{
            mv.addObject("dash", fr);
        }
        
        
        
        mv.addObject("name", userName);

        ArrayList<String> prefLang = new ArrayList<>();

        if (lang.contentEquals("en")) {

            for (int i = 0; i < PostsDao.readAllPosts().size(); i++) {

                prefLang.add(PostsDao.readAllPosts().get(i).getEn());
            }

        } else if (lang.contentEquals("pa")) {
            for (int i = 0; i < PostsDao.readAllPosts().size(); i++) {

                prefLang.add(PostsDao.readAllPosts().get(i).getPa());
            }

        } else {

            for (int i = 0; i < PostsDao.readAllPosts().size(); i++) {

                prefLang.add(PostsDao.readAllPosts().get(i).getFr());
            }
        }

        // mv.addObject("lang", lang);
        
        
        
        String[] colorCode = new String[3];
        
       colorCode[0] = "aaa";
       colorCode[1] = "bbb";
       colorCode[2] = "ccc";
       
       String color= colorCode[0];
        
        

        String postDiv = "";

        for (int i = 0; i < PostsDao.readAllPosts().size(); i++) {
            
            if(color==colorCode[0]) {
                color = colorCode[1];
                
                
            }else if(color==colorCode[1]) {
                color = colorCode[2];
                
                
            }else {
                
                color = colorCode[0];
                
            }
            

            postDiv = postDiv + "<div class=\"row\">\r\n"
                    + "  <div class=\"column\" style=\"background-color:#"+color+";\">\r\n" + "    <h2>"
                    + PostsDao.readAllPosts().get(i).getUser() + "</h2>\r\n" + "    <p>"
                    + prefLang.get(i) + "</p>\r\n" + "  </div>";

        }

        mv.addObject("posts", postDiv);

        return mv;

    }
    
    
    public ModelAndView postReload(String email) {

        // get username and Preffered language form dataabase and pass it to The
        // required method

        String userName = (UsersDao.emailAndLanguage(email)[0]); // userName
        String lang = (UsersDao.emailAndLanguage(email)[1]); // Lang

        setCurrentUser(userName );
       
        
        
        ModelAndView mv = new ModelAndView("dashboard.jsp");

        if(lang.contentEquals("en")) {
            
            mv.addObject("dash", eng);
        }else if(lang.contentEquals("pa")) {
            
            mv.addObject("dash", pbi);
        }else{
            mv.addObject("dash", fr);
        }
        
        
        
        mv.addObject("name", userName);

        ArrayList<String> prefLang = new ArrayList<>();

        if (lang.contentEquals("en")) {

            for (int i = 0; i < PostsDao.readAllPosts().size(); i++) {

                prefLang.add(PostsDao.readAllPosts().get(i).getEn());
            }

        } else if (lang.contentEquals("pa")) {
            for (int i = 0; i < PostsDao.readAllPosts().size(); i++) {

                prefLang.add(PostsDao.readAllPosts().get(i).getPa());
            }

        } else {

            for (int i = 0; i < PostsDao.readAllPosts().size(); i++) {

                prefLang.add(PostsDao.readAllPosts().get(i).getFr());
            }
        }

        // mv.addObject("lang", lang);
        
        
        
        String[] colorCode = new String[3];
        
       colorCode[0] = "aaa";
       colorCode[1] = "bbb";
       colorCode[2] = "ccc";
       
       String color= colorCode[0];
        
        

        String postDiv = "";

        for (int i = 0; i < PostsDao.readAllPosts().size(); i++) {
            
            if(color==colorCode[0]) {
                color = colorCode[1];
                
                
            }else if(color==colorCode[1]) {
                color = colorCode[2];
                
                
            }else {
                
                color = colorCode[0];
                
            }
            

            postDiv = postDiv + "<div class=\"row\">\r\n"
                    + "  <div class=\"column\" style=\"background-color:#"+color+";\">\r\n" + "    <h2>"
                    + PostsDao.readAllPosts().get(i).getUser() + "</h2>\r\n" + "    <p>"
                    + prefLang.get(i) + "</p>\r\n" + "  </div>";

        }

        mv.addObject("posts", postDiv);

        return mv;

    }

    @RequestMapping("post")
    public ModelAndView post(@RequestParam("message") String msg) {

        System.out.println(getCurrentUser());
        String user = getCurrentUser();
                
        System.out.println(Translator.detectedLanguage(msg));
        Posts post = new Posts();
        
        if(Translator.detectedLanguage(msg).contentEquals("en")) {
            
            post.setUser(getCurrentUser());
            post.setEn(msg);
            post.setPa(Translator.translateToPunjabi(msg));
            post.setFr(Translator.translateToFrench(msg));
            
            PostsDao.addPost(post);
            
            
            
        }else if(Translator.detectedLanguage(msg).contentEquals("pa")) {

            post.setUser(getCurrentUser());
            post.setPa(msg);
            post.setEn(Translator.translateToEnglish(msg));
            post.setFr(Translator.translateToFrench(msg));
            
            PostsDao.addPost(post);
            
            
        }else{
           
            post.setUser(getCurrentUser());
            post.setFr(msg);
            post.setPa(Translator.translateToPunjabi(msg));
            post.setEn(Translator.translateToEnglish(msg));
            
            PostsDao.addPost(post);
            
            
        }
        
        
        
        
        

        return postReload(getUserEmail());
    }
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    

}
