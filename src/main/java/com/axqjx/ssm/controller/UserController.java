package com.axqjx.ssm.controller;

import com.axqjx.ssm.model.User;
import com.axqjx.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by qjx on 2018/1/5.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService us;

    @RequestMapping("/insert")
    public ModelAndView insertUser(HttpServletRequest request,  String userName, String password, Model model) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        us.register(user);
        System.out.print("register success");
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.setViewName("user");
        return mv;
    }


}
