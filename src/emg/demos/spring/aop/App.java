package emg.demos.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import emg.demos.spring.aop.camera.accesories.Lens;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"emg/demos/spring/aop/beans.xml");

		Camera camera = (Camera) context.getBean("camera");
		camera.snap();
		camera.snap(1000);
		camera.snap("oosakajyu");
		camera.snapNightTime();
		
		Lens lens = (Lens)context.getBean("lens");
		lens.zoom(5);
		((ClassPathXmlApplicationContext) context).close();
	}

}
