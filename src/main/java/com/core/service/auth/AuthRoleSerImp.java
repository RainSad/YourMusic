package com.core.service.auth;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.dao.auth.AuthRoleMapper;
import com.core.model.auth.AuthRole;

@Service
@Transactional
public class AuthRoleSerImp implements AuthRoleSer{

	@Resource
	private AuthRoleMapper authRoleMapper;

	public int deleteByPrimaryKey(Long id) {
		return authRoleMapper.deleteByPrimaryKey(id);
	}

	public int insert(AuthRole record) {
		return authRoleMapper.insert(record);
	}

	public int insertSelective(AuthRole record) {
		return authRoleMapper.insertSelective(record);
	}

	public AuthRole selectByPrimaryKey(Long id) {
		return authRoleMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(AuthRole record) {
		return authRoleMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(AuthRole record) {
		return authRoleMapper.updateByPrimaryKey(record);
	}

}
