package com.axqjx.ssm.service;

import com.axqjx.ssm.dao.UserDao;
import com.axqjx.ssm.model.User;
import com.axqjx.ssm.service.imlp.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by qjx on 2018/1/5.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserDao ud;

    @Override
    public void register(User user) {
        ud.insert(user);
    }
}
