package com.tecgurus.whattimeisit.data.layer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tecgurus.whattimeisit.business.entities.Bank;
import com.tecgurus.whattimeisit.data.interfaces.BankRepository;

@Repository("data-bankRepository")
public class BankRepositoryImpl implements BankRepository {

	@Override
	public List<Bank> getBankList() {
		List<Bank> bankList = new ArrayList<Bank>();

		Bank bank = new Bank();
		bank.setBankName("BANORTE");
		bank.setIdBank(1);		

		Bank bank2 = new Bank();
		bank2.setBankName("BANAMEX");
		bank2.setIdBank(2);		
		
		Bank bank3 = new Bank();
		bank3.setBankName("AFIRME");
		bank3.setIdBank(3);		
		
		bankList.add(bank);
		bankList.add(bank2);
		bankList.add(bank3);
		return bankList;
	}

}
