package com.bnp.test.koriz;


/**
 * 
 * @author Ghislain
 * This class contains informations about 
 * each command line
 *
 */
public class CartLine {
	
	/**
	 * @param fruit
	 * @param quantity
	 * 
	 */
	private Fruit fruit;
	private int quantity;
	
	
	/**
	 * 
	 * @param fruit
	 * @param quantity
	 * constructor of CartLine class using field
	 */
	public CartLine(Fruit fruit, int quantity) {
		this.fruit = fruit;
		this.quantity = quantity;
		
	}
	
	/**
	 * 
	 * @return the sub total price of fruits
	 * sold with respect of each kind of fruits
	 */
	public float getSubTotal() {
		return fruit.getPrice(quantity);
	}
	
	
	/**
	 * 
	 * @return the quantity of each fruit sold
	 */
	public int getQuantity() {
		
		return quantity;
	}
	
	
	/**
	 * 
	 * @return the name of each fruit sold
	 */
	public String getFruitName() {
		
		return fruit.getName();
	}

}
