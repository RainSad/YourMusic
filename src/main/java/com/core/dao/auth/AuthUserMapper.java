package com.core.dao.auth;

import java.util.Collection;
import java.util.Map;

import com.core.model.auth.AuthUser;

public interface AuthUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AuthUser record);

    int insertSelective(AuthUser record);

    AuthUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthUser record);

    int updateByPrimaryKey(AuthUser record);
    
    AuthUser selectBySelective(AuthUser record);
    
    Collection<AuthUser> selectByPrimaryKeys(Collection<Long> ids);
    /**
     * 分页查询
     * @param map 两个参数 page  size
     */
    Collection<AuthUser> selectWithPagenation(Map<String,Integer> map);
	
}