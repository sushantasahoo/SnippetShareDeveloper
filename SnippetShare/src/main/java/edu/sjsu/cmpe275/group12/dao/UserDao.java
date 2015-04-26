package edu.sjsu.cmpe275.group12.dao;

import edu.sjsu.cmpe275.group12.model.UserVO;

public interface UserDao {
	public void createUser(UserVO user);
	public void updateUser(UserVO user);
	public UserVO getUser(String email);
	public void deleteUser(String email);
}
