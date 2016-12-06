package com.core.service.music;

import com.core.model.music.SearchInfo;

public interface SearchInfoSer {
	int deleteByPrimaryKey(Integer id);

	int insert(SearchInfo record);

	int insertSelective(SearchInfo record);

	SearchInfo selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SearchInfo record);

	int updateByPrimaryKey(SearchInfo record);
}
