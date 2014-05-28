package emg.demos.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {

	//@Pointcut("execution(void emg.demos.spring.aop.Camera.snap(..))")
	@Pointcut("execution(* emg.demos.spring.aop.Camera.*(..))")
	//@Pointcut("execution(* emg.demos.spring.aop.*.*(..))")
	// (..) es un wildcard para parametros
	//Camera.* es un wildcard para el nombre del metodo (todos = *)
	// (*) es un wildcard para el valor de retorno
	public void cameraSnap() {

	}
	
	@Pointcut("execution(* emg.demos.spring.aop.Camera.snap(String))")
	public void cameraSnapName() {

	}

	@Pointcut("execution(* *.*(..))") //any return, any class, any method
	public void cameraRelatedAction() {

	}

	@Before("cameraSnap()")
	public void aboutToTakePhoto() {
		System.out.println("about to take photo!");
	}
	
	@Before("cameraSnapName()")
	public void aboutToTakePhotoWithNAme() {
		System.out.println("about to take photo with name!");
	}
	
	@Before("cameraRelatedAction()")
	public void aboutTodoCameraRelatedAction() {
		System.out.println("about to do something!");
	}
}
