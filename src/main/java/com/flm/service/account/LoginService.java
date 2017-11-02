package com.flm.service.account;

import com.flm.dao.account.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginService {

    @Autowired
    LoginDao loginDao;

    public void login(String userName, String password) {
        loginDao.login();
    }
}
