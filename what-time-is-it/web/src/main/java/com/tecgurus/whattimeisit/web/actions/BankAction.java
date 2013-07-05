package com.tecgurus.whattimeisit.web.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/bank")
@ParentPackage("struts-default")
public class BankAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	@Action(value = "add", results = { @Result(location = "/bank/add.jsp") })
	public String add() {
		return SUCCESS;
	}

	@Action(value = "update", results = {
			@Result(location = "/bank/error.jsp"), 
			@Result(location = "/bank/error.jsp", name = ERROR)})
	public String update() {		
		return ERROR;
	}
}
