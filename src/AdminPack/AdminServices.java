package AdminPack;

import java.util.*;
import ProductPack.*;
import StorageLayer.*;

public class AdminServices {
	
	ProductInventory pv = new ProductInventory();
	MysqlStorage storage = new MysqlStorage();
	
	
	public void addProducts(Products product) {
		storage.addProduct(product);
		
		
	}
	
	public void updateProducts(int id,int price,int quantity) {
		
		storage.updateProductDetails(id, price, quantity);
		
	}
	
	
	public void updateShoppingList() {
		storage.shoppingStock();
	}

}
 