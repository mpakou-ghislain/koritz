/**
 * 
 */
package com.bnp.test.koriz;

/**
 * @author Ghislain
 *
 */
public class Apple extends Fruit {

	public Apple(String name, float price) {
		super(name, price);
	}
	
	public float getPrice(int quantity) {
		if(quantity == 1) 
			return unitPrice;
		else
		   return (quantity*unitPrice)/2;
			
	}
	
}