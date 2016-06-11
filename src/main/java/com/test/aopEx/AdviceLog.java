package com.test.aopEx;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceLog {
	
	// ProceedingJoinPoint 객체는 원래 실행되어야 할 대상 메소드(핵심기능)
	public Object profile(ProceedingJoinPoint joinPoint) throws Throwable {
		String signStr = joinPoint.getSignature().toShortString();
		System.out.println(signStr + " is start!!");
		long startTime = System.currentTimeMillis();			// 현재시간
		
		try { 
			Object obj = joinPoint.proceed();
			return obj;
		} finally {
			long endTime = System.currentTimeMillis();
			System.out.println(signStr + " is finished!!");
			System.out.println(signStr + " 경과시간 : " + (endTime - startTime));			
		}
		
	}
}
