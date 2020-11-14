package com.example.beyondLangiage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.beyondLangiage.dao.UsersDao;
import com.example.beyondLangiage.languages.English;
import com.example.beyondLangiage.languages.French;
import com.example.beyondLangiage.languages.Punjabi;
import com.example.beyondLangiage.model.Users;

@Controller
public class AppController {

    UsersDao obj = new UsersDao();

    English eng = new English();

    Punjabi pbi = new Punjabi();

    French fr = new French();

    @RequestMapping("createAC")
    public ModelAndView createAccount() {
        ModelAndView mv = new ModelAndView();

        mv.addObject("createAcount", eng.getCreateNewAccount());
        mv.addObject("enterUsername", eng.getEnterUN());
        mv.addObject("enterEmail", eng.getEnterEmail());
        mv.addObject("enterPassword", eng.getEnterPassword());
        mv.addObject("Register", eng.getRegister());
        mv.addObject("cancel", eng.getCancel());
        mv.addObject("langOptions", langOptions());
        mv.addObject("cancellink", eng.getCancelLink());

        mv.setViewName("create.jsp");
        return mv;
    }

    @RequestMapping("PcreateAC")
    public ModelAndView createAccountP() {
        ModelAndView mv = new ModelAndView();

        mv.addObject("createAcount", pbi.getCreateNewAccount());
        mv.addObject("enterUsername", pbi.getEnterUN());
        mv.addObject("enterEmail", pbi.getEnterEmail());
        mv.addObject("enterPassword", pbi.getEnterPassword());
        mv.addObject("Register", pbi.getRegister());
        mv.addObject("cancel", pbi.getCancel());
        mv.addObject("cancellink", pbi.getCancelLink());
        mv.addObject("langOptions", langOptions());

        mv.setViewName("create.jsp");
        return mv;
    }

    @RequestMapping("FcreateAC")
    public ModelAndView createAccountF() {
        ModelAndView mv = new ModelAndView();

        mv.addObject("createAcount", fr.getCreateNewAccount());
        mv.addObject("enterUsername", fr.getEnterUN());
        mv.addObject("enterEmail", fr.getEnterEmail());
        mv.addObject("enterPassword", fr.getEnterPassword());
        mv.addObject("Register", fr.getRegister());
        mv.addObject("cancel", fr.getCancel());
        mv.addObject("cancellink", fr.getCancelLink());
        mv.addObject("langOptions", langOptions());

        mv.setViewName("create.jsp");
        return mv;
    }

    @RequestMapping("home")
    public ModelAndView home() {

        ModelAndView mv = new ModelAndView();
        mv.addObject("notice", " ");

        mv.addObject("signIn", eng.getSignIn());
        mv.addObject("email", eng.getEnterEmail());
        mv.addObject("password", eng.getPassword());
        mv.addObject("Login", eng.getLogIn());
        mv.addObject("english", eng.getLangLink());
        mv.addObject("punjabi", pbi.getLangLink());
        mv.addObject("french", fr.getLangLink());
        mv.addObject("createAnAccount", eng.getCreateNewAccount());
        mv.addObject("createlink", eng.getCreateLinkNav());
        mv.setViewName("home.jsp");

        return mv;
    }

    @RequestMapping("punjabiHome")
    public ModelAndView punjabiHome() {

        ModelAndView mv = new ModelAndView();
        mv.addObject("notice", " ");

        mv.addObject("signIn", pbi.getSignIn());
        mv.addObject("email", pbi.getEnterEmail());
        mv.addObject("password", pbi.getPassword());
        mv.addObject("Login", pbi.getLogIn());
        mv.addObject("punjabi", pbi.getLangLink());
        mv.addObject("english", eng.getLangLink());
        mv.addObject("french", fr.getLangLink());
        mv.addObject("createAnAccount", pbi.getCreateNewAccount());
        mv.addObject("createlink", pbi.getCreateLinkNav());
        mv.setViewName("home.jsp");

        return mv;
    }

    @RequestMapping("frenchHome")
    public ModelAndView frenchHome() {

        ModelAndView mv = new ModelAndView();
        mv.addObject("notice", " ");
        mv.addObject("signIn", fr.getSignIn());
        mv.addObject("email", fr.getEnterEmail());
        mv.addObject("password", fr.getPassword());
        mv.addObject("Login", fr.getLogIn());
        mv.addObject("punjabi", pbi.getLangLink());
        mv.addObject("english", eng.getLangLink());
        mv.addObject("french", fr.getLangLink());
        mv.addObject("createlink", fr.getCreateLinkNav());
        mv.addObject("createAnAccount", fr.getCreateNewAccount());
        mv.setViewName("home.jsp");

        return mv;
    }

    

    public String langOptions() {

        String options = "<option class=\"un \" value=\"en\">Language, ਭਾਸ਼ਾ, Langue</option>\r\n"
                + "<option class=\"un \" value=\"en\">" + eng.getLangLink() + "</option>\r\n"
                + "    <option class=\"un \" value=\"pa\">" + pbi.getLangLink() + "</option>\r\n"
                + "    <option class=\"un \" value=\"fr\">" + fr.getLangLink() + "</option>\r\n";

        return options;

    }

    @RequestMapping("/registered")
    public ModelAndView register(@RequestParam("enterUserName") String username,
            @RequestParam("enterEmail") String email, @RequestParam("options") String lang,
            @RequestParam("enterPass") String password) {

        Users register = new Users();

        register.setEmail(email);
        register.setPassword(password);
        register.setPrefLang(lang);
        register.setUserName(username);
        UsersDao.registerUser(register); // adding user to database

        
        PostController dashboard = new PostController();
        
        
        
        
        
        return dashboard.loginAgain(username, lang);
    }

}
