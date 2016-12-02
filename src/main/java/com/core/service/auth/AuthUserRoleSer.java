package com.core.service.auth;

import com.core.model.auth.AuthUserRole;

public interface AuthUserRoleSer {
	int deleteByPrimaryKey(Long id);

	int insert(AuthUserRole record);

	int insertSelective(AuthUserRole record);

	AuthUserRole selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(AuthUserRole record);

	int updateByPrimaryKey(AuthUserRole record);
}
