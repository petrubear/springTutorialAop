package emg.demos.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	public void snap() throws Exception {
		System.out.println("Snap Camera!");
		throw new Exception("test fail");
	}

	public void snap(int exposure) {
		System.out.println("Snap Camera - Exposure: " + exposure);
	}

	public String snap(String name) {
		System.out.println("Snap Camera - Name: " + name);
		return name;
	}

	public void snapNightTime() {
		System.out.println("Snap Camera - NightTime");
	}
}
