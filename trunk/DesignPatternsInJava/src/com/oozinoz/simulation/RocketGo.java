/**
 * 
 */
package com.oozinoz.simulation;


/**
 * @author 孙大鹏
 * 
 */
public class RocketGo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double mass = 1.0, thrust = 2.0, burnTime = 3.0;
		Skyrocket r = new Skyrocket(mass,thrust,burnTime);
		r.setSimTime(thrust);
		System.out.print(r.getMass());

	}

}
