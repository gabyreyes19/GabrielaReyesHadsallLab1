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
public class ComputerSystem implements SelfCheckCapable {
	String processing_power;
	String computer_size;
	String computer_weight;
	String OS;

	/**
	 * This handles updates received and sent to the unit
	 */
	void updates() {
		
	}
	/**
	 * Connects and links all systems for use
	 */
	void connection_to_other_systems() {
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "ComputerSystem";
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
