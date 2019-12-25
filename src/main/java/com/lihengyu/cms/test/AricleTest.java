package com.lihengyu.cms.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lihengyu.cms.domain.Article;
import com.lihengyu.cms.service.ArticleService;
import com.lihengyu.cms.service.SlideService;
@ContextConfiguration(locations = "classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AricleTest {
	
	@Autowired
	private  ArticleService aservice;//调用Articleservice方法层
	
	@Autowired
	private SlideService sservice;//调用Slideservice方法层
	
	private static Thread A = null;//线程A
	private static Thread B = null;//线程B


	
	@Test
	public void slide() {//测试
		sservice.selects();
	}
	@Test
	public void article() {//测试
		Article article =new Article();
		article.setStatus(1);
		aservice.selects(article,0,10);
	}

}
