package edu.sjsu.cmpe275.group12.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.sjsu.cmpe275.group12.dao.UserDaoImpl;
import edu.sjsu.cmpe275.group12.model.UserVO;

public class UserService {
	
	 ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      UserDaoImpl userDao = 
      (UserDaoImpl)context.getBean("userDaoImpl");
	
	public boolean createUser(UserVO user){
		if(user.getEmail()!=null && !user.getEmail().equals("")&&
				user.getFirstname()!=null && !user.getFirstname().equals("") &&
					user.getPassword()!=null && !user.getPassword().equals("")){		
			if(userDao.createUser(user))
				return true;
			else
				return false;
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
