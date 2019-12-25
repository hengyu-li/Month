package com.lihengyu.cms.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lihengyu.cms.domain.Complains;
import com.lihengyu.cms.service.ComplainsService;
@ContextConfiguration(locations = "classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class InsertTest {
	
	@Autowired
	private ComplainsService service;
	
	@Test
	public void select() {
		int pageNum=3;
		List<Complains> complains=new ArrayList<Complains>();
		System.out.println(complains);
		service.selects(pageNum);
	}
	
	@Test
	public void insert() {
		Complains complains=new Complains();
		complains.setAid(2);
		complains.setUid(2);
		complains.setComplaintype("B");
		complains.setUrlip("http://127.0.0.1/complain?id=15");
		complains.setTitle("色情");
		complains.setImage("D/image/1.jpg");
		complains.setComment(1);
		System.out.println(complains);
		service.insert(complains);
	}

}
