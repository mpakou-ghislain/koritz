package com.bnp.test.koriz;

import java.util.*;


/**
 * 
 * @author Ghislain
 * This class contains all commands
 *
 */
public class Cart {
	
	/**
	 * 
	 * @param list
	 */
	private  List<CartLine> cartlines;
	
	/**
	 * 
	 * @param list
	 * constructor of Cart class using field
	 */
	public Cart(List<CartLine> list) {
		
		if(list == null)cartlines = new ArrayList<>();
		else this.cartlines = list;
	}
	
	/**
	 * 
	 * @return the total price of whole fruits sold
	 */
	public float getTotal() {
		
	float sum = 0;
		
	 for(  CartLine  c : cartlines) {
		 if(c == null)continue;
		 sum = sum + c.getSubTotal();
	 }
	
		return sum;
	
	}

	/**
	 * 
	 * @param fruit
	 * make the sum of fruits sold
	 * with respect of each kind of fruit
	 */
	public void addfruit(CartLine fruit) {
		
		cartlines.add(fruit);
	}
	
	/**
	 * 
	 * @return the total of fruits sold
	 * 
	 */
	public int getTotalFruit() {
		
		int total = 0;
		
		for(CartLine c : cartlines) {
			if(c == null)continue;
			total = total + c.getQuantity();
		}
		return total;
	}


	/**
	 * @return the cartline
	 */
	public List<CartLine> getCartlines() {
		return cartlines;
	}
	
	
}
