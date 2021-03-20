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
public class Storage implements SelfCheckCapable {
	String computer_storage_placement;
	String computer_storage_size;
	String battery_storage_size;
	String sample_bin;

	/**
	 * This stores all physical items
	 */
	void physical_Storage() {
		
	}
	/**
	 * This stores all computer components
	 */
	void computing_storage() {
		
	}
	/**
	 * This stores all systems beyond hard drives
	 */
	void computational_systems() {
		
	}
		
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Storage";
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
