package com.tecgurus.whattimeisit.businesslayer;

import java.util.List;

import com.tecgurus.whattimeisit.datalayer.User;

public interface UsersRepository {

	public List<User> getUserList();
}
