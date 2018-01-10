package com.axqjx.ssm.dao;

import com.axqjx.ssm.model.Role;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzz on 2018/1/9.
 */
public interface RoleDao {

    public Role getRoleByRoleId(Integer roleId);
    List<Role> queryAllRoles();
}
