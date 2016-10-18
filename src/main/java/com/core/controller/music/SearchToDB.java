package com.core.controller.music;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.constant.Constant;
import com.core.APIservice.SearchInfoToBean;
import com.core.APIservice.ServiceMusicInfo;
import com.core.model.music.SearchInfo;
import com.core.service.music.SearchInfoSer;

@Controller
public class SearchToDB {

	@Autowired
	private SearchInfoSer seachInfoSer;

	private ServiceMusicInfo serviceMusicInfo;

	private SearchInfoToBean searchInfoToBean;

	@RequestMapping("test.shtml")
	public String saveMusicInfoToDB(String musicName, ModelMap model) {
		String httpArg = "s=" + musicName;
		serviceMusicInfo = new ServiceMusicInfo();
		String data = serviceMusicInfo.request(Constant.MUSIC_SEARCH_URL, httpArg);
		searchInfoToBean = new SearchInfoToBean();
		List<SearchInfo> list = searchInfoToBean.info(data);

		int totalRows = list.get(0).getTotalRows();
		int s = 0;
		if (totalRows <= Constant.MAX_ROWS_INSERT) {
			String httpArg2 = "s=" + musicName + "&size=" + totalRows;
			String data2 = serviceMusicInfo.request(Constant.MUSIC_SEARCH_URL, httpArg2);
			List<SearchInfo> list2 = searchInfoToBean.info(data2);
			int len = list2.size();
			for (int i = 0; i < len; i++) {
				s++;
				seachInfoSer.insertSelective(list2.get(i));
			}
		} else {
			String httpArg2 = "s=" + musicName + "&size=" + Constant.MAX_ROWS_INSERT;
			String data2 = serviceMusicInfo.request(Constant.MUSIC_SEARCH_URL, httpArg2);
			List<SearchInfo> list2 = searchInfoToBean.info(data2);
			int size = list2.get(0).getPagesize();
			int pageSize = list2.get(0).getTotalPage();
			for (int i = 1; i < pageSize + 1; i++) {
				String httpArg3 = "s=" + musicName + "&size=" + Constant.MAX_ROWS_INSERT + "&page=" + i;
				String data3 = serviceMusicInfo.request(Constant.MUSIC_SEARCH_URL, httpArg3);
				List<SearchInfo> list3 = searchInfoToBean.info(data3);
				if (i != pageSize) {
					for (int j = 0; j < size; j++) {
						s++;
						seachInfoSer.insertSelective(list3.get(j));
					}
				}else {
					for (int j = 0; j < totalRows - (size * (pageSize - 1)); j++) {
						s++;
						seachInfoSer.insertSelective(list3.get(j));
					}
				}
			}
		}
		model.addAttribute("info", totalRows);
		model.addAttribute("info2", s);
		return "shouye";
	}

}
