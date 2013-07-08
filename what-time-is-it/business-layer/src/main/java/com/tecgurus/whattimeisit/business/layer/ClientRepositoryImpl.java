package com.tecgurus.whattimeisit.business.layer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tecgurus.whattimeisit.business.entities.Client;
import com.tecgurus.whattimeisit.business.interfaces.ClientRepository;

@Repository("business-clientRepository")
public class ClientRepositoryImpl implements ClientRepository {

	private final com.tecgurus.whattimeisit.data.interfaces.ClientRepository clientRepository;
	
	@Autowired
	public ClientRepositoryImpl(com.tecgurus.whattimeisit.data.interfaces.ClientRepository clientRepository){
		this.clientRepository = clientRepository;
	}
	
	@Override
	@Transactional(readOnly = true)
	public int getClientCount() {
		return this.clientRepository.getClientCount();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Client> getClienteList(int from, int rows, String orderBy,
			boolean asc, int bankId) {
		return this.clientRepository.getClienteList(from, rows, orderBy, asc, bankId);
	}

}
