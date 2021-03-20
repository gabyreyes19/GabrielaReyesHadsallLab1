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
public class RoboticArm implements SelfCheckCapable {
	String length_size;
	String weight;
	String matel_framing;
	String rotation;
	String Bearings;

	/**
	 * This is the drill of the arm
	 */
	void drill() {
		
	}
	/**
	 * This is the grapple system
	 */
	void grapple() {
		
	}
	/**
	 * This drill camera on the arm to view
	 */
	void drill_camera() {

	}
	/**
	 * This drill camera on the arm to view
	 */
	void turn() {
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "RoboticArm";
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