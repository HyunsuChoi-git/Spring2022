package com.herachoicomp.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		
		//기본 객체생성 방식
		HelloDAO dao = new HelloDAO();
		int result = dao.addTwoNumber(4, 2);
		
		System.out.println(result);
		
		
		//Dependency lookup을 이용하기
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
		
		HelloDAO dao2 = ctx.getBean("helloDAO", HelloDAO.class);
		int result2 = dao2.addTwoNumber(5, 67);
		
		System.out.println(result2);

		
	}

}
