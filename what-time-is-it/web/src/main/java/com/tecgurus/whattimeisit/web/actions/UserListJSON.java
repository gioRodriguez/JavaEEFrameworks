package com.tecgurus.whattimeisit.web.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

@Namespace("/user")
public class UserListJSON extends ActionBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Action()
	public String getUserListJSON(){
		return SUCCESS;
	}
}
