package emg.demos.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {
	/**** combining pcd ****/
	
	@Pointcut("args(exposure)") //todos los metodos que reciben Lens
	public void somePointCut(int exposure) {

	}
	@Pointcut("within(emg.demos.spring.aop.Camera)")
	public void cameraPointcut(){
		
	}
	
	@Before("somePointCut(exposure) && cameraPointcut()") // combina los dos pointcuts (and)
	//@Before("somePointCut(exposure) && !cameraPointcut()") // combina los dos pointcuts (and not)
	public void beforeWithinAdvice(JoinPoint jp, int exposure) {
		System.out.println("[before pcd]");
		//System.out.println("  [arg]: " + exposure);
	}
	
	
	/**** getting target method arguments ****/
	/*
	//@Pointcut("@target(org.springframework.stereotype.Component)") //todos los metodos de los beans
	//@Pointcut("args(int)")// tipo de dato
	//public void somePointCut() {
	@Pointcut("args(exposure)")// nombre del parametro
	public void somePointCut(int exposure) {

	}
	//@Before("somePointCut()")
	@Before("somePointCut(exposure)")
	//public void beforePointcutAdvice(JoinPoint jp) {
	public void beforePointcutAdvice(JoinPoint jp, int exposure) {
		System.out.println("[before]: " + jp.getSignature());
		for(Object obj: jp.getArgs()) {
			System.out.println("  [arg]: " + obj);
		}
	}
	*/
	/**** args pcd ****/
	/*
	//@Pointcut("args()") //todos los metodos que no reciben args
	//@Pointcut("args(int)") //todos los metodos que reciben int
	//@Pointcut("args(int, double)") //todos los metodos que reciben int, doulbe
	//@Pointcut("args(int, *)")
	//@Pointcut("args(int, ..)")// int y 0+ arguments
	//@Pointcut("args(.., double)")
	@Pointcut("args(emg.demos.spring.aop.camera.accesories.Lens)") //todos los metodos que reciben Lens
	public void somePointCut() {

	}
	
	@Before("somePointCut()")
	public void beforeWithinAdvice() {
		System.out.println("[before pcd]");
	}
	*/
	/**** bean especifico pcd ****/
	/*
	@Pointcut("bean(*camera)") //todos los metodos del bean marcado como ~camera
	public void somePointCut() {

	}
	
	@Before("somePointCut()")
	public void beforeWithinAdvice() {
		System.out.println("[before pcd]");
	}
	*/
	/****** annotations para pointcut designators (pcd) ******/
	/*
	//@Pointcut("within(@Deprecated emg.demos.spring.aop..*)") //solo metodos deprecados
	//@Pointcut("@target(org.springframework.stereotype.Component)") //todos los metodos de las clases marcadas como @Component
	//@Pointcut("@annotation(java.lang.Deprecated)") //todos los metodos de las clases marcadas como @Deprecated
	@Pointcut("@args(java.lang.Deprecated)") //todos los metodos de las clases marcadas como @Deprecated
	public void somePointCut() {

	}
	
	@Before("somePointCut()")
	public void beforeWithinAdvice() {
		System.out.println("[before pcd]");
	}
	*/
	
	/****** before, after, arround samples ******/
	/*
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
