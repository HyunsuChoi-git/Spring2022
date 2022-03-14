package com.herachoicomp.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.herachoicomp.spring.service.BbsService;
import com.herachoicomp.spring.service.HelloService;
import com.herachoicomp.spring.vo.Article;

public class HelloMain {

	public static void main(String[] args) {
		
	/*	//�⺻ ��ü���� ���
		HelloDAO dao = new HelloDAO();
		int result = dao.addTwoNumber(4, 2);
		
		System.out.println(result);
		
		
		//Dependency lookup�� �̿��ϱ�
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
		
		HelloDAO dao2 = ctx.getBean("helloDAO", HelloDAO.class);
		int result2 = dao2.addTwoNumber(5, 67);
		
		System.out.println(result2);
	*/	
		
		/*	
		HelloService dao3 = ctx2.getBean("helloService", HelloService.class);
		int result3 = dao3.calcTwoNumverSquare(1, 2);
		
		System.out.println(result3);
		*/			
		
		
		//��Dependency lookup�� �̿��� Ŭ������ ����
		AbstractApplicationContext ctx2 = new ClassPathXmlApplicationContext("/spring-context.xml");

	
		BbsService service = ctx2.getBean("bbsService", BbsService.class);
		service.registArticle(new Article());	
	}

}
