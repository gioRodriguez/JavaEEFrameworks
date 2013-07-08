package com.tecgurus.whattimeisit.business.layer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tecgurus.whattimeisit.business.interfaces.ClientRepository;
import com.tecgurus.whattimeisit.business.interfaces.UsersRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:businessLayerContext-test.xml")
public class IntegrationTest {

	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Test
	public void queryTest(){
		usersRepository.getUserList(0, 10, "", true);
	}
}
