package com.herachoicomp.spring.service;

import com.herachoicomp.spring.dao.AnotherDAO;
import com.herachoicomp.spring.dao.HelloDAO;

public class HelloService {
	
	private HelloDAO helloDAO;     //멤버변수로 잡아주기
	private AnotherDAO anotherDAO;
	
	//Dependency Injection 방식으로 참조하기
	
	// 1. Setter로 주입하는 방식. 
	public void setHelloDAO(HelloDAO dao) {
		this.helloDAO = dao;
	}	
	public void setAnotherDAO(AnotherDAO anotherDAO) {
		this.anotherDAO = anotherDAO;
	}
	
	// 2. 생성자를 이용하여 주입하는 방식.
	/*public HelloService(HelloDAO helloDAO) {
		this.helloDAO = helloDAO;
	}
	*/
	
	
	public int calcTwoNumverSquare(int a, int b) {
		int result = helloDAO.addTwoNumber(a, b);
		return anotherDAO.square(result);
	}
	
	

	

}
