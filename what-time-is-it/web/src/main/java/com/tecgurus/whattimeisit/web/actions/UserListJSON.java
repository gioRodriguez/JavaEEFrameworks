package com.tecgurus.whattimeisit.web.actions;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.tecgurus.whattimeisit.business.entities.User;

@ParentPackage("json-default")
@Namespace("/user")
public class UserListJSON extends ActionBase {
	private static final long serialVersionUID = 1L;

	private List<User> gridModel;
	private int rows;
	private int page;
	private String sidx;
	private String sord;
	private int records;
	private int bankId;

	@Override
	@Action(value = "json", results = { @Result(type = "json") })
	public String execute() {
		int from = this.getRows() * this.getPage() - this.getRows();
		records = this.usersRepository.getUserCount();
		gridModel = this.usersRepository.getUserList(from, rows, sord,
				"asc".equals(sord));

		return SUCCESS;
	}

	public List<User> getGridModel() {
		return gridModel;
	}

	public void setGridModel(List<User> gridModel) {
		this.gridModel = gridModel;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public int getTotal() {
		return rows > 0 ? (int) Math.ceil((double) records / (double) rows) : 0;
	}

	public int getRecords() {
		return records;
	}

	public void setRecords(int records) {
		this.records = records;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

}
