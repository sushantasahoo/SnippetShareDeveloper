package edu.sjsu.cmpe275.group12.dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;

import edu.sjsu.cmpe275.group12.model.BoardVO;

public class BoardDaoImpl implements BoardDao{
	//protected SessionFactory sessionFactory;
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;



	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	private Log log = LogFactory.getLog(this.getClass());


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
