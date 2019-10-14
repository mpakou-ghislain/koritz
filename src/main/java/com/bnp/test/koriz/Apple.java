/**
 * 
 */
package com.bnp.test.koriz;

/**
 * @author Ghislain
 * This class inherits from Fruit
 * an apple is a fruit.
 */
public class Apple extends Fruit {

	/**
	 * constructor of Apple class using field
	 */
	public Apple(String name, float price) {
		super(name, price);
	}
	
	
	/**
	 * return the price of Apple quantity that has been sold 
	 * taking account of special offer related to Apples
	 * that is to say : Buy One Get One Free on Apples
	 * 
	 */
	public float getPrice(int quantity) {
		if(quantity == 1) 
			return unitPrice;
		else
		   return (quantity*unitPrice)/2;
			
	}
	
}