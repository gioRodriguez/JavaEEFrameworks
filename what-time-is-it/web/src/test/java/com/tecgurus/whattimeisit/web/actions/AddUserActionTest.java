package com.tecgurus.whattimeisit.web.actions;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import com.tecgurus.whattimeisit.business.entities.User;
import com.tecgurus.whattimeisit.business.interfaces.UsersRepository;
import com.tecgurus.whattimeisit.web.models.UserModel;

public class AddUserActionTest {

	@Test
	public void ExecuteTest() {
		// Arrange
		AddUserAction addUserAction = new AddUserAction();

		UsersRepository usersRepository = Mockito.mock(UsersRepository.class);
		Mockito.when(usersRepository.addUser(Mockito.any(User.class)))
				.thenReturn(5);

		UserModel userModel = new UserModel();
		userModel.setUserEmail("mail@mail.com");
		userModel.setUserFirstName("Gio");
		userModel.setUserLastName("Rdz");
		addUserAction.setUsersRepository(usersRepository);

		// Act
		String result = addUserAction.execute();

		// Assert
		assertTrue(addUserAction.getModel().getUserId() != 0);
		assertEquals(5, addUserAction.getModel().getUserId());
		assertEquals("success", result);
	}
}
