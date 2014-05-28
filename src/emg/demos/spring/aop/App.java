package emg.demos.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"emg/demos/spring/aop/beans.xml");

		Camera camera = (Camera) context.getBean("camera");
		camera.snap();
		((ClassPathXmlApplicationContext) context).close();
	}

}
