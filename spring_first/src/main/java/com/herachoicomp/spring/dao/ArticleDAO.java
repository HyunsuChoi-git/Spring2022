package com.herachoicomp.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.herachoicomp.spring.vo.Article;

//레파지토리 성격에 해당하는 컴포넌트로서 사용될 수 있다.
@Repository
public class ArticleDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	
	public void insertArticle(Article article) {
		//mappers.article-mapper : mapper의 네임스페이스
		//파라미터 : mapper sql명, insert할 데이터
		sqlSession.insert("mappers.article-mapper.insertArticle",article);
	}

	public Article selectArticleById(String articleId) {
		
		//하나만 리턴받을 때 : selectOne
		Article article = sqlSession.selectOne(
					"mapper.article-mapper.selectArticleById", articleId);
		
		
		return article;
	}

}
 