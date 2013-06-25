package com.tecgurus.whattimeisit.web.actions;

import com.opensymphony.xwork2.ModelDriven;
import com.tecgurus.whattimeisit.business.entities.User;
import com.tecgurus.whattimeisit.web.models.UserModel;

public class AddUserAction extends Action implements
		ModelDriven<UserModel> {

	private static final long serialVersionUID = 1L;

	private UserModel userModel;	

	public AddUserAction() {
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
		newUser.setUserName(userModel.getUserFirstName() + userModel.getUserLastName());
		newUser.setUserEmail(userModel.getUserEmail());
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		// /code
		
		return newUser;
	}

	@Override
	public UserModel getModel() {
		return this.userModel;
	}	
}
