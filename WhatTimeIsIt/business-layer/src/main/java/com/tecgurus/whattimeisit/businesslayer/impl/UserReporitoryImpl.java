package com.tecgurus.whattimeisit.businesslayer.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tecgurus.whattimeisit.businesslayer.UsersRepository;
import com.tecgurus.whattimeisit.datalayer.User;

@Repository("userRepository")
public class UserReporitoryImpl implements UsersRepository {
		
	private com.tecgurus.whattimeisit.datalayer.UsersRepository usersRepository;
	
	@Autowired
	public UserReporitoryImpl(
			com.tecgurus.whattimeisit.datalayer.UsersRepository usersRepository){
		this.usersRepository = usersRepository;
	}
	
	@Override
	public List<User> getUserList() {
		
		return this.usersRepository.getUserList();
	}

}
