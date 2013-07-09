package com.tecgurus.whattimeisit.web.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/client")
@ParentPackage("struts-default")
public class ClientListAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	@Action(value = "list", 
			results = { 
			@Result(
					location = 
					"/jsp/client/list.jsp") })
	public String getClientList() {
		return SUCCESS;
	}
}
