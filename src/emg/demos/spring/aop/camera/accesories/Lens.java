package emg.demos.spring.aop.camera.accesories;

import org.springframework.stereotype.Component;

@Component ("lens")
@Deprecated
public class Lens {
	@Deprecated
	public void zoom (int factor) {
		System.out.println("Zoom factor:" + factor);
	}
}
