package edu.sjsu.cmpe275.group12.dao;

import java.sql.Types;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.dao.DuplicateKeyException;
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
	public void createBoardAccess(BoardAccessVO bAccess) {
		String SQL = "INSERT INTO `snippet`.`board_access`(`board_access_id`,`board_id`,`user_id`,`access_status`) VALUES(?,?,?,?)";
		try{
			jdbcTemplateObject.update(SQL, bAccess.getBoardAccessId(), bAccess.getBoardId(), bAccess.getUserId(), bAccess.getAccessStatus());
		}
		catch(DuplicateKeyException ex){
			return;
		}
		return;
	}

	@Override
	public void updateBoardAccess(BoardAccessVO user) {
		// TODO Auto-generated method stub

	}

	@Override
	public BoardAccessVO getBoardAccess(int boardId, int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBoardAccess(int boardId, int userId) {
		String SQL = "DELETE FROM `snippet`.`board_access` WHERE board_id = ? AND user_id=? ;";
		Object[] params = { boardId, userId };
		int[] types = {Types.INTEGER};
		int rows = jdbcTemplateObject.update(SQL, params, types);
		System.out.println(rows + " row(s) deleted.");
	}


}
