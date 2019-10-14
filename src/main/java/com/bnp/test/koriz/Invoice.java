package com.bnp.test.koriz;


/**
 * 
 * @author Ghislain
 * This is class of all details about the selling of fruits
 *
 */
public class Invoice {
	
	/**
	 * @param cart
	 */
	private Cart ct;

	/**
	 * 
	 * @param cart
	 * constructor of Invoice class using field
	 */
	 public Invoice(Cart cart) {
		
		this.ct = cart;
	 }
	

/**
 * 
 * @return the title of main informations related to fruits
 */
  private String invoiceItemHeader() {
	return "Name" + "\t\t"+ "Quantity"+"\t\t" + "Price\n\n";
  }

	
	/**
	 * 
	 * @param cart
	 * @return the fruits command line per name, per quantity and per subTotal 
	 */
	private String invoiceItem(CartLine cart) {
		
		return cart.getFruitName() + "\t\t"+ cart.getQuantity()+"\t\t" +cart.getSubTotal() + "\n";
	}
	
	/**
	 * 
	 * @return the final line of invoice which tells us about the total amount to pay
	 */
	private String invoiceTotaLine() {
		
		return  "Total : " + ct.getTotal()+" £ \n\n Thank you. See you soon !" ;
	}
	
	
	/**
	 * 
	 * @return the whole informations that the application was designed for
	 */
	public String getFinalInvoive() {
		
		String invoicesItems = "";
		
		for(CartLine cartLine : ct.getCartlines()) {
			if(cartLine == null)continue;
			invoicesItems += invoiceItem(cartLine);
		}
		
		return invoiceItemHeader() + invoicesItems + invoiceTotaLine();
	}
}

