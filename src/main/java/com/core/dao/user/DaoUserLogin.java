package com.core.dao.user;

import java.util.List;

import com.core.model.user.UserLogin;

public interface DaoUserLogin {
    int deleteByPrimaryKey(String userId);

    int insert(UserLogin record);

    int insertSelective(UserLogin record);

    UserLogin selectByPrimaryKey(String userId);
    
    List<UserLogin> selectBySelective(UserLogin record);

    int updateByPrimaryKeySelective(UserLogin record);

    int updateByPrimaryKey(UserLogin record);
}