/**
 * 
 */
package com.bnp.test.koriz;

/**
 * @author Ghislain
 *
 */
public class Orange extends Fruit {

	public Orange(String name, float price) {
		super(name, price);
	}

	public float purchasePrice(int max) {
		return max*super.getUnitPrice();
	}
}
