package com.tecgurus.whattimeisit.web.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/holaMundo")
@ParentPackage("json-default")
public class HollaMundoJSON extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private int userId;
	
	private List<Integer> usersId;
	
	@Action(value = "json", results = {@Result(type = "json")})
	public String json(){
		this.userId = 100;
		this.usersId = new ArrayList<Integer>();
		this.usersId.add(3);
		this.usersId.add(16);
		this.usersId.add(23);
		return SUCCESS;
	}

	public List<Integer> getIyadiraId(){
		return this.usersId;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
