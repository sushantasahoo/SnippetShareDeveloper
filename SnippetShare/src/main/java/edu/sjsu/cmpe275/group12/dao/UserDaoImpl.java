package edu.sjsu.cmpe275.group12.dao;

import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;

import edu.sjsu.cmpe275.group12.model.UserVO;

public class UserDaoImpl implements UserDao{

	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	private Log log = LogFactory.getLog(this.getClass());

	@Override
	public boolean createUser(UserVO user) {
		String SQL = "insert into `snippet`.`user` (user_id, first_name, last_name, email, mobile_number, password) values (?, ?, ?, ?, ?, ?)";
		try{
		jdbcTemplateObject.update(SQL, user.getUserId(),
				user.getFirstname(), user.getLastname(), user.getEmail(), user.getMobileNumber(), user.getPassword());
		
		}
		catch(DuplicateKeyException ex){
			return false;
		}
		return true;
	}

	@Override
	public void updateUser(UserVO user) {
		String SQL = "UPDATE `snippet`.`user` SET `user_id` = ?, `first_name` = ?, `last_name` = ?, `email` = ?, `mobile_number` = ?, `password` = ?, `street` = ?, `city` = ?, `state` = ?, `zip` =? WHERE `user_id` =?;";
		jdbcTemplateObject.update(SQL, user.getUserId(),
				user.getFirstname(), user.getLastname(), user.getEmail(), user.getMobileNumber(), user.getPassword(),
					user.getAddress().getStreet(), user.getAddress().getCity(), user.getAddress().getState(), user.getAddress().getZip(),
						user.getUserId());
			return;
		
	}

	@Override
	public UserVO getUser(String email, String password) {
		String SQL = "SELECT * FROM `snippet`.`user` WHERE email = ? AND password = ?";		 
		List<UserVO> user =  jdbcTemplateObject.query(SQL, 
				new Object[]{email, password}, new UserMapper());
		 
		if(user!=null && user.size()>0){
			return user.get(0);
		}
		else 
			return null;
	}

	@Override
	public void deleteUser(int userId) {
		String SQL = "DELETE FROM `snippet`.`user` WHERE user_id = ? ;";
		Object[] param_userId = { userId };
		int[] types = {Types.INTEGER};
		int rows = jdbcTemplateObject.update(SQL, param_userId, types);
		System.out.println(rows + " row(s) deleted.");
	}

	@Override
	public UserVO getUserById(int userId) {
		String SQL = "SELECT * FROM `snippet`.`user` WHERE user_id = ?";		 
		List<UserVO> user =  jdbcTemplateObject.query(SQL, 
				new Object[]{userId}, new UserMapper());
		 
		if(user!=null && user.size()>0){
			return user.get(0);
		}
		else 
			return null;
	}
}
