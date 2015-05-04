package edu.sjsu.cmpe275.group12.dao;

import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;





import edu.sjsu.cmpe275.group12.model.AddressVO;
import edu.sjsu.cmpe275.group12.model.UserVO;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{

		private Log log = LogFactory.getLog(this.getClass());

		/**
		 * Setting Hibernate session factory
		 */
		
		 protected HibernateTemplate template;

			/**
			 * Sets the HibernateTemplate
			 * @param sessionFactory
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
		public UserVO getUser(String email, String password) {
			return null;
		}

		@Override
		@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
		public void deleteUser(String email) {
			// TODO Auto-generated method stub
			
		}
		
}
