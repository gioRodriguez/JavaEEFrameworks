package com.tecgurus.whattimeisit.data.layer;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tecgurus.whattimeisit.business.entities.Client;
import com.tecgurus.whattimeisit.data.interfaces.ClientRepository;
import com.tecgurus.whattimeisit.data.layer.model.Cliente;

@Repository("data-clientRepository")
public class ClientRepositoryImpl implements ClientRepository {
	private SessionFactory sessionFactory;

	@Autowired
	public ClientRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tecgurus.whattimeisit.data.layer.ClienteRepository#getUserCount()
	 */
	@Override
	public int getClientCount() {
		Criteria criteria = this.sessionFactory.getCurrentSession()
				.createCriteria(Cliente.class);

		return ((Number) criteria.setProjection(Projections.rowCount())
				.uniqueResult()).intValue();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tecgurus.whattimeisit.data.layer.ClienteRepository#getClienteList
	 * (int, int, java.lang.String, boolean, int)
	 */
	@Override
	public List<Client> getClienteList(int from, int rows, String orderBy,
			boolean asc, int bankId) {
		Criteria criteria = this.sessionFactory.getCurrentSession()
				.createCriteria(Cliente.class);

		List<Client> clientsList = new ArrayList<Client>();
		List<Cliente> clientes = criteria.list();
		for (Cliente cliente : clientes) {
			Client client = new Client();
			client.setClientName(cliente.getNombre() + " "
					+ cliente.getApaterno() + " " + cliente.getAmaterno());
			
			clientsList.add(client);
		}

		return clientsList;
	}
}
