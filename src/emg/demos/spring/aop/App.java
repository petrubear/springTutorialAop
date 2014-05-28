package emg.demos.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import emg.demos.spring.aop.camera.accesories.Lens;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"emg/demos/spring/aop/beans.xml");

		ICamera camera = (ICamera) context.getBean("camera");
		try {
			camera.snap();
			camera.snap(100);
			camera.snap("kito");
			camera.snapNightTime();
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}

		Lens lens = (Lens)context.getBean("lens");
		lens.zoom(5);
		((ClassPathXmlApplicationContext) context).close();
	}

}
