package com.herachoicomp.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herachoicomp.spring.dao.ArticleDAO;
import com.herachoicomp.spring.vo.Article;

//Service ������̼��� �޸� ���� Ŭ����/�޼ҵ尡 ������Ʈ�μ� ���� �� �ִ�.
@Service
public class BbsService {
	
	//�ڵ� DI ���ִ� ������̼�. Setter�޼ҵ嵵 �ʿ���� ��������� �� ������̼Ǹ� �޾��ָ� �ȴ�.
	@Autowired
	private ArticleDAO articleDAO;
	
	//public void setArticleDAO(ArticleDAO articleDAO) {
	//	this.articleDAO = articleDAO;
	//}
	
	public void registArticle(Article article) {
		articleDAO.insertArticle(article);
	}
	
	
	public Article viewArticleDetail(String articleId) {
		return this.articleDAO.selectArticleById(articleId);
	}

		
	public void testService() {
		System.out.println("target invoked...");
	}

}
