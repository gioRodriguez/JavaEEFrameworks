package com.tecgurus.whattimeisit.web.actions;

import com.opensymphony.xwork2.ModelDriven;
import com.tecgurus.whattimeisit.business.entities.User;
import com.tecgurus.whattimeisit.web.models.UserModel;

public class UserAddAction extends ActionBase implements
		ModelDriven<UserModel> {

	private static final long serialVersionUID = 1L;

	private UserModel userModel;	

	public UserAddAction() {
		this.userModel = new UserModel();
	}

	public String execute() {
		User newUser = createUser();
		
		int userId = this.usersRepository.addUser(newUser);

		this.userModel.setUserId(userId);

		return SUCCESS;
	}

	private User createUser() {
		User newUser = new User();
		newUser.setUserName(userModel.getUserFirstName());
		newUser.setUserEmail(userModel.getUserEmail());
		
		return newUser;
	}

	@Override
	public UserModel getModel() {
		return this.userModel;
	}	
}
