package com.tecgurus.whattimeisit.datalayer.impl;

import java.util.List;

import org.business.entities.User;
import org.data.interfaces.UsersRepository;
import org.springframework.stereotype.Repository;


@Repository("datalayer-userRepository")
public class UserRepositoryImpl implements UsersRepository {

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

}
