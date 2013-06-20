package org.business.interfaces;

import java.util.List;

import org.business.entities.User;


public interface UsersRepository {

	public List<User> getUserList();
}
