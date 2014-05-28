package emg.demos.spring.aop;

import org.springframework.stereotype.Component;

import emg.demos.spring.aop.camera.accesories.Lens;

@Component("camera")
public class Camera implements ICamera {
	/* (non-Javadoc)
	 * @see emg.demos.spring.aop.ICamera#snap()
	 */
	@Override
	public void snap() throws Exception {
		System.out.println("Snap Camera!");
		//throw new Exception("test fail");
	}

	/* (non-Javadoc)
	 * @see emg.demos.spring.aop.ICamera#snap(int)
	 */
	@Override
	public void snap(int exposure) {
		System.out.println("Snap Camera - Exposure: " + exposure);
	}

	/* (non-Javadoc)
	 * @see emg.demos.spring.aop.ICamera#snap(java.lang.String)
	 */
	@Override
	public String snap(String name) {
		System.out.println("Snap Camera - Name: " + name);
		return name;
	}

	/* (non-Javadoc)
	 * @see emg.demos.spring.aop.ICamera#snapNightTime()
	 */
	@Override
	public void snapNightTime() {
		System.out.println("Snap Camera - NightTime");
	}
	
	public void changeLens(Lens lens){
		System.out.println("Snap Camera - changeLens");
	}
}
