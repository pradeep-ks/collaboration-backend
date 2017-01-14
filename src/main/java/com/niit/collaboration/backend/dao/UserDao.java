package com.niit.collaboration.backend.dao;

import java.util.List;

import com.niit.collaboration.backend.model.User;

public interface UserDao {

	void create(User user);
	
	void udpate(User user);
	
	void remove(User user);
	
	User getUserById(long userId);
	
	User getUserByUsername(String username);
	
	List<User> list();
	
	boolean isExistingUser(User u);
	
	boolean authenticate(String username, String password);
	
}
