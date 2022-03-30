package com.herachoicomp.spring.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect   //�����̽�(Ÿ�ٿ� ����Ǵ� �ڵ� ��ü)+����Ʈ ��(������ Ÿ��. � �޼ҵ�.)
public class SamleAspect {
	
	//before�����̽�. Joinpoint�� �Ķ���ͷ� ���� �� �ִ�. (Ÿ������)
	// "execution(* com.herachoicomp.spring..*.*(..))" --> ����Ʈ�� ����. 
	// ��ȣ��->���� �޼ҵ�. �ش� ��Ʈ���� ��� �޼ҵ�
	@Before("execution(* com.herachoicomp.spring..*.*(..))")
	public void before(JoinPoint joinPoint) {
		String targetMethodName = joinPoint.getSignature().getName();
		
		System.out.println(targetMethodName+" is invoked..");
	}
}
