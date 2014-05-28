package emg.demos.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {

	//@Pointcut("execution(* emg.demos.spring.aop.Camera.snap())")
	//@Pointcut("within(emg.demos.spring.aop.Camera)") //toma todos los metodos de la clase
	@Pointcut("within(emg.demos.spring.aop..*)") //toma todos los metodos de la clase
	public void withinCameraSnap() {

	}
	
	@Pointcut("target(emg.demos.spring.aop.camera.accesories.Lens)") //toma todos los metodos de la clase
	public void targetCameraSnap() {

	}

	@Before("withinCameraSnap()")
	public void beforeWithinAdvice() {
		System.out.println("[before within]");
	}
	
	@Before("targetCameraSnap()")
	public void beforeTargetAdvice() {
		System.out.println("[before target]");
	}
/*
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
	*/
}
