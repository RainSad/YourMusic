package com.core.service.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.dao.user.DaoUserInfo;
import com.core.model.user.UserInfo;

@Service
@Transactional
public class UserInfoSerImp implements UserInfoSer {

	@Resource
	private DaoUserInfo daoUserInfo;
	
	@Override
	public int deleteByPrimaryKey(String userId) {
		return daoUserInfo.deleteByPrimaryKey(userId);
	}

	@Override
	public int insert(UserInfo record) {
		return daoUserInfo.insert(record);
	}

	@Override
	public int insertSelective(UserInfo record) {
		return daoUserInfo.insertSelective(record);
	}

	@Override
	public UserInfo selectByPrimaryKey(String userId) {
		return daoUserInfo.selectByPrimaryKey(userId);
	}

	@Override
	public int updateByPrimaryKeySelective(UserInfo record) {
		return daoUserInfo.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(UserInfo record) {
		return daoUserInfo.updateByPrimaryKey(record);
	}

}
