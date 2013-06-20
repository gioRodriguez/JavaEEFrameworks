package com.tecgurus.whattimeisit.business.layer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tecgurus.whattimeisit.business.entities.User;
import com.tecgurus.whattimeisit.business.interfaces.UsersRepository;

@Repository("businesslayer-userRepository")
public class UserReporitoryImpl implements UsersRepository {
		
	private com.tecgurus.whattimeisit.data.interfaces.UsersRepository usersRepository;
	
	@Autowired
	public UserReporitoryImpl(
			com.tecgurus.whattimeisit.data.interfaces.UsersRepository usersRepository){
		this.usersRepository = usersRepository;
	}
	
	@Override
	public List<User> getUserList() {
		
		return this.usersRepository.getUserList();
	}

}
