package com.tecgurus.whattimeisit.data.layer;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tecgurus.whattimeisit.data.layer.model.Banco;

@Repository("datalayer-bancoRepository")
public class BancoRepositoryImpl {

	private final SessionFactory sessionFactory;

	@Autowired
	public BancoRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Banco> getBancosList() {
		Criteria criteria = sessionFactory.getCurrentSession()
				.createCriteria(Banco.class);
		
		return criteria.list();
	}
}
