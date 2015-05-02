package edu.sjsu.cmpe275.group12.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;

import edu.sjsu.cmpe275.group12.model.CommentVO;

public class CommentDaoImpl implements CommentDao{
		//protected SessionFactory sessionFactory;
		protected HibernateTemplate template;

		private Log log = LogFactory.getLog(this.getClass());

		/**
		 * Setting Hibernate session factory
		 */
		public void setSessionFactory(SessionFactory sessionFactory) {
			template = new HibernateTemplate(sessionFactory);
		}

		@Override
		public void createComment(CommentVO comment) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public List<CommentVO> getComment(long snippetId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void deleteComment(long commentId) {
			// TODO Auto-generated method stub
			
		}
		
		
	
}
