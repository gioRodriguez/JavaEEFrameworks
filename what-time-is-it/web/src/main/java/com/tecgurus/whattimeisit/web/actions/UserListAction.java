package com.tecgurus.whattimeisit.web.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tecgurus.whattimeisit.business.entities.User;
import com.tecgurus.whattimeisit.business.interfaces.UsersRepository;
import com.tecgurus.whattimeisit.web.models.UserListModel;
import com.tecgurus.whattimeisit.web.models.UserModel;

public class UserListAction extends ActionSupport implements ModelDriven<UserListModel> {

	private static final long serialVersionUID = 1L;

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
		
		return SUCCESS;
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
	public UserListModel getModel() {
		return this.userListModel;
	}
}
