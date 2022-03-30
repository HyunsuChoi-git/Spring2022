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
		
		//타겟메소드가 실행되기 전 실행되는 메소드
		long start = System.currentTimeMillis();
		
		
		try {  
			//타겟 메소드를 실행하는 메소드
			return joinPoint.proceed();   
		} finally{
			//실행 후 수행되는 메소드
			long result = System.currentTimeMillis() - start;
			System.out.println("target method name is "+joinPoint.getSignature().getName());
			System.out.println("running time is "+ result);
		} 
	}
}
