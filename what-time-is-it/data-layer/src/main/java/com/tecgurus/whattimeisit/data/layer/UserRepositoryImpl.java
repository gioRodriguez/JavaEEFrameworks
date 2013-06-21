package com.tecgurus.whattimeisit.data.layer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tecgurus.whattimeisit.business.entities.User;
import com.tecgurus.whattimeisit.data.interfaces.UsersRepository;

@Repository("datalayer-userRepository")
public class UserRepositoryImpl implements UsersRepository {
	
	private List<User> dataBase;
	
	public UserRepositoryImpl(){
		this.dataBase = new ArrayList<User>();
		
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		User user4 = new User();
		User user5 = new User();
		
		user1.setUserName("Iyadira");
		user2.setUserName("Paco");
		user3.setUserName("Hector");
		user4.setUserName("Alex");
		user5.setUserName("Gio");
		
		this.dataBase.add(user1);
		this.dataBase.add(user2);
		this.dataBase.add(user3);
		this.dataBase.add(user4);
		this.dataBase.add(user5);
	}
	
	@Override
	public List<User> getUserList() {
		// TODO aqui deberia ir la BD: remove fake impl
		return this.dataBase;
	}

	@Override
	public int addUser(User user) {
		this.dataBase.add(user);
		return 1;
	}

}
