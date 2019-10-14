/**
 * 
 */
package com.bnp.test.koriz;

/**
 * @author Ghislain
 *
 */
public class Fruit {
	
	/**
	 * @param name
	 * @param unitPrice
	 * @param quantity
	 */
	private String name;
	protected float unitPrice;
	
	public Fruit(String name, float unitPrice) {
		this.name = name;
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the unitPrice
	 */
	public float getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public float getPrice(int quantity) {
		
		return unitPrice*quantity;
	}
	
}