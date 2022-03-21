package com.herachoicomp.spring.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.herachoicomp.spring.vo.Article;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/*.xml")
public class ArticleDAOTest {
	
	@Autowired
	private ArticleDAO dao;
	
	@Test
	@Ignore
	public void testSelectArticleBuId() {
		Article article = dao.selectArticleById(null);
		Assert.assertTrue(article.getAuthor().equals("lee"));
			
	}
	
	@Test
	public void testInsertArticle() {
		dao.insertArticle(null);
	}
}
