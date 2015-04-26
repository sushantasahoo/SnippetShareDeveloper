package edu.sjsu.cmpe275.group12.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.sjsu.cmpe275.group12.model.SnippetVO;

public class SnippetDaoImpl implements SnippetDao{
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
		public void createSnippet(SnippetVO snippet) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void updateSnippet(SnippetVO snippet) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public SnippetVO getSnippet(long snippetId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void deleteSnippet(long snippetId) {
			// TODO Auto-generated method stub
			
		}

}
