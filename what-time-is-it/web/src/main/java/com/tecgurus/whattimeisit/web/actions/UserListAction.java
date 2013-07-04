package com.tecgurus.whattimeisit.web.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ModelDriven;
import com.tecgurus.whattimeisit.business.entities.User;
import com.tecgurus.whattimeisit.web.models.UserListModel;
import com.tecgurus.whattimeisit.web.models.UserModel;


@Namespace("/user")
public class UserListAction extends ActionBase implements ModelDriven<UserListModel> {

	private static final long serialVersionUID = 1L;

	private UserListModel userListModel;

	public UserListAction() {
		this.userListModel = new UserListModel();
	}

	@Action(value = "list", 
			results = @Result(location = "/user/list.jsp"))
	public String execute() {
		List<User> userList = this.usersRepository.getUserList();

		////crear lista user model
		List<UserModel> userModelList = new ArrayList<UserModel>();
		
		////convertir User --> UserModel
		for (User user : userList) {
			UserModel userModel = new UserModel();
			userModel.setUserFirstName(user.getUserName());
			userModel.setUserEmail(user.getUserEmail());
			
			userModelList.add(userModel);
		}
		
		this.userListModel.setUserList(userModelList);
		
		return SUCCESS;
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
