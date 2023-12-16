package com.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession; // HttpSession import 추가

@Controller
@RequestMapping(value="/login")
public class LoginController {


    @Autowired
    UserServiceImpl service;
    private UserVO vo;
    private HttpSession session;

    @RequestMapping(value= "/login/list", method = RequestMethod.GET)
    public String login(String t, Model model) {
        System.out.println("LoginController - login method called");
        return "login";
    }
    @RequestMapping(value = "/loginOk", method = RequestMethod.POST)
    public String loginCheck(UserVO vo, HttpSession session) {
        System.out.println("LoginController - loginCheck method called");

        String returnURL = "";

        if(session.getAttribute("login") != null){
            session.removeAttribute("login");
        }

        UserVO loginvo = service.getUser(vo);

        if(loginvo != null){
            System.out.println("로그인 성공");
            session.setAttribute("login", loginvo);
            returnURL = "redirect:/login";
        } else {
            System.out.println("로그인 실패");
            returnURL = "redirect:/login/login";
        }

        return returnURL;
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login/login";
    }
}
