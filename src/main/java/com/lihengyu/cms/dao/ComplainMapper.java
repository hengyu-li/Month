package com.lihengyu.cms.dao;

import java.util.List;

import com.lihengyu.cms.domain.Complain;
import com.lihengyu.cms.vo.ComplainVO;

public interface ComplainMapper {
	
	int insert(Complain complain);
	
	//查询举报
	List<Complain> selects(ComplainVO complainVO);

}
