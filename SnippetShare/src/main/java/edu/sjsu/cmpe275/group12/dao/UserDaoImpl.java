package edu.sjsu.cmpe275.group12.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.sjsu.cmpe275.group12.model.UserVO;

public class UserDaoImpl implements UserDao{
		protected SessionFactory sessionFactory;
		protected HibernateTemplate template;

		private Log log = LogFactory.getLog(this.getClass());

		/**
		 * Setting Hibernate session factory
		 */
		public void setSessionFactory(SessionFactory sessionFactory) {
			template = new HibernateTemplate(sessionFactory);
		}

		@Override
		@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
		public void createUser(UserVO user) {
			template.save(user);
			
		}

		@Override
		@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
		public void updateUser(UserVO user) {
			
		}

		@Override
		@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
		public UserVO getUser(String email) {
			return null;
		}

		@Override
		@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
		public void deleteUser(String email) {
			// TODO Auto-generated method stub
			
		}
		
	/*	@Override
		@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
		public void createUser(UserVO user) {	
				template.save(user);
		}*/
		
		
}
