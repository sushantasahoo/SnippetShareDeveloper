package edu.sjsu.cmpe275.group12.dao;

import javax.sql.DataSource;

import edu.sjsu.cmpe275.group12.model.AddressVO;
import edu.sjsu.cmpe275.group12.model.UserVO;

public interface UserDao {
	public boolean createUser(UserVO user);
	public void updateUser(UserVO user);
	public UserVO getUser(String email, String password);
	public void deleteUser(int userId);
	public UserVO getUserById(int userId);
}
