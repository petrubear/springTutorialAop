package emg.demos.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	public void snap() {
		System.out.println("Snap Camera!");
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
