package com.tecgurus.whattimeisit.webii.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.tecgurus.whattimeisit.business.entities.User;
import com.tecgurus.whattimeisit.business.interfaces.UsersRepository;
import com.tecgurus.whattimeisit.webii.models.UserListModel;
import com.tecgurus.whattimeisit.webii.models.UserModel;

public class UserListAction implements ModelDriven {

	private UsersRepository usersRepository;

	private UserListModel userListModel;

	public UserListAction() {
		this.userListModel = new UserListModel();
	}

	public String execute() {
		List<User> userList = this.usersRepository.getUserList();

		////crear lista user model
		List<UserModel> userModelList = new ArrayList<UserModel>();
		
		////convertir User --> UserModel
		for (User user : userList) {
			UserModel userModel = new UserModel();
			userModel.setUserName(user.getUserName());
			
			userModelList.add(userModel);
		}
		
		this.userListModel.setUserList(userModelList);
		
		return "success";
	}

	public UsersRepository getUsersRepository() {
		return usersRepository;
	}

	public void setUsersRepository(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

	public UserListModel getUserListModel() {
		return userListModel;
	}

	public void setUserListModel(UserListModel userListModel) {
		this.userListModel = userListModel;
	}

	@Override
	public Object getModel() {
		return this.userListModel;
	}
}
