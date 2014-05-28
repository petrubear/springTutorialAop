package emg.demos.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {

	@Pointcut("execution(* emg.demos.spring.aop.Camera.snap())")
	public void cameraSnap() {

	}

	@Before("cameraSnap()")
	public void beforeAdvice() {
		System.out.println("before advice ...");
	}

	@After("cameraSnap()")
	// se ejecuta si el metodo da error o no
	public void afterAdvice() {
		System.out.println("after advice ...");
	}

	@AfterReturning("cameraSnap()")
	// se ejecuta si el metodo NO da error
	public void afterReturningAdvice() {
		System.out.println("after returning advice ...");
	}
	
	@AfterThrowing("cameraSnap()")
	// se ejecuta si el metodo da error
	public void afterThrowingAdvice() {
		System.out.println("after throwing advice ...");
	}
	
	@Around("cameraSnap()")
	// se ejecuta si el metodo da error
	public void afterAroundAdvice(ProceedingJoinPoint p) {
		System.out.println("around advice ... before");
		try {
			p.proceed();
		} catch (Throwable e) {
			System.err.println("In around advice: " + e);
		}
		System.out.println("around advice ... after");
	}
}
