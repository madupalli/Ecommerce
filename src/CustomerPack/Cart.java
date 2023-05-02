package CustomerPack;
import ProductPack.*;

public class Cart {
	ProductInventory stock = new ProductInventory();

	public void calculateUnitPrice(Products product) {
		boolean flag= stock.checkAvailability(product);
		
		
	}
	
	public void calculateTotalPrice() {}
}
