package com.tecgurus.whattimeisit.data.layer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tecgurus.whattimeisit.business.entities.User;
import com.tecgurus.whattimeisit.data.interfaces.UsersRepository;

@Repository("datalayer-userRepository")
public class UserRepositoryImpl implements UsersRepository {
	
	@Override
	public List<User> getUserList() {
		// TODO remove fake impl
		return new ArrayList<User>();
	}

}
