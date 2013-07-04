package com.tecgurus.whattimeisit.data.interfaces;

import java.util.List;

import com.tecgurus.whattimeisit.business.entities.Bank;

public interface BankRepository {
	public List<Bank> getBankList();
}
