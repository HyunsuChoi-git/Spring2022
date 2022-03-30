package com.herachoicomp.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.herachoicomp.spring.vo.Article;

//�������丮 ���ݿ� �ش��ϴ� ������Ʈ�μ� ���� �� �ִ�.
@Repository
public class ArticleDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	
	public void insertArticle(Article article) {
		//mappers.article-mapper : mapper�� ���ӽ����̽�
		//�Ķ���� : mapper sql��, insert�� ������
		sqlSession.insert("mappers.article-mapper.insertArticle",article);
	}

	public Article selectArticleById(String articleId) {
		
		//�ϳ��� ���Ϲ��� �� : selectOne
		Article article = sqlSession.selectOne(
					"mapper.article-mapper.selectArticleById", articleId);
		
		
		return article;
	}

}
 