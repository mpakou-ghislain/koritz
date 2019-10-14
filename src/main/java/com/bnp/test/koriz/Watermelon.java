/**
 * 
 */
package com.bnp.test.koriz;

/**
 * @author Ghislain
 * This class inherits from Fruit
 * a watermelon is a fruit
 */
public class Watermelon extends Fruit {

	/**
	 * constructor of Watermelon class using field
	 **/
	public Watermelon(String name, float price) {
		super(name, price);
	}
	
	/** 
	 * This method returns the price of Watermelons 
	 * which have been sold taking account of 
	 * special offer related to Watermelons that is 
	 * to say : Three for the price of two on Watermelons  
	 * */
	public float getPrice(int max) {
		if(max == 1)return getUnitPrice();
		else return 2*max*getUnitPrice()/3;
	}
	
}