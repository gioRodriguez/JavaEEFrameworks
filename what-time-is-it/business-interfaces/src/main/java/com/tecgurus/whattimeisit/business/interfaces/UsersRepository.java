package com.tecgurus.whattimeisit.business.interfaces;

import java.util.List;

import com.tecgurus.whattimeisit.business.entities.User;

public interface UsersRepository {

	public List<User> getUserList();

	/**
	 * Aniade un nuevo usuario
	 * 
	 * @param user
	 *            el nuevo usuario a aniadir
	 * @return id de la BD
	 * @throws BussinesException
	 *             si el usuario en sesion no tiene privilegios de agregar
	 *             usuarios, o si bla bla bla, usa este metodo solo y solo
	 *             despues de usar preAddUser() crea una url para mandar por
	 *             email que solo dura 24 horas activa
	 */
	public int addUser(User user);
}
