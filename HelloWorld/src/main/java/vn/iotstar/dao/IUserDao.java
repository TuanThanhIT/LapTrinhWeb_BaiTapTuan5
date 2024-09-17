package vn.iotstar.dao;

import vn.iotstar.models.UserModel;

public interface IUserDao {
	// khai bao cac ham va thu tuc su dung cho login
	UserModel findByUserName(String username);
	
	//register
	void insert(UserModel user);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	
}

