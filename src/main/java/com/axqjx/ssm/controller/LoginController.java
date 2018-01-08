package com.axqjx.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by qjx on 2018/1/5.
 */
@Controller
@RequestMapping("/")
public class LoginController {


    @RequestMapping("/")
    public  String index(HttpServletRequest request,HttpServletResponse response) {
        return "index";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request) {

        return "login";
    }

}
