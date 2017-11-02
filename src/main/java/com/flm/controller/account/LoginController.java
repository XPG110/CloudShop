package com.flm.controller.account;

import com.flm.service.account.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/user")
public class LoginController {

    @Autowired
    public LoginService loginService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public void login(String userName, String password) {
        System.out.println("****************");
    }
}
