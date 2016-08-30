package com.core.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.dao.UserDao;
import com.core.model.User;;

/**
 * TODO 类描述
 *用户类
 * @author esen
 * @date 2016年8月26日
 *
 */
@Service
@Transactional
public class UserSerImp implements UserSer{
	
	@Resource
	private UserDao userDao;

	public int deleteByPrimaryKey(Integer userid) {
		return userDao.deleteByPrimaryKey(userid);
	}

	public int insert(User record) {
		return userDao.insert(record);
	}

	public int insertSelective(User record) {
		return userDao.insertSelective(record);
	}

	public User selectByPrimaryKey(Integer userid) {
		return userDao.selectByPrimaryKey(userid);
	}

	public int updateByPrimaryKeySelective(User record) {
		return userDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(User record) {
		return userDao.updateByPrimaryKey(record);
	}

	
	

}
