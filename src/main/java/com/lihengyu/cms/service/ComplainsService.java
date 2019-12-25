package com.lihengyu.cms.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.lihengyu.cms.controller.ComplainsController;
import com.lihengyu.cms.domain.Complains;



public interface ComplainsService {

	int insert(Complains complains);
	
	PageInfo<Complains> selects(int pageNum);

}
