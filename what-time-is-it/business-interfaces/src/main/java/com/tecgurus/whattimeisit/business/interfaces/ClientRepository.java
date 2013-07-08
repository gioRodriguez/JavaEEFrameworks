package com.tecgurus.whattimeisit.business.interfaces;

import java.util.List;

import com.tecgurus.whattimeisit.business.entities.Client;

public interface ClientRepository {
	public abstract int getClientCount();

	public abstract List<Client> getClienteList(int from, int rows,
			String orderBy, boolean asc, int bankId);
}
