package com.herachoicomp.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.herachoicomp.spring.service.HelloService;

public class HelloMain {

	public static void main(String[] args) {
		
	/*	//기본 객체생성 방식
		HelloDAO dao = new HelloDAO();
		int result = dao.addTwoNumber(4, 2);
		
		System.out.println(result);
		
		
		//Dependency lookup을 이용하기
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
		
		HelloDAO dao2 = ctx.getBean("helloDAO", HelloDAO.class);
		int result2 = dao2.addTwoNumber(5, 67);
		
		System.out.println(result2);
	*/	
		
		
		//기Dependency lookup을 이용한 클래스간 참조
		AbstractApplicationContext ctx2 = new ClassPathXmlApplicationContext("/spring-context.xml");
		
		HelloService dao3 = ctx2.getBean("helloService", HelloService.class);
		int result3 = dao3.calcTwoNumverSquare(1, 2);
		
		System.out.println(result3);
		
		
		
		
	}

}
