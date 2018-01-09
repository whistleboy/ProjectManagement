package com.axqjx.ssm.service;

import com.axqjx.ssm.dao.RoleDao;
import com.axqjx.ssm.dao.UserDao;
import com.axqjx.ssm.model.Role;
import com.axqjx.ssm.model.User;
import com.axqjx.ssm.service.imlp.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by qjx on 2018/1/5.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserDao ud;

    @Autowired
    private RoleDao rd;

    @Override
    public void register(User user) {
        ud.insert(user);
    }

    @Override
    public Role getRole(Integer roleId) {
        return rd.getRoleByRoleId(roleId);
    }

    @Override
    public ArrayList<Role> queryAllRoles() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles = rd.queryAllRoles();
        return null;
    }
}
