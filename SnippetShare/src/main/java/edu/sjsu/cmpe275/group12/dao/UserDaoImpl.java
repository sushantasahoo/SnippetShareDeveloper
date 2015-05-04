package edu.sjsu.cmpe275.group12.dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;

import edu.sjsu.cmpe275.group12.model.UserVO;

public class UserDaoImpl implements UserDao{
	//protected SessionFactory sessionFactory;
	protected HibernateTemplate template;
	// protected SessionFactory sessionFactory;
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;



	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	private Log log = LogFactory.getLog(this.getClass());

	/**
	 * Setting Hibernate session factory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		template = new HibernateTemplate(sessionFactory);
	}

	@Override
	public boolean createUser(UserVO user) {
		//		template.save(user);
		String SQL = "insert into User (user_id, first_name, last_name, email, mobile_number, password) values (?, ?, ?, ?, ?, ?)";

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


	}

	@Override
	public UserVO getUser(String email, String password) {
		String SQL = "SELECT * FROM snippet.user WHERE email = ? AND password = ?";		 
		List<UserVO> user =  jdbcTemplateObject.query(SQL, 
				new Object[]{email, password}, new UserMapper());
		 
		for (UserVO record : user) {
	         System.out.print("ID : " + record.getFirstname() );
	         System.out.print(", Name : " + record.getEmail() );
	         System.out.println(", Age : " );
	      }
		
		if(user!=null && user.size()>0){
			return user.get(0);
		}
		else 
			return null;
	}

	@Override
	public void deleteUser(String email) {
		// TODO Auto-generated method stub

	}




}
