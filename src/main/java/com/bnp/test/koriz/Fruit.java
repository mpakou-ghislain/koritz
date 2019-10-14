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
	 */
	private String name;
	protected float unitPrice;
	
	/**
	 *  constructor of Fruit class using field 
	 */
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
	 * @return the unitPrice of each Fruit
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

	
	/**
	 * 
	 * @param quantity
	 * @return the price of Fruit quantity which has been bought
	 */
	public float getPrice(int quantity) {
		
		return unitPrice*quantity;
	}
	
}