package com.lihengyu.cms.dao;

import java.util.List;

import com.lihengyu.cms.domain.Complains;

public interface ComplainsMapper {
	
	int insert(Complains complains);//投诉
	
	List<Complains> selects();//查询

}
