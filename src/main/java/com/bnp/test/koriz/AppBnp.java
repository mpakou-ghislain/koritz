package com.bnp.test.koriz;

import java.util.Scanner;

/**
 * Principal class to manage item !
 *
 */
public class AppBnp {
	
	private static Fruit ap, wa, or;
	private static Cart cart;
	
    @SuppressWarnings({ })
	public static void main( String[] args ) {
    	ap = new Apple("Apple",0.2f);
    	or = new Orange("Orange",0.50f);
    	wa = new Watermelon("Watermelon",0.80f);
    	
        System.out.println("Here are ours items and their prices : " );
        System.out.println();
        System.out.println("Item" + "     "+ "          Price(£)");
        System.out.println();
        System.out.println(ap.getName()+"              "+ ap.getUnitPrice());
        System.out.println(or.getName()+"             "+ or.getUnitPrice());
        System.out.println(wa.getName()+"         "+ wa.getUnitPrice());
        System.out.println();
        System.out.println("Here are ours promotions : " );
        System.out.println();
        System.out.println(" ● Buy One Get One Free on Apples : " );
        System.out.println(" ● Three For The Price Of Two on Watermelons : " );
        System.out.println();
        
        cart = new Cart(null);
        
        int i = 0;
        while(i < 3) {
        	orderItem();
        	i++;
        }
        
        Invoice invoice = new Invoice(cart);
        
        System.out.println(invoice.getFinalInvoive());
  }
    
    
    private static void orderItem() {
       System.out.println("Enter the name of the Item you want to buy: ");
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String st = sc.nextLine();
        
        System.out.println("You want to buy: "+ st);
        System.out.println("How many "+ st + "(s)  do you want to buy ? : ");
        int itemQuantity = sc.nextInt();
        System.out.println("You want to buy: "+ itemQuantity + " "+st+"(s)");
        
        switch(st) {
        
        case "Apple":{
        	cart.addfruit(new CartLine(ap, itemQuantity));
        	
        break;
        }
        
        case "Watermelon":{
        	cart.addfruit(new CartLine(wa, itemQuantity));
        break;
        }
        
        case "Orange": {
        	cart.addfruit(new CartLine(or, itemQuantity));
        break;
        }
        
        default:{
     	   System.out.println("We do not have that kind of fruit.\n");
        }
    }
    }
}