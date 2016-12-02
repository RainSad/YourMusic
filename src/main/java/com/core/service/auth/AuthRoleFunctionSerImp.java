package com.core.service.auth;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.dao.auth.AuthRoleFunctionMapper;
import com.core.model.auth.AuthRoleFunction;

@Service
@Transactional
public class AuthRoleFunctionSerImp implements AuthRoleFunctionSer{

	@Resource
	private AuthRoleFunctionMapper authRoleFunctionMapper;
	
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return authRoleFunctionMapper.deleteByPrimaryKey(id);
	}

	public int insert(AuthRoleFunction record) {
		// TODO Auto-generated method stub
		return authRoleFunctionMapper.insert(record);
	}

	public int insertSelective(AuthRoleFunction record) {
		// TODO Auto-generated method stub
		return authRoleFunctionMapper.insertSelective(record);
	}

	public AuthRoleFunction selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return authRoleFunctionMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(AuthRoleFunction record) {
		// TODO Auto-generated method stub
		return authRoleFunctionMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(AuthRoleFunction record) {
		// TODO Auto-generated method stub
		return authRoleFunctionMapper.updateByPrimaryKey(record);
	}

}
