package aop2_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LoggingAdvice {
	@Before("execution(public * aop2_annotation.*.*Hello(..))")
	public void before(JoinPoint point) throws Throwable{
		String methodName = point.getSignature().getName();
		System.out.println("[*************** 사전 작업 ]" + methodName);
	}
	
	@After("execution(public * aop2_annotation.*.*Hello(..))")
	public void after1(JoinPoint point)throws Throwable{
		String methodName = point.getSignature().getName();
		System.out.println("[*************** 사후 작업 ]" + methodName);
	}
}
