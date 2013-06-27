package com.tecgurus.whattimeisit.business.layer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tecgurus.whattimeisit.business.entities.User;
import com.tecgurus.whattimeisit.business.interfaces.UsersRepository;

@Repository("businesslayer-userRepository")
public class UserReporitoryImpl implements UsersRepository {
		
	@Autowired
	private com.tecgurus.whattimeisit.data.interfaces.UsersRepository usersRepository;
	
	@Autowired
	public UserReporitoryImpl(
			com.tecgurus.whattimeisit.data.interfaces.UsersRepository usersRepository){
		this.usersRepository = usersRepository;
	}
	
	@Override
	public List<User> getUserList() {
		
		return this.usersRepository.getUserList();
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addUser(User user) {
		////TODO: verificar si el usuario en session tiene
		////permisos de aniadir nuevos usuarios
		
		////Validar el user para no romper la BD
		
		////Grabar en la bitacora que se ha agregado
		////un nuevo usuario
		
		////TODO: Validar si el usario ya esta registrado
		return this.usersRepository.addUser(user);
	}	

}
