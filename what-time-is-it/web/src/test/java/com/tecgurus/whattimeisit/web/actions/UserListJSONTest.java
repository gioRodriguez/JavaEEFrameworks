package com.tecgurus.whattimeisit.web.actions;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import com.tecgurus.whattimeisit.business.entities.User;
import com.tecgurus.whattimeisit.business.interfaces.UsersRepository;

public class UserListJSONTest {

	/**
	 * records to show
	 */
	private static final int ROWS = 10;

	/**
	 * current page
	 */
	private static final int PAGE = 3;

	/**
	 * sorting order - asc or desc
	 */
	private static final String SORD = "asc";

	/**
	 * index row - i.e. user click to sort.
	 */
	private static final String SIDX = "userId";

	/**
	 * total records at the repository
	 */
	private static final int RECORDS = 30;

	private List<User> userList;

	@Before
	public void setUp() {
		this.userList = new ArrayList<User>();
		User user = new User();
		user.setUserEmail("mail@mail.com");
		user.setUserName("userName");
		
		User user2 = new User();
		user2.setUserEmail("mail2@mail.com");
		user2.setUserName("userName2");
		
		User user3 = new User();
		user3.setUserEmail("mail3@mail.com");
		user3.setUserName("userName3");
		
		this.userList.add(user);
		this.userList.add(user2);
		this.userList.add(user3);
	}

	@Test
	public void executeTest() {
		// Arrange
		UsersRepository usersRepository = Mockito.mock(UsersRepository.class);
		ArgumentCaptor<Integer> fromCaptor = ArgumentCaptor.forClass(Integer.class);
		ArgumentCaptor<Integer> rowsCaptor = ArgumentCaptor.forClass(Integer.class);
		ArgumentCaptor<String> orderByCaptor = ArgumentCaptor.forClass(String.class);
		ArgumentCaptor<Boolean> orderAscCaptor = ArgumentCaptor.forClass(Boolean.class);
		Mockito.when(usersRepository.getUserList(
					fromCaptor.capture(),
					rowsCaptor.capture(),
					orderByCaptor.capture(),
					orderAscCaptor.capture())).thenReturn(this.userList);
		Mockito.when(usersRepository.getUserCount()).thenReturn(RECORDS);
		UserListJSON userListJSON = new UserListJSON();
		userListJSON.setUsersRepository(usersRepository);
		userListJSON.setRows(ROWS);
		userListJSON.setPage(PAGE);
		userListJSON.setSord(SORD);
		userListJSON.setSidx(SIDX);
		int from = (ROWS * PAGE) - ROWS;
		int total = RECORDS / ROWS;
		
		// Act
		userListJSON.execute();
		
		// Assert
		assertNotNull(userListJSON.getGridModel());
		assertArrayEquals(this.userList.toArray(), userListJSON.getGridModel().toArray());
		assertTrue(orderAscCaptor.getValue());
		assertEquals(SORD, orderByCaptor.getValue());
		assertEquals(from, fromCaptor.getValue().intValue());
		assertEquals(ROWS, rowsCaptor.getValue().intValue());
		assertEquals(total, userListJSON.getTotal());
	}

	@Test
	public void totalTest() {
		// Arrange
		int expected = RECORDS / ROWS;
		UserListJSON userListJSON = new UserListJSON();
		userListJSON.setRecords(RECORDS);
		userListJSON.setRows(ROWS);

		// Act
		int actual = userListJSON.getTotal();

		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void totalWhitCeroRowsTest() {
		// Arrange
		int expected = 0;
		UserListJSON userListJSON = new UserListJSON();
		userListJSON.setRecords(RECORDS);
		userListJSON.setRows(0);

		// Act
		int actual = userListJSON.getTotal();

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void sidxTest() {
		// Arrange
		UserListJSON userListJSON = new UserListJSON();
		userListJSON.setSidx(SIDX);

		// Act
		String actual = userListJSON.getSidx();

		// Assert
		assertEquals(SIDX, actual);
	}

	@Test
	public void sordTest() {
		// Arrange
		UserListJSON userListJSON = new UserListJSON();
		userListJSON.setSord(SORD);

		// Act
		String actual = userListJSON.getSord();

		// Assert
		assertEquals(SORD, actual);
	}

	@Test
	public void pageTest() {
		// Arrange
		UserListJSON userListJSON = new UserListJSON();
		userListJSON.setPage(PAGE);

		// Act
		int actual = userListJSON.getPage();

		// Assert
		assertEquals(PAGE, actual);
	}

	@Test
	public void testGridModel() {
		// Arrange
		UserListJSON userListJSON = new UserListJSON();
		userListJSON.setGridModel(this.userList);

		// Act
		List<User> gridModel = userListJSON.getGridModel();

		// Assert
		assertArrayEquals(this.userList.toArray(), gridModel.toArray());
	}

	@Test
	public void rowsTest() {
		// Arrange
		UserListJSON userListJSON = new UserListJSON();
		userListJSON.setRows(ROWS);

		// Act
		int actual = userListJSON.getRows();

		// Assert
		assertEquals(ROWS, actual);
	}

}
