package com.tecgurus.whattimeisit.datalayer.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tecgurus.whattimeisit.datalayer.User;
import com.tecgurus.whattimeisit.datalayer.UsersRepository;

@Repository("datalayer-userRepository")
public class UserRepositoryImpl implements UsersRepository {

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

}
