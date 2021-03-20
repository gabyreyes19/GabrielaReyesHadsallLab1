/**
 * 
 */
package Perseverance;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author gabbyhadsall
 *
 */
public class Sensors implements SelfCheckCapable {
	String sensor_sizes;
	String number_of_sensors;
	String number_of_cameras;
	String number_of_lights;
	String type_of_cameras;
	String placement_of_cameras;
	
	/**
	 * This is the depth meter
	 */
	void depth() {
		
	}
	/**
	 * These are the cameras
	 */
	void cameras() {
		
	}
	/**
	 * This is range meters for distance
	 */
	void range() {
		
	}
	/**
	 * This avoids collisions
	 */
	void collision_detection() {
		
	}
	/**
	 * This measures speed
	 */
	void speed() {
		
	}
	/**
	 * This tracks altitude
	 */
	void temperature() {
		
	}
	/**
	 * This is the light sensors
	 */
	void light () {
		
	}
	/**
	 * This measures pressure with objects, surfaces, and other items
	 */
	void contact_pressure(){

	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Sensors";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
