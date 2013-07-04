package com.tecgurus.whattimeisit.data.layer;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tecgurus.whattimeisit.business.entities.Client;
import com.tecgurus.whattimeisit.data.layer.model.Cliente;


public class ClienteRepositoryImpl {
	private SessionFactory sessionFactory;
	
	@Autowired
	public ClienteRepositoryImpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<Client> getClienteList(){
		
		return null;
	}
}
