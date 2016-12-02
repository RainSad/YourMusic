package com.core.service.auth;

import java.util.Collection;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.dao.auth.AuthUserMapper;
import com.core.model.auth.AuthUser;

@Service
@Transactional
public class AuthUserSerImp implements AuthUserSer{

	@Resource
	private AuthUserMapper authUserMapper;
	
	public int deleteByPrimaryKey(Long id) {
		return authUserMapper.deleteByPrimaryKey(id);
	}

	public int insert(AuthUser record) {
		return authUserMapper.insert(record);
	}

	public int insertSelective(AuthUser record) {
		return authUserMapper.insertSelective(record);
	}

	public AuthUser selectByPrimaryKey(Long id) {
		return authUserMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(AuthUser record) {
		return authUserMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(AuthUser record) {
		return authUserMapper.updateByPrimaryKey(record);
	}

	public AuthUser selectBySelective(AuthUser record) {
		return authUserMapper.selectBySelective(record);
	}
	public Collection<AuthUser> findByIds(Collection<Long> ids) {
		return authUserMapper.selectByPrimaryKeys(ids);
	}

	public Collection<AuthUser> selectWithPagenation(Integer page,Integer size) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("page", page);
		map.put("size", size);
		return authUserMapper.selectWithPagenation(map);
	}

}
