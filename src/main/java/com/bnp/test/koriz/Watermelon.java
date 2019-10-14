/**
 * 
 */
package com.bnp.test.koriz;

/**
 * @author Ghislain
 *
 */
public class Watermelon extends Fruit {

	public Watermelon(String name, float price) {
		super(name, price);
	}
	
	/* Three for the price of two on Watermelons  */
	
	public float getPrice(int max) {
		if(max == 1)return getUnitPrice();
		else return 2*max*getUnitPrice()/3;
	}
	
}