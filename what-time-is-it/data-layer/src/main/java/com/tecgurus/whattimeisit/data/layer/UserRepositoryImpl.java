package com.tecgurus.whattimeisit.data.layer;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tecgurus.whattimeisit.business.entities.User;
import com.tecgurus.whattimeisit.data.interfaces.UsersRepository;
import com.tecgurus.whattimeisit.data.layer.model.Cliente;
import com.tecgurus.whattimeisit.data.layer.model.Cuenta;
import com.tecgurus.whattimeisit.data.layer.model.Perfil;

@Repository("datalayer-userRepository")
public class UserRepositoryImpl implements UsersRepository {

	private SessionFactory sessionFactory;
	
	@Autowired	
	public UserRepositoryImpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<User> getUserList() {
		Criteria criteria = sessionFactory
				.getCurrentSession()
				.createCriteria(Perfil.class);
		
		List<Perfil> perfiles = criteria.list();
		
		List<User> users = new ArrayList<User>();
		for (Perfil perfil : perfiles) {
			User user = new User();
			user.setUserEmail(perfil.getEmail());
			user.setUserName(perfil.getNombre());
			
			users.add(user);
		}
		
		return users;
	}

	@Override
	public int addUser(User user) {
		Perfil perfil = new Perfil();
		perfil.setNombre(user.getUserName());
		perfil.setEmail(user.getUserEmail());
		
		Integer userId = (Integer) sessionFactory
				.getCurrentSession().save(perfil); 
		
		return userId;
	}

	@Override
	public void queryTest() {
		Criteria criteria = sessionFactory
				.getCurrentSession()
				.createCriteria(Cuenta.class);
		
		
		criteria.list();
	}
}

