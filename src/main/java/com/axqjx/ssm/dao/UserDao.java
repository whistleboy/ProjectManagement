package com.axqjx.ssm.dao;

import com.axqjx.ssm.model.User;

/**
 * Created by qjx on 2018/1/5.
 */
public interface UserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
