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
public class Chassis implements SelfCheckCapable {
	String wheel_sizes;
	String body_structure;
	String number_of_wheels;
	String shock_absorbtion;
	String hydraulic_suspension;
	String rotatry_actuators;
	String wheel_material;
	
	/**
	 * This makes the wheels turns left
	 */
	void turn_left() {
		
	}
	/**
	 * This makes the wheels turns right
	 */
	void turn_right() {
		
	}
	
	/**
	 * This mechanism moves the rover forward
	 */
	void move_forward() {
		
	}
	/**
	 * These mechanism moves the rover backward
	 */
	void move_backwards() {
		
	}
	/**
	 * This provides impact resistance for the rover
	 */
	void impact_resistance() {
		
	}
	/**
	 * This handles the rover's calibration system
	 */
	void calibration() {
		
	}
	/**
	 * This causes the rover to implement the brakes
	 */
	void brakes() {
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Chassis";
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