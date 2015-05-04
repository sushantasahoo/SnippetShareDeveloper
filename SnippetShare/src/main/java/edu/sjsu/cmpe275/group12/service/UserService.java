package edu.sjsu.cmpe275.group12.service;

import edu.sjsu.cmpe275.group12.dao.UserDaoImpl;
import edu.sjsu.cmpe275.group12.model.UserVO;

public class UserService {
	
	private UserDaoImpl userDao=new UserDaoImpl();
	
	public boolean createUser(UserVO user){
		if(user.getEmail()!=null && !user.getEmail().equals("")&&
				user.getFirstname()!=null && !user.getFirstname().equals("") &&
					user.getPassword()!=null && !user.getPassword().equals("")){
			
			userDao.createUser(user);
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public UserVO getUser(String email, String password){
		if( !email.equals("") && email != null ){
				return userDao.getUser(email, password);
		}
		
		else{
			return null;
		}		
	}

}
