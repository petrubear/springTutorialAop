package emg.demos.spring.aop;

import emg.demos.spring.aop.camera.accesories.Lens;

public interface ICamera {

	public abstract void snap() throws Exception;

	public abstract void snap(int exposure);

	public abstract String snap(String name);

	public abstract void snapNightTime();

	public abstract void changeLens(Lens lens);
}