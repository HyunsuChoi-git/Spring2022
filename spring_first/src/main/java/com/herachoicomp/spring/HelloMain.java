package com.herachoicomp.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		
		//�⺻ ��ü���� ���
		HelloDAO dao = new HelloDAO();
		int result = dao.addTwoNumber(4, 2);
		
		System.out.println(result);
		
		
		//Dependency lookup�� �̿��ϱ�
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
		
		HelloDAO dao2 = ctx.getBean("helloDAO", HelloDAO.class);
		int result2 = dao2.addTwoNumber(5, 67);
		
		System.out.println(result2);

		
	}

}
