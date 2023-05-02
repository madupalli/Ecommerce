package CustomerPack;
import StorageLayer.*;
import ProductPack.*;
public class CustomerServices {
	MysqlStorage storage = new MysqlStorage();
	
	
	public void shopping() {
		storage.customerShopping();
		
	}
	
	public void addToCart(int requiredQuantity, String productName) {
		
		storage.customerAddingToCart(requiredQuantity, productName);
		
	}
	
	public void updateCart(int requiredQuantity, Products product) {
		storage.customerUpdateCart(requiredQuantity, product);
		
	}
	
	public void checkout() {
		storage.customerCheckout();
		
	}

}
