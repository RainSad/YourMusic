package com.common.constant;

public class Constant {
	
	/**apikey*/
	public final static String API_KEY = "0cc987324b459a122bce36bc9e9ae438";

	/**服务器地址*/
	public final static String SERVICE_URL = "http://localhost:8080/music/music/";
	
	/**歌曲搜索url地址
	 * s string 关键字
	 * size string 返回条数
	 * page string 分页
	 * example httpArg1 = "s='婴儿'&size=10&page=1";
	 */
	public final static String MUSIC_SEARCH_URL = "http://apis.baidu.com/geekery/music/query";
	
	/**
	 * 获取播放地址
	 * hash 歌曲HASH
	 * example httpArg = "hash=c23d025ee9ece593abd96d7b97db97b4";
	 */
	public final static String MUSIC_PLAYINFO_URL = "http://apis.baidu.com/geekery/music/playinfo";
	
	/**
	 * 获取歌手信息
	 * name 歌手名称 
	 * example httpArg = "name=%E9%99%88%E5%A5%95%E8%BF%85";
	 */
	public final static String MUSIC_SINGERINFO_URL = "http://apis.baidu.com/geekery/music/singer";
	
	/**
	 * 获取歌词信息
	 * name 歌曲名称  陈奕迅 - 十年 - 钢琴版
	 * hash 歌曲HASH 41ee3202d303ea42fe550354d20a4241
	 * time 歌曲时间 196
	 * example httpArg = "name=%E9%99%88%E5%A5%95%E8%BF%85&hash=41ee3202d303ea42fe550354d20a4241&time=196";
	 */
	public final static String MUSIC_KRC_URL = "http://apis.baidu.com/geekery/music/krc";
	
	/**
	 * 一次性返回最大数据插入数据库
	 */
	public final static int MAX_ROWS_INSERT = 40;
}
