package com.macaw.service;

import java.util.Iterator;

import com.macaw.entity.User;
import com.macaw.entity.dao.UserDAO;

public class UserService {
	private UserDAO dao;
	
	public UserService()
	{
		dao = new UserDAO();
	}
	
	public boolean checkUser(String username){
		Iterator<User> iterator = dao.queryUserList(new String[]{"username"},"username=?",username).iterator();
		while(iterator.hasNext()){
			return true;
		}
		return false;
	}
	
	public void register(String username, String password, String email1){
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		u.setEmail1(email1);
		dao.insertUser(u);
	}
	
	public User login(String username, String password){
		Iterator<User> iterator = dao.queryUserList(new String[]{"*"},"username=? and password=?",username,password).iterator();
		while(iterator.hasNext()){
			return iterator.next();
		}
		return null;
	}
}
