package com.core.service.auth;

import java.util.Collection;

import com.core.model.auth.AuthUser;

public interface AuthUserSer {
	int deleteByPrimaryKey(Long id);

	int insert(AuthUser record);

	int insertSelective(AuthUser record);

	AuthUser selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(AuthUser record);

	int updateByPrimaryKey(AuthUser record);
	
	AuthUser selectBySelective(AuthUser record);
	/**根据ids查询用户*/
	Collection<AuthUser> findByIds(Collection<Long> ids);
	/**
     * 分页查询
     * @param map 两个参数 page  size
     */
    Collection<AuthUser> selectWithPagenation(Integer page,Integer size);
}
