package edu.sjsu.cmpe275.group12.dao;

import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import edu.sjsu.cmpe275.group12.model.BoardAccessVO;


public class BoardAccessDaoImpl implements BoardAccessDao{


	private JdbcTemplate jdbcTemplateObject;



	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */

	private Log log = LogFactory.getLog(this.getClass());


	@Override
	public boolean createBoardAccess(BoardAccessVO bAccess) {
		String SQL = "INSERT INTO `snippet`.`board_access`(`board_access_id`,`board_id`,`user_id`,`access_status`) VALUES(?,?,?,?)";
		try{
			jdbcTemplateObject.update(SQL, bAccess.getBoardAccessId(), bAccess.getBoardId(), bAccess.getUserId(), bAccess.getAccessStatus());
			return true;
		}
		catch(DuplicateKeyException ex){
			return false;
		}
		
	}

	@Override
	public void updateBoardAccess(BoardAccessVO bAccess) {
		String SQL = "UPDATE `snippet`.`board_access` SET `board_id` = ? , `user_id` = ?, `access_status` = ? WHERE `board_access_id` = ?;";
		jdbcTemplateObject.update(SQL, bAccess.getBoardId(), bAccess.getUserId(), bAccess.getAccessStatus(), bAccess.getBoardAccessId());
	}

	@Override
	public BoardAccessVO getBoardAccess(int boardId, int userId) {
		String SQL = "SELECT * from `snippet`.board_access` WHERE `board_id` = ? AND user_id= ?";
		List<BoardAccessVO> boardAccess =  jdbcTemplateObject.query(SQL, 
				new Object[]{boardId, userId}, new BoardAccessMapper());

		if(boardAccess!=null && boardAccess.size()>0){
			return boardAccess.get(0);
		}
		else 
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
	
	@Override
	public List<BoardAccessVO> getBoardAccessRequest(int boardId) {
		//P denotes pending requests for particular boardId
		String SQL = "SELECT * from `snippet`.board_access` WHERE `board_id` = ? AND `access_status` = 'P'";
		List<BoardAccessVO> boardAccessRequest =  jdbcTemplateObject.query(SQL, 
				new Object[]{ boardId }, new BoardAccessMapper());

		if(boardAccessRequest!=null && boardAccessRequest.size()>0){
			return boardAccessRequest;
		}
		else 
			return null;
	}


}
