package com.tecgurus.whattimeisit.web.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.tecgurus.whattimeisit.business.entities.Client;
import com.tecgurus.whattimeisit.business.interfaces.ClientRepository;

@Namespace("/client")
@ParentPackage("json-default")
public class ClientListJSON extends ActionSupport {
	private static final long serialVersionUID = -494418150357837040L;
	
	private List<Client> gridModel;
	private int rows;
	private int page;
	private String sidx;
	private String sord;
	private int records;
	private int bankId;
	
	@Autowired
	private ClientRepository clientRepository;

	@Action(value = "json", results = {
			@Result(type = "json")
	})
	public String getClientListJson(){		
		int from = this.getRows() * this.getPage() - this.getRows();
		records = this.clientRepository.getClientCount();
		this.gridModel = 
				this.clientRepository
				.getClienteList(
						from, 
						rows, 
						sidx, 
						"asc".equals(sord), 
						bankId);
			
		return SUCCESS;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public List<Client> getGridModel() {
		return gridModel;
	}

	public void setGridModel(List<Client> gridModel) {
		this.gridModel = gridModel;
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
