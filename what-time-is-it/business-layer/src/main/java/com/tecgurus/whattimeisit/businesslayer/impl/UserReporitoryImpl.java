package com.tecgurus.whattimeisit.businesslayer.impl;

import java.util.List;

import org.business.entities.User;
import org.data.interfaces.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("userRepository")
public class UserReporitoryImpl implements UsersRepository {
		
	private org.data.interfaces.UsersRepository usersRepository;
	
	@Autowired
	public UserReporitoryImpl(
			org.data.interfaces.UsersRepository usersRepository){
		this.usersRepository = usersRepository;
	}
	
	@Override
	public List<User> getUserList() {
		
		return this.usersRepository.getUserList();
	}

}
