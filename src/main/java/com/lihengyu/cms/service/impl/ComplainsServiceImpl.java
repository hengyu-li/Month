package com.lihengyu.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lihengyu.cms.dao.ComplainsMapper;
import com.lihengyu.cms.domain.Complain;
import com.lihengyu.cms.domain.Complains;
import com.lihengyu.cms.service.ComplainsService;
import com.lihengyu.cms.vo.ComplainVO;
@Service
public class ComplainsServiceImpl implements ComplainsService {
	
	@Autowired
	private ComplainsMapper mapper;

	@Override
	public int insert(Complains complains) {
		// TODO Auto-generated method stub
		return mapper.insert(complains);
	}

	@Override
	public PageInfo<Complains> selects(int pageNum) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,3);
		List<Complains> list=mapper.selects();
		PageInfo<Complains> info=new PageInfo<Complains>(list);
		return info;
	}

}
