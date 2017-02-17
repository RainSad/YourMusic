package com.core.dao.index;

import com.core.model.index.indexMusicInfo;

public interface indexMusicInfoMapper {
    int deleteByPrimaryKey(String userId);

    int insert(indexMusicInfo record);

    int insertSelective(indexMusicInfo record);

    indexMusicInfo selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(indexMusicInfo record);

    int updateByPrimaryKey(indexMusicInfo record);
}