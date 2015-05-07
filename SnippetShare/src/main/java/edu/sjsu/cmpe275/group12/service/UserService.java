package edu.sjsu.cmpe275.group12.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.sjsu.cmpe275.group12.dao.UserDao;
import edu.sjsu.cmpe275.group12.dao.UserDaoImpl;
import edu.sjsu.cmpe275.group12.model.UserVO;

public class UserService {

	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	UserDao userDao = (UserDao) context.getBean("userDaoImpl");

	/**
	 * Creates user with and returns sets Created UserId to user Object and
	 * returns success
	 * 
	 * @param user
	 * @return
	 */
	public boolean createUser(UserVO user) {
		if (user.getEmail() != null && !user.getEmail().equals("")
				&& user.getFirstname() != null
				&& !user.getFirstname().equals("")
				&& user.getPassword() != null && !user.getPassword().equals(""))
			if (userDao.createUser(user)) {
				UserVO tempUser = userDao.getUser(user.getEmail(),
						user.getPassword());
				// TODO:: Check to get user id automatically
				user.setUserId(tempUser.getUserId());
				return true;
			}

		return false;

	}

	/**
	 * Returns user details for given email and password If user doesn't exists
	 * returns null else returns userVO object
	 * 
	 * @param email
	 * @param password
	 * @return
	 */

	public UserVO getUser(String email, String password) {
		if (!email.equals("") && email != null) {
			return userDao.getUser(email, password);
		}

		else {
			return null;
		}
	}

	/**
	 * updated User with provided user object
	 * 
	 * @param
	 * @return
	 */
	public boolean updateUser(UserVO user) {
		if (user != null && user.getEmail() != null
				&& !user.getEmail().equals("") && user.getFirstname() != null
				&& !user.getFirstname().equals("")
				&& user.getPassword() != null && !user.getPassword().equals("")) {
			userDao.updateUser(user);
			
			return true;
		}
		return false;
	}

	/**
	 * delete user with given userID and Returns boolean as token of success
	 * 
	 * @param userId
	 * @return
	 */
	public boolean deleteUser(int userId) {
		if (userId != 0) {
			// Check userWith Id in DB if exists delete it and return boolean as
			// success
			UserVO deleteUser = userDao.getUserById(userId);
			if (deleteUser != null) {
				userDao.deleteUser(userId);
				return true;
			}
			return false;
		}
		return false;
	}

}
