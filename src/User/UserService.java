package User;

import java.util.*;
import StorageLayer.*;
import User.*;

public class UserService extends User {
	public UserService(int user_id, String name, String password) {
		super(user_id, name, password);
		
	}

	MysqlStorage mysqlStorage = new MysqlStorage();
	 
	HashMap <Integer,String> userRecord = new HashMap<>();

	private User user;
	
	public  void signup(User user) {
		
		
		this.user = user;
		mysqlStorage.userSignUp(user);
		
	}
	
	public void login(User user ) {
		  mysqlStorage.userLogin(user);
		
		
		
	}
	
	public boolean logout(User user) {
		
		String storedPassword = userRecord.get(user.getUser_id());
		if(storedPassword.equals(user.getPassword())) {
		return true;
	}
		else {
			return false;
		}
	}
	

}
