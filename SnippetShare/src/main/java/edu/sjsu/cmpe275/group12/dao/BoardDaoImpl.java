package edu.sjsu.cmpe275.group12.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;

import edu.sjsu.cmpe275.group12.model.BoardVO;

public class BoardDaoImpl implements BoardDao{
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
		public void createBoard(BoardVO board) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void updateBoard(BoardVO board) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public BoardVO getBoardById(long boardId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<BoardVO> getBoardsByAccessType(char accessType) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<BoardVO> getBoardsByCategory(String category) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<BoardVO> getBoardsByTitle(String title) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void deleteBoardById(long boardId) {
			// TODO Auto-generated method stub
			
		}
}
