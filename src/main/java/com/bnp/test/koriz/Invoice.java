package com.bnp.test.koriz;

public class Invoice {
	
	@SuppressWarnings("unused")
	private Cart ct;

	public Invoice(Cart cart) {
		
		this.ct = cart;
	}
	

@SuppressWarnings("unused")
private String invoiceItemHeader() {
	return "Name" + "\t\t"+ "Quantity"+"\t\t" + "Price\n\n";
}

	
	@SuppressWarnings("unused")
	private String invoiceItem(CartLine cart) {
		
		return cart.getFruitName() + "\t\t"+ cart.getQuantity()+"\t\t" +cart.getSubTotal() + "\n";
	}
	
	@SuppressWarnings("unused")
	private String invoiceTotaLine() {
		
		return  "Total : " + ct.getTotal()+" £ \n\n Thank you. See you soon !" ;
	}
	
	
	public String getFinalInvoive() {
		
		String invoicesItems = "";
		
		for(CartLine cartLine : ct.getCartlines()) {
			if(cartLine == null)continue;
			invoicesItems += invoiceItem(cartLine);
		}
		
		return invoiceItemHeader() + invoicesItems + invoiceTotaLine();
	}
}

