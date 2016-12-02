package com.core.service.auth;

import com.core.model.auth.AuthRoleFunction;

public interface AuthRoleFunctionSer {

	int deleteByPrimaryKey(Long id);

	int insert(AuthRoleFunction record);

	int insertSelective(AuthRoleFunction record);

	AuthRoleFunction selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(AuthRoleFunction record);

	int updateByPrimaryKey(AuthRoleFunction record);
}
