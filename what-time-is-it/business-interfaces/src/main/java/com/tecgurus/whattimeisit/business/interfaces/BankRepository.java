package com.tecgurus.whattimeisit.business.interfaces;

import java.util.List;

import com.tecgurus.whattimeisit.business.entities.Bank;

public interface BankRepository {
	public List<Bank> getBankList();
}
