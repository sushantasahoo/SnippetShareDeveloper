package edu.sjsu.cmpe275.group12.dao;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;

import edu.sjsu.cmpe275.group12.model.UserVO;

public class UserDaoImpl implements UserDao{
		//protected SessionFactory sessionFactory;
		protected HibernateTemplate template;
		// protected SessionFactory sessionFactory;
		private DataSource dataSource;
		private JdbcTemplate jdbcTemplateObject;


		/**
		 * Setting Hibernate session factory
		 */


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
		public void createUser(UserVO user) {
	//		template.save(user);
			String SQL = "insert into User (user_id, first_name, last_name, email, mobile_number, password) values (?, ?, ?, ?, ?, ?)";

			jdbcTemplateObject.update(SQL, user.getUserId(),
					user.getFirstname(), user.getLastname(), user.getEmail(), user.getMobileNumber(), user.getPassword());
			System.out.println("Created Record Name = " + user.getEmail()
					+ " Age = " + user.getLastname());
			return;
			
		}

		@Override
		public void updateUser(UserVO user) {
			
		}

		@Override
		public UserVO getUser(String email) {
			return null;
		}

		@Override
		public void deleteUser(String email) {
			// TODO Auto-generated method stub
			
		}
		
	
		
		
}
