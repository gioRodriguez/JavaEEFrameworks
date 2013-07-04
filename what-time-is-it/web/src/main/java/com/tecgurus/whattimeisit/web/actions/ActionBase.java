package com.tecgurus.whattimeisit.web.actions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.opensymphony.xwork2.ActionSupport;
import com.tecgurus.whattimeisit.business.interfaces.UsersRepository;

public abstract class ActionBase extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	@Qualifier("businesslayer-userRepository")
	protected UsersRepository usersRepository;
	
	public UsersRepository getUsersRepository() {
		//DRY: Don't Repeat Yourself
		
		return usersRepository;
	}

	public void setUsersRepository(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
}
