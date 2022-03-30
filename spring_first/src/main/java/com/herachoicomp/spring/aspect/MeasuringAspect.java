package com.herachoicomp.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MeasuringAspect {
	
	@Around("execution(* com.herachoicomp.spring.service.*Service(..))")
	public Object measuringMethodRunningTime(ProceedingJoinPoint joinPoint) throws Throwable {
		
		//Ÿ�ٸ޼ҵ尡 ����Ǳ� �� ����Ǵ� �޼ҵ�
		long start = System.currentTimeMillis();
		
		
		try {  
			//Ÿ�� �޼ҵ带 �����ϴ� �޼ҵ�
			return joinPoint.proceed();   
		} finally{
			//���� �� ����Ǵ� �޼ҵ�
			long result = System.currentTimeMillis() - start;
			System.out.println("target method name is "+joinPoint.getSignature().getName());
			System.out.println("running time is "+ result);
		} 
	}
}
