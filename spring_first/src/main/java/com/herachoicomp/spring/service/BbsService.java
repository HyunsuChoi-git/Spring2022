package com.herachoicomp.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herachoicomp.spring.dao.ArticleDAO;
import com.herachoicomp.spring.vo.Article;

//Service 어노테이션을 달면 하위 클래스/메소드가 컴포넌트로서 사용될 수 있다.
@Service
public class BbsService {
	
	//자동 DI 해주는 어노테이션. Setter메소드도 필요없이 멤버변수에 이 어노테이션만 달아주면 된다.
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
