package com.lihengyu.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.lihengyu.cms.domain.Complains;
import com.lihengyu.cms.service.ComplainsService;

@Controller
public class ComplainsController {
	
	@Autowired
	private ComplainsService service;
	
	@RequestMapping("add")
	public String add(Model m,Complains complains) {
		service.insert(complains);
		m.addAttribute("complains",complains);
		return "complains";
	}
	@RequestMapping("complains")
	public String complains(Model m,@RequestParam(defaultValue = "1")int pageNum) {
		PageInfo<Complains> list=service.selects(pageNum);
		m.addAttribute("list",list);
		return "comlpains";
	}

}
