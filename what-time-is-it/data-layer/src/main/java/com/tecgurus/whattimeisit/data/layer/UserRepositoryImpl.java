package com.tecgurus.whattimeisit.data.layer;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tecgurus.whattimeisit.business.entities.User;
import com.tecgurus.whattimeisit.data.interfaces.UsersRepository;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addUser(User user) {
		Perfil perfil = new Perfil();
		perfil.setNombre(user.getUserName());
		
		Integer userId = (Integer) sessionFactory
				.getCurrentSession().save(perfil); 
		
		return userId;
	}
}
