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
public class PowerSupply implements SelfCheckCapable {
	String size_of_battery;
	String number_of_batteries;
	String size_of_solar_panel;
	String type_of_battery;

	/**
	 * This is the battery capacity
	 */
	void battery() {
		
	}
	/**
	 * This is the solar panel of energy capture
	 */
	void solar_panel() {
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "PowerSupply";
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
