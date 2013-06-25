package com.tecgurus.whattimeisit.web.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.tecgurus.whattimeisit.business.interfaces.UsersRepository;

public abstract class Action extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected UsersRepository usersRepository;
	
	public UsersRepository getUsersRepository() {
		//DRY: Don't Repeat Yourself
		
		return usersRepository;
	}

	public void setUsersRepository(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
}
