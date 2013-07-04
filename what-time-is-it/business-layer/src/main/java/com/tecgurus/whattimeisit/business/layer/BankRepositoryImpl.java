package com.tecgurus.whattimeisit.business.layer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tecgurus.whattimeisit.business.entities.Bank;
import com.tecgurus.whattimeisit.business.interfaces.BankRepository;

@Repository("business-bankRepository")
public class BankRepositoryImpl implements BankRepository {
	
	private com.tecgurus.whattimeisit.data.interfaces.BankRepository bankRepository;
	
	@Autowired
	public BankRepositoryImpl(com.tecgurus.whattimeisit.data.interfaces.BankRepository bankRepository){
		this.bankRepository = bankRepository;
	}
	
	@Override
	public List<Bank> getBankList() {
		return this.bankRepository.getBankList();
	}
}
