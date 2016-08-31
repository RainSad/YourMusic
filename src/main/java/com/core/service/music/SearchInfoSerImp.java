package com.core.service.music;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.dao.music.MusicSearchInfo;
import com.core.model.music.SearchInfo;
/**
 * 处理搜索信息
 *
 * @author 孙文祥
 * @date 2016年8月31日
 *
 */
@Service
@Transactional
public class SearchInfoSerImp implements SearchInfoSer {

	@Resource
	MusicSearchInfo musicSearchInfo;
	
	public int deleteByPrimaryKey(Integer id) {
		return musicSearchInfo.deleteByPrimaryKey(id);
	}

	public int insert(SearchInfo record) {
		return musicSearchInfo.insert(record);
	}

	public int insertSelective(SearchInfo record) {
		return musicSearchInfo.insertSelective(record);
	}

	public SearchInfo selectByPrimaryKey(Integer id) {
		return musicSearchInfo.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(SearchInfo record) {
		return musicSearchInfo.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(SearchInfo record) {
		return musicSearchInfo.updateByPrimaryKey(record);
	}

}
