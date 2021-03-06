package edu.sjsu.cmpe275.group12.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.mysql.jdbc.Connection;

import edu.sjsu.cmpe275.group12.model.BoardVO;

public class BoardDaoImpl implements BoardDao {
	// protected SessionFactory sessionFactory;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	private Log log = LogFactory.getLog(this.getClass());

	@Override
	public boolean createBoard(BoardVO board) {
		String SQL = "INSERT INTO `snippet`.`board`(`title`,`category`,`user_id`,`description`,`access_type`) VALUES(?,?,?,?,?)";
		try {
			jdbcTemplateObject.update(SQL, board.getTitle(),
					board.getCategory(), board.getUserId(),
					board.getDescription(), board.getAccessType());
			return true;
		} catch (DuplicateKeyException ex) {
			return false;
		}

	}

	@Override
	public int getLastInsertedBoardId() {
		String SQL = "select last_insert_id()";
		List<BoardVO> boardId = jdbcTemplateObject.query(SQL,
				new IntegerMapper());

		if (boardId != null && boardId.size() > 0) {
			System.out.println(boardId.get(0).getBoardId());
			return boardId.get(0).getBoardId();
		} else
			return 0;
	}

	@Override
	public int getBoardIdByTitle(String title, int id) {
		String SQL = "SELECT * from `snippet`.`board` WHERE `title` = ? AND user_id = ?";
		List<BoardVO> board = jdbcTemplateObject.query(SQL, new Object[] {
				title, id }, new IntegerMapper());

		if (board != null && board.size() > 0) {
			return board.get(0).getBoardId();
		} else
			return 0;
	}

	@Override
	public void updateBoard(BoardVO board) {
		String SQL = "UPDATE `snippet`.`board` SET `title` = ?,`category` = ?,`user_id` = ?,`description` = ?,`access_type` = ? WHERE `board_id` = ?;";
		jdbcTemplateObject.update(SQL, board.getTitle(), board.getUserId(),
				board.getDescription(), board.getAccessType(),
				board.getUserId());
		return;

	}

	@Override
	public BoardVO getBoardbyId(int boardId) {
		String SQL = "SELECT * from `snippet`.board` WHERE `board_id` = ?";
		List<BoardVO> board = jdbcTemplateObject.query(SQL,
				new Object[] { boardId }, new BoardMapper());

		if (board != null && board.size() > 0) {
			return board.get(0);
		} else
			return null;
	}

	@Override
	public List<BoardVO> getBoardsByAccessType(String accessType) {
		String SQL = "SELECT * from `snippet`.`board` WHERE `access_type` = ?";
		System.out.println(accessType);
		List<BoardVO> board = jdbcTemplateObject.query(SQL,
				new Object[] { accessType }, new BoardMapper());

		if (board != null && board.size() > 0) {
			return board;
		} else
			return null;
	}

	@Override
	public List<BoardVO> getBoardsByCategory(String category, String accessType) {
		String SQL = "SELECT * from `snippet`.`board` WHERE `category` = ? AND  `access_type` = ?";
		List<BoardVO> board =  jdbcTemplateObject.query(SQL, 
				new Object[]{category,accessType}, new BoardMapper());

		if(board!=null && board.size()>0){
			return board;
		}
		else 
			return null;
	}

	@Override
	public List<BoardVO> getBoardsByTitle(String title) {
		String SQL = "SELECT * from `snippet`.board` WHERE `title` = ?";
		List<BoardVO> board = jdbcTemplateObject.query(SQL,
				new Object[] { title }, new BoardMapper());

		if (board != null && board.size() > 0) {
			return board;
		} else
			return null;
	}

	@Override
	public void deleteBoardById(int boardId) {
		String SQL = "DELETE FROM `snippet`.`board` WHERE board_id = ? ;";
		Object[] param_boardId = { boardId };
		int[] types = { Types.INTEGER };
		int rows = jdbcTemplateObject.update(SQL, param_boardId, types);
		System.out.println(rows + " row(s) deleted.");
	}

	@Override
	public List<BoardVO> getBoardByUserId(int userId) {
		String SQL = "SELECT * from `snippet`.board` WHERE `user_id` = ?";
		List<BoardVO> board = jdbcTemplateObject.query(SQL,
				new Object[] { userId }, new BoardMapper());

		if (board != null && board.size() > 0) {
			return board;
		} else
			return null;
	}

	@Override
	public List<BoardVO> getAllBoardList() {
		String SQL = "SELECT * from `snippet`.`board`";
		List<BoardVO> board = jdbcTemplateObject.query(SQL, new BoardMapper());

		if (board != null && board.size() > 0) {
			return board;
		} else
			return null;
	}

	@Override
	public List<BoardVO> getBoardNonAccessByUser(int userId) {
		String SQL = "select * from board b where board_id not in (select board_id from board_access where user_id =?) and access_type='R';";
		List<BoardVO> board = jdbcTemplateObject.query(SQL,
				new Object[] { userId }, new BoardMapper());
		if (board != null && board.size() > 0) {
			return board;
		} else
			return null;
	}
}
