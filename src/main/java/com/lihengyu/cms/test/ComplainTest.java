package com.lihengyu.cms.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lihengyu.cms.service.ComplainService;
import com.lihengyu.cms.service.SlideService;
import com.lihengyu.cms.vo.ComplainVO;

@ContextConfiguration(locations = "classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ComplainTest {
	
	@Autowired
	private ComplainService cservice;
	@Autowired
	private SlideService sservice;
	
	private static Thread A = null;//线程A
	private static Thread B = null;//线程B
	
	@Test
	public void com() {
		ComplainVO complainVO = new ComplainVO(); 
		cservice.selects(complainVO,0,10);
	}
	
	@Test
	public void Slide() {
		sservice.selects();
	}

}
