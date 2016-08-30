package com.core.dao;

import com.core.model.User;

public interface UserDao {
	/** 根据主键删除 */
	int deleteByPrimaryKey(Integer userid);

	/** 插入 */
	int insert(User record);

	/** 选择性插入删除 */
	int insertSelective(User record);

	/** 根据主键查找 */
	User selectByPrimaryKey(Integer userid);

	/** 更新选择的部分 */
	int updateByPrimaryKeySelective(User record);

	/** 根据会主键更新全部 */
	int updateByPrimaryKey(User record);
}