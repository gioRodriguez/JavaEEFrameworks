package com.tecgurus.whattimeisit.web.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tecgurus.whattimeisit.business.entities.User;
import com.tecgurus.whattimeisit.business.interfaces.UsersRepository;
import com.tecgurus.whattimeisit.web.models.UserModel;

public class AddUserAction extends ActionSupport implements ModelDriven<UserModel> {

	private static final long serialVersionUID = 1L;

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
		
		return SUCCESS;
	}
	
	@Override
	public UserModel getModel() {
		return this.userModel;
	}

	public UsersRepository getUsersRepository() {
		return usersRepository;
	}

	public void setUsersRepository(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
}
