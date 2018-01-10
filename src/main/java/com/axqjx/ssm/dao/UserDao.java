package com.axqjx.ssm.dao;

import com.axqjx.ssm.model.User;

/**
 * Created by qjx on 2018/1/5.
 */
public interface UserDao {

    Integer deleteByPrimaryKey(Integer id);

    Integer insert(User record);

    Integer insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    Integer selectByUserName(String userName);

    Integer updateByPrimaryKeySelective(User record);

    Integer updateByPrimaryKey(User record);
}
