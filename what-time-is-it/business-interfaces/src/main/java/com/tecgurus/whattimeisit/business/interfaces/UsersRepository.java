package com.tecgurus.whattimeisit.business.interfaces;

import java.util.List;

import com.tecgurus.whattimeisit.business.entities.User;

public interface UsersRepository {

	public List<User> getUserList();
	
	public List<User> getUserList(int from, int rows, String orderBy, boolean asc);
	
	public int getUserCount();

	public int addUser(User user);
	
	public void queryTest();
}
