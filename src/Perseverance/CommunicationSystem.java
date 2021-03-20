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
public class CommunicationSystem implements SelfCheckCapable {
	String size_of_antenna;
	String number_of_antennas;
	String type_of_antennas;
	
	/**
	 * This allows for transmitting information
	 */
	void transmitting() {
		
	}
	
	/**
	 * This allows for receiving information
	 */
	void receiving() {
		
	}
	
	/**
	 * This allows for communication
	 */
	void communication_frequecies() {
		
	}
	
	/**
	 * This is a backup computer in case the 
	 * original fails
	 */
	void backup_computer() {
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "CommunicationSystem";
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
