package com.herachoicomp.spring.dao;

import org.springframework.stereotype.Repository;

import com.herachoicomp.spring.vo.Article;

//�������丮 ���ݿ� �ش��ϴ� ������Ʈ�μ� ���� �� �ִ�.
@Repository
public class ArticleDAO {
	
	public void insertArticle(Article article) {
		System.out.println("insert ok..");
	}

	public Article selectARticleById(String articleId) {
		
		Article article = new Article(10, "lee", "test", "test�Դϴ�.");
		
		
		return article;
	}

}
