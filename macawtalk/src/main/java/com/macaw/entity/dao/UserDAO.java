package com.macaw.entity.dao;

import java.util.List;
import com.macaw.entity.User;

public interface UserDAO {
	public void saveUser(User user);
	public List<User> findUser(String where, String... whereArgs);
	public User findUserByName(String username);
	public void updateUser(User user);
	public void removeUser(User user);
}
