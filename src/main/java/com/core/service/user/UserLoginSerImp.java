package com.core.service.user;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.dao.user.DaoUserLogin;
import com.core.model.user.UserLogin;

@Service
@Transactional
public class UserLoginSerImp implements UserLoginSer {

	@Resource
	private DaoUserLogin daoUserLogin;
	
	@Override
	public int deleteByPrimaryKey(String userId) {
		return daoUserLogin.deleteByPrimaryKey(userId);
	}

	@Override
	public int insert(UserLogin record) {
		return daoUserLogin.insert(record);
	}

	@Override
	public int insertSelective(UserLogin record) {
		return daoUserLogin.insertSelective(record);
	}

	@Override
	public UserLogin selectByPrimaryKey(String userId) {
		return daoUserLogin.selectByPrimaryKey(userId);
	}

	@Override
	public List<UserLogin> selectBySelective(UserLogin record) {
		return daoUserLogin.selectBySelective(record);
	}
	
	@Override
	public int updateByPrimaryKeySelective(UserLogin record) {
		return daoUserLogin.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(UserLogin record) {
		return daoUserLogin.updateByPrimaryKey(record);
	}

}
