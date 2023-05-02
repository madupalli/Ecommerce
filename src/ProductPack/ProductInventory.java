package ProductPack;

import java.util.*;
import StorageLayer.*;

public class ProductInventory extends Products{

	public LinkedHashMap <String,String> productsNameAndDescription = new LinkedHashMap<>();
	public LinkedHashMap <Integer,Integer> productIdAndPrice = new LinkedHashMap<>();
	public LinkedHashMap <Integer,Integer> productIdAndQuantity = new LinkedHashMap<>();
	public LinkedHashMap <LinkedHashMap,LinkedHashMap> inventory  = new LinkedHashMap<>();
	
	
	MysqlStorage mysqlStorage = new MysqlStorage();
	
	
	
	public void updateInventory(Products product) {
		
		mysqlStorage.addProduct(product);
		
	}
	
	public boolean checkAvailability(Products product) {
		
		boolean flag =mysqlStorage.checkProductStock(product);
		
		return flag;
		
	}

}
