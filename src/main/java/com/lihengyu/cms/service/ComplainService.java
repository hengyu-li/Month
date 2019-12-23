package com.lihengyu.cms.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.lihengyu.cms.domain.Complain;
import com.lihengyu.cms.vo.ComplainVO;

public interface ComplainService {
	//举报
	boolean insert(Complain complain);
	
	//查询举报
		PageInfo<Complain> selects(ComplainVO complainVO,Integer page,Integer pageSize);
}
