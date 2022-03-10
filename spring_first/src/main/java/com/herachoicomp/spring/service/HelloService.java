package com.herachoicomp.spring.service;

import com.herachoicomp.spring.dao.AnotherDAO;
import com.herachoicomp.spring.dao.HelloDAO;

public class HelloService {
	
	private HelloDAO helloDAO;     //��������� ����ֱ�
	private AnotherDAO anotherDAO;
	
	//Dependency Injection ������� �����ϱ�
	
	// 1. Setter�� �����ϴ� ���. 
	public void setHelloDAO(HelloDAO dao) {
		this.helloDAO = dao;
	}	
	public void setAnotherDAO(AnotherDAO anotherDAO) {
		this.anotherDAO = anotherDAO;
	}
	
	// 2. �����ڸ� �̿��Ͽ� �����ϴ� ���.
	/*public HelloService(HelloDAO helloDAO) {
		this.helloDAO = helloDAO;
	}
	*/
	
	
	public int calcTwoNumverSquare(int a, int b) {
		int result = helloDAO.addTwoNumber(a, b);
		return anotherDAO.square(result);
	}
	
	

	

}
