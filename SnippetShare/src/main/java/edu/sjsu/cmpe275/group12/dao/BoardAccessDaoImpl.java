package edu.sjsu.cmpe275.group12.dao;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.sjsu.cmpe275.group12.model.BoardAccessVO;
@Repository
@Transactional
public class BoardAccessDaoImpl implements BoardAccessDao{

	//protected SessionFactory sessionFactory;
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;



	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */

	private Log log = LogFactory.getLog(this.getClass());


	@Override
	public void createBoardAccess(BoardAccessVO user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBoardAccess(BoardAccessVO user) {
		// TODO Auto-generated method stub

	}

	@Override
	public BoardAccessVO getBoardAccess(long boardId, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBoardAccess(long boardId, String email) {
		// TODO Auto-generated method stub

	}


}
