package edu.sjsu.cmpe275.group12.dao;

import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;

import edu.sjsu.cmpe275.group12.model.BoardVO;
import edu.sjsu.cmpe275.group12.model.UserVO;

public class BoardDaoImpl implements BoardDao{
	//protected SessionFactory sessionFactory;
	private JdbcTemplate jdbcTemplateObject;



	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	private Log log = LogFactory.getLog(this.getClass());


	@Override
	public void createBoard(BoardVO board) {
		String SQL = "INSERT INTO `snippet`.`board`(`title`,`category`,`user_id`,`description`,`access_type`) VALUES(?,?,?,?,?);";
		try{
			jdbcTemplateObject.update(SQL, board.getTitle(), board.getCategory(), board.getUserId(), board.getDescription(), board.getAccessType());
		}
		catch(DuplicateKeyException ex){
			return;
		}
		return;
	}

	@Override
	public void updateBoard(BoardVO board) {
		String SQL = "UPDATE `snippet`.`board` SET `title` = ?,`category` = ?,`user_id` = ?,`description` = ?,`access_type` = ? WHERE `board_id` = ?;";
		jdbcTemplateObject.update(SQL, board.getTitle(), board.getUserId(), board.getDescription(), board.getAccessType(), board.getUserId());
		return;

	}

	@Override
	public BoardVO getBoardbyId(int boardId) {
		String SQL = "SELECT * from `snippet`.board` WHERE `board_id` = ?";
		List<BoardVO> board =  jdbcTemplateObject.query(SQL, 
				new Object[]{boardId}, new BoardMapper());

		if(board!=null && board.size()>0){
			return board.get(0);
		}
		else 
			return null;
	}

	@Override
	public List<BoardVO> getBoardsByAccessType(char accessType) {
		String SQL = "SELECT * from `snippet`.board` WHERE `access_type` = ?";
		List<BoardVO> board =  jdbcTemplateObject.query(SQL, 
				new Object[]{accessType}, new BoardMapper());

		if(board!=null && board.size()>0){
			return board;
		}
		else 
			return null;
	}

	@Override
	public List<BoardVO> getBoardsByCategory(String category) {
		String SQL = "SELECT * from `snippet`.board` WHERE `category` = ?";
		List<BoardVO> board =  jdbcTemplateObject.query(SQL, 
				new Object[]{category}, new BoardMapper());

		if(board!=null && board.size()>0){
			return board;
		}
		else 
			return null;
	}

	@Override
	public List<BoardVO> getBoardsByTitle(String title) {
		String SQL = "SELECT * from `snippet`.board` WHERE `title` = ?";
		List<BoardVO> board =  jdbcTemplateObject.query(SQL, 
				new Object[]{title}, new BoardMapper());

		if(board!=null && board.size()>0){
			return board;
		}
		else 
			return null;
	}


	@Override
	public void deleteBoardById(int boardId) {
		String SQL = "DELETE FROM `snippet`.`board` WHERE board_id = ? ;";
		Object[] param_boardId = { boardId };
		int[] types = {Types.INTEGER};
		int rows = jdbcTemplateObject.update(SQL, param_boardId, types);
		System.out.println(rows + " row(s) deleted.");
	}

	@Override
	public List<BoardVO> getBoardByUserId(int userId) {
		String SQL = "SELECT * from `snippet`.board` WHERE `user_id` = ?";
		List<BoardVO> board =  jdbcTemplateObject.query(SQL, 
				new Object[]{userId}, new BoardMapper());

		if(board!=null && board.size()>0){
			return board;
		}
		else 
			return null;
	}
}
