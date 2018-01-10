package com.axqjx.ssm.controller;

import com.axqjx.ssm.model.Role;
import com.axqjx.ssm.model.User;
import com.axqjx.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by qjx on 2018/1/5.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService us;

    @RequestMapping("/register")
    public ModelAndView register(HttpServletRequest request,  String userName, String password,
                                 @RequestParam(defaultValue = "7")Integer roleId) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setRoleId(roleId);
        us.register(user);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.setViewName("login");
        return mv;
    }

    @RequestMapping("/queryRoles")
    @ResponseBody
    public List<Role> queryRoles() {
            return us.queryAllRoles();
    }

    @RequestMapping("/checkUserName")
    @ResponseBody
    public boolean checkUserName(String userName) {
        return us.checkUserName(userName);
    }

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request,  String userName, String password) {
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user = us.login(userName, password);
        if(user != null) {
            mv.addObject("user", user);
            mv.setViewName("index");
        }else {
            mv.addObject("msg", "用户名或密码错误");
            mv.setViewName("login");
        }
        return mv;
    }

}
