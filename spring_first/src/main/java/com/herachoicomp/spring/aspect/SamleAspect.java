package com.herachoicomp.spring.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect   //어드바이스(타겟에 적용되는 코드 자체)+포인트 컷(적용할 타겟. 어떤 메소드.)
public class SamleAspect {
	
	//before어드바이스. Joinpoint를 파라미터로 받을 수 있다. (타겟정보)
	// "execution(* com.herachoicomp.spring..*.*(..))" --> 포인트컷 문법. 
	// 괄호안->실제 메소드. 해당 루트안의 모든 메소드
	@Before("execution(* com.herachoicomp.spring..*.*(..))")
	public void before(JoinPoint joinPoint) {
		String targetMethodName = joinPoint.getSignature().getName();
		
		System.out.println(targetMethodName+" is invoked..");
	}
}
