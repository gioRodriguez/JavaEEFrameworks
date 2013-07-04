package com.tecgurus.whattimeisit.web.actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.opensymphony.xwork2.ActionSupport;
import com.tecgurus.whattimeisit.business.entities.Bank;
import com.tecgurus.whattimeisit.business.interfaces.BankRepository;

@ParentPackage("json-default")
@Namespace("/bank")
public class BankCatalogJSON extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private Map<Integer, String> bankMap;

	@Autowired
	@Qualifier("business-bankRepository")
	private BankRepository bankRepository;

	@Override
	@Action(value = "json", results = { @Result(type = "json") })
	public String execute() {
		this.bankMap = new HashMap<Integer, String>();
		List<Bank> bankList = this.bankRepository.getBankList();
		for (Bank bank : bankList) {
			bankMap.put(bank.getIdBank(), bank.getBankName());
		}

		return SUCCESS;
	}

	public Map<Integer, String> getBankMap() {
		return bankMap;
	}

	public void setBankMap(Map<Integer, String> bankMap) {
		this.bankMap = bankMap;
	}

	public BankRepository getBankRepository() {
		return bankRepository;
	}

	public void setBankRepository(BankRepository bankRepository) {
		this.bankRepository = bankRepository;
	}
}
