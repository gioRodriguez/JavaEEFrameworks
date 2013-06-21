package com.tecgurus.whattimeisit.webii.actions;

import com.opensymphony.xwork2.ModelDriven;
import com.tecgurus.whattimeisit.business.entities.User;
import com.tecgurus.whattimeisit.business.interfaces.UsersRepository;
import com.tecgurus.whattimeisit.webii.models.UserModel;

public class AddUserAction implements ModelDriven {

	private UserModel userModel;
	
	private UsersRepository usersRepository;
	
	public AddUserAction(){
		this.userModel = new UserModel();
	}
	
	public String execute(){
		
		User newUser = new User();
		newUser.setUserName(userModel.getUserName());
		newUser.setUserEmail(userModel.getUserEmail());
		
		this.usersRepository.addUser(newUser);
		
		return "success";
	}
	
	@Override
	public Object getModel() {
		return this.userModel;
	}

	public UsersRepository getUsersRepository() {
		return usersRepository;
	}

	public void setUsersRepository(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
}
