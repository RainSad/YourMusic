package com.core.service.auth;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.dao.auth.AuthUserRoleMapper;
import com.core.model.auth.AuthUserRole;

@Service
@Transactional
public class AuthUserRoleSerImp implements AuthUserRoleSer{

	@Resource
	private AuthUserRoleMapper authUserRoleMapper;
	
	public int deleteByPrimaryKey(Long id) {
		return authUserRoleMapper.deleteByPrimaryKey(id);
	}

	public int insert(AuthUserRole record) {
		return authUserRoleMapper.insert(record);
	}

	public int insertSelective(AuthUserRole record) {
		return authUserRoleMapper.insertSelective(record);
	}

	public AuthUserRole selectByPrimaryKey(Long id) {
		return authUserRoleMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(AuthUserRole record) {
		return authUserRoleMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(AuthUserRole record) {
		// TODO Auto-generated method stub
		return authUserRoleMapper.updateByPrimaryKey(record);
	}

}
