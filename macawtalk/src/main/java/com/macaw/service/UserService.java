package com.macaw.service;

import java.util.Iterator;

import com.macaw.entity.User;
import com.macaw.entity.dao.UserDAO;
import com.macaw.entity.dao.UserDAOImp;

public class UserService {
	private UserDAO dao;
	
	public UserService()
	{
		dao = new UserDAOImp();
	}
	
	public boolean checkUser(String username){
		User user = dao.findUserByName(username);
		if(user == null)
			return false;
		else
			return true;
	}
	
	public void register(String username, String password, String email1){
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail1(email1);
		dao.saveUser(user);
	}
	
	public User login(String username, String password){
		Iterator<User> iterator = dao.findUser("username=? and password=?", username, password).iterator();
		while(iterator.hasNext()){
			return iterator.next();
		}
		return null;
	}
}
