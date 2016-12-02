package com.core.service.auth;

import com.core.model.auth.AuthFunction;

public interface AuthFunctionSer {
	int deleteByPrimaryKey(Long id);

	int insert(AuthFunction record);

	int insertSelective(AuthFunction record);

	AuthFunction selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(AuthFunction record);

	int updateByPrimaryKey(AuthFunction record);
}
