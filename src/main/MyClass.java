package main;
import User.*;
import ProductPack.*;
import AdminPack.*;
import CustomerPack.*;

import java.sql.SQLException;

import StorageLayer.*;

public class MyClass {
	private static String update;

	public static void main (String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        ProductInventory inventory = new ProductInventory();
        AdminServices adminServices = new AdminServices();
        CustomerServices customerServices = new CustomerServices();


		
		MysqlStorage mysqlStorage = new MysqlStorage();
		mysqlStorage.MysqlStorageServiceImpl();
		
		User u = new User(1,"mounisha","maduapalli");
		UserService us = new UserService(u.getUser_id(),u.getName(),u.getPassword());
		
		Products product = new Products();
		product.setPid(6);
		product.setProductName("Hugsy");
		product.setPrice(150);
		product.setDescription("soft toy");
		product.setQuantity(15);
//		
//		
//		//us.signup(u);
//		
//		
		 us.login(u);
//		
//		
//		inventory.updateInventory(product);
		if(inventory.checkAvailability(product) == true) {
			System.out.println("Product is accessible to user");
	}
		
//		adminServices.updateShoppingList();
		
		customerServices.shopping();
		
		adminServices.updateProducts(2, 15, 2);
		customerServices.addToCart(2, "Hugsy");
		customerServices.updateCart(1, product);
		customerServices.checkout();
		
		
		
		
		
		
		
	}

}
	
