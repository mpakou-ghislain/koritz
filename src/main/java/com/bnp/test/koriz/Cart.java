package com.bnp.test.koriz;

import java.util.*;


public class Cart {
	
	private  List<CartLine> cartlines;
	
	
	public Cart(List<CartLine> list) {
		
		if(list == null)cartlines = new ArrayList<>();
		else this.cartlines = list;
	}
	
	
	public float getTotal() {
		
	float sum = 0;
		
	 for(  CartLine  c : cartlines) {
		 if(c == null)continue;
		 sum = sum + c.getSubTotal();
	 }
	
		return sum;
	
	}

	public void addfruit(CartLine fruit) {
		
		cartlines.add(fruit);
	}
	
	
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
