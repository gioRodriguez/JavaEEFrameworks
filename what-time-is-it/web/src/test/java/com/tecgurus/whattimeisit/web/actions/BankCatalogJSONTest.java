package com.tecgurus.whattimeisit.web.actions;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.tecgurus.whattimeisit.business.entities.Bank;
import com.tecgurus.whattimeisit.business.interfaces.BankRepository;

public class BankCatalogJSONTest {

	private static final int AFIRME_ID = 3;
	private static final String AFIRME = "afirme";
	private static final int BANAMEX_ID = 2;
	private static final String BANAMEX = "banamex";
	private static final int BANORTE_ID = 1;
	private static final String BANORTE = "banorte";
	private List<Bank> bankList;
	private Map<Integer, String> bankMap;

	@Before
	public void setUp() throws Exception {
		this.bankMap = new HashMap<Integer, String>();
		this.bankList = new ArrayList<Bank>();

		Bank bank = new Bank();
		bank.setBankName(BANORTE);
		bank.setIdBank(BANORTE_ID);		

		Bank bank2 = new Bank();
		bank2.setBankName(BANAMEX);
		bank2.setIdBank(BANAMEX_ID);		
		
		Bank bank3 = new Bank();
		bank3.setBankName(AFIRME);
		bank3.setIdBank(AFIRME_ID);		
		
		this.bankList.add(bank);
		this.bankList.add(bank2);
		this.bankList.add(bank3);
		
		bankMap.put(BANORTE_ID, BANORTE);
		bankMap.put(BANAMEX_ID, BANAMEX);
		bankMap.put(AFIRME_ID, AFIRME);
	}

	@Test
	public void executeTest() {
		// Arrange
		String expected = "success";
		BankRepository bankRepository = Mockito.mock(BankRepository.class);
		Mockito.when(bankRepository.getBankList()).thenReturn(this.bankList);
		BankCatalogJSON bankCatalogJSON = new BankCatalogJSON();
		bankCatalogJSON.setBankRepository(bankRepository);

		// Act
		String actual = bankCatalogJSON.execute();
		
		// Assert
		assertEquals(expected, actual);
		assertArrayEquals(this.bankMap.keySet().toArray(), bankCatalogJSON.getBankMap().keySet().toArray());
		assertArrayEquals(this.bankMap.values().toArray(), bankCatalogJSON.getBankMap().values().toArray());
	}	

	@Test
	public void bankMapTest() {
		// Arrange
		Map<Integer, String> expected = new HashMap<Integer, String>(); 
		BankCatalogJSON bankCatalogJSON = new BankCatalogJSON();
		bankCatalogJSON.setBankMap(expected);
		
		// Act
		Map<Integer, String> actual = bankCatalogJSON.getBankMap();
		
		// Assert
		assertSame(expected, actual);
	}

}
