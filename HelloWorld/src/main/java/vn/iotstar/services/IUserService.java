package vn.iotstar.services;

import vn.iotstar.models.UserModel;

public interface IUserService {
	// login
	UserModel findByUserName(String username);
	UserModel login(String username, String password);
	
	// register
	void insert(UserModel user);
	boolean register(String email, String password, String username, String fullname, String phone);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
}
