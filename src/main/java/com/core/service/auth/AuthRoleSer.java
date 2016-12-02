package com.core.service.auth;

import com.core.model.auth.AuthRole;

public interface AuthRoleSer {
	int deleteByPrimaryKey(Long id);

	int insert(AuthRole record);

	int insertSelective(AuthRole record);

	AuthRole selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(AuthRole record);

	int updateByPrimaryKey(AuthRole record);
}
