package com.core.service.auth;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.dao.auth.AuthFunctionMapper;
import com.core.model.auth.AuthFunction;

@Service
@Transactional
public class AuthFunctionSerImp implements AuthFunctionSer{

	@Resource
	private AuthFunctionMapper authFunctionMapper;

	public int deleteByPrimaryKey(Long id) {
		return authFunctionMapper.deleteByPrimaryKey(id);
	}

	public int insert(AuthFunction record) {
		return authFunctionMapper.insert(record);
	}

	public int insertSelective(AuthFunction record) {
		return authFunctionMapper.insertSelective(record);
	}

	public AuthFunction selectByPrimaryKey(Long id) {
		return authFunctionMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(AuthFunction record) {
		return authFunctionMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(AuthFunction record) {
		return authFunctionMapper.updateByPrimaryKey(record);
	}
	

}
