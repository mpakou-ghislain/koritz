/**
 * 
 */
package com.bnp.test.koriz;

/**
 * @author Ghislain
 * This class inherits from Fruit
 * an orange is a fruit.
 */
public class Orange extends Fruit {
    
	/**
	 * constructor of Orange class using field
	 */
	public Orange(String name, float price) {
		super(name, price);
	}

	/**
	 * @param max
	 * @return the price of Orange quantity
	 * that has been sold
	 */
	public float purchasePrice(int max) {
		return max*super.getUnitPrice();
	}
}
