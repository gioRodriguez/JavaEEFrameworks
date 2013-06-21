package com.tecgurus.whattimeisit.data.interfaces;

import java.util.List;

import com.tecgurus.whattimeisit.business.entities.User;

public interface UsersRepository {

	public List<User> getUserList();
	
	public int addUser(User user);
}
