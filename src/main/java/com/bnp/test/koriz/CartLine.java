package com.bnp.test.koriz;

public class CartLine {
	
	@SuppressWarnings("unused")
	private Fruit fruit;
	private int quantity;
	
	public CartLine(Fruit fruit, int quantity) {
		this.fruit = fruit;
		this.quantity = quantity;
		
	}
	
	@SuppressWarnings("unused")
	//sum of price 
	public float getSubTotal() {
		return fruit.getPrice(quantity);
	}
	
	public int getQuantity() {
		
		return quantity;
	}
	
	public String getFruitName() {
		
		return fruit.getName();
	}

}
