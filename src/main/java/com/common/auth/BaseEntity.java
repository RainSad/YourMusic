package com.common.auth;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BaseEntity {

	/**公共的id属性，后面的实体只需要继承就可以*/
	private Long id;
	public Long getId(){
		return id;
	}
	public void setId(Long id){
		this.id = id;
	}
	
	/**
	 * 根据返回的之类对象，将id取出来作为key，返回map
	 * @param list
	 * @return
	 *
	 * @author 孙文祥
	 */
	public static <T extends BaseEntity> Map<Long,T> idEntityMap(Collection<T> list)
	{
		Map<Long,T>map = new HashMap<Long,T>();
		
		if(null == list||0==list.size()){
			//集合最好不要返回null值，避免空指针异常
			return map;
		}
		for(T entity : list){
			map.put(entity.getId(), entity);
		}
		return map;
	}
	
}
