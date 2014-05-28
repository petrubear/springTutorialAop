package emg.demos.spring.aop.camera.accesories;

import org.springframework.stereotype.Component;

@Component
public class Lens {
	public void zoom (int factor) {
		System.out.println("Zoom factor:" + factor);
	}
}
