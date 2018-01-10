package com.axqjx.ssm.service.imlp;

import com.axqjx.ssm.model.Role;
import com.axqjx.ssm.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qjx on 2018/1/5.
 */
public interface IUserService {
    public void register(User user);
    public Role getRole(Integer roleId);
    List<Role> queryAllRoles();
    boolean checkUserName(String userName);
    User login(String username, String password);
}
