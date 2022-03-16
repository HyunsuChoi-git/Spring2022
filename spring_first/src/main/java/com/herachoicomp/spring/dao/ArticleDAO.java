package com.herachoicomp.spring.dao;

import org.springframework.stereotype.Repository;

import com.herachoicomp.spring.vo.Article;

//레파지토리 성격에 해당하는 컴포넌트로서 사용될 수 있다.
@Repository
public class ArticleDAO {
	
	public void insertArticle(Article article) {
		System.out.println("insert ok..");
	}

	public Article selectARticleById(String articleId) {
		
		Article article = new Article(10, "lee", "test", "test입니다.");
		
		
		return article;
	}

}
