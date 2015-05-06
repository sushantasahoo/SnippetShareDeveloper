package edu.sjsu.cmpe275.group12.dao;

import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;

import edu.sjsu.cmpe275.group12.model.BoardAccessVO;
import edu.sjsu.cmpe275.group12.model.BoardVO;

public class BoardAccessDaoImpl implements BoardAccessDao {

	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */

	private Log log = LogFactory.getLog(this.getClass());

	@Override
	public boolean createBoardAccess(BoardAccessVO bAccess) {
		String SQL = "INSERT INTO `snippet`.`board_access`(`board_id`,`user_id`,`access_status`) VALUES(?,?,?)";
		try {
			jdbcTemplateObject.update(SQL, bAccess.getBoardId(),
					bAccess.getUserId(), bAccess.getAccessStatus());
			return true;
		} catch (DuplicateKeyException ex) {
			return false;
		}

	}

	@Override
	public void updateBoardAccess(int requestId, int userId,
			String approvalStatus) {
		String SQL = "UPDATE `snippet`.`board_access` SET `access_status` = ? WHERE `board_access_id` = ?, user_id= ?;";
		jdbcTemplateObject.update(SQL, approvalStatus, requestId, userId );
	}

	@Override
	public BoardAccessVO getBoardAccess(int boardId, int userId) {
		String SQL = "SELECT * from `snippet`.board_access` WHERE `board_id` = ? AND user_id= ?";
		List<BoardAccessVO> boardAccess = jdbcTemplateObject.query(SQL,
				new Object[] { boardId, userId }, new BoardAccessMapper());

		if (boardAccess != null && boardAccess.size() > 0) {
			return boardAccess.get(0);
		} else
			return null;
	}

	@Override
	public void deleteBoardAccess(int boardId, int userId) {
		String SQL = "DELETE FROM `snippet`.`board_access` WHERE board_id = ? AND user_id=? ;";
		Object[] params = { boardId, userId };
		int[] types = { Types.INTEGER };
		int rows = jdbcTemplateObject.update(SQL, params, types);
		System.out.println(rows + " row(s) deleted.");
	}

	@Override
	public List<BoardAccessVO> getBoardAccessRequest(int boardId) {
		// P denotes pending requests for particular boardId
		String SQL = "SELECT * from `snippet`.board_access` WHERE `board_id` = ? AND `access_status` = 'P'";
		List<BoardAccessVO> boardAccessRequest = jdbcTemplateObject.query(SQL,
				new Object[] { boardId }, new BoardAccessMapper());

		if (boardAccessRequest != null && boardAccessRequest.size() > 0) {
			return boardAccessRequest;
		} else
			return null;
	}

	@Override
	public List<BoardVO> getBordAccessByUser(int userId) {
		// P denotes pending requests for particular boardId
		System.out.println("User id " + userId);
		String SQL = "SELECT board.title, board.description, board.category, board.board_id FROM snippet.board, snippet.board_access  where board.board_id = board_access.board_id and board_access.access_status='A' and board_access.user_id= ?  ";
		List<BoardVO> boardAccessRequest = jdbcTemplateObject.query(SQL,
				new Object[] { userId }, new BoardMapper());

		System.out
				.println("boardAccessRequest -- " + boardAccessRequest.size());
		if (boardAccessRequest != null && boardAccessRequest.size() > 0) {
			return boardAccessRequest;
		} else
			return null;
	}

	public List<BoardVO> getBoardApprovalLis(int userId) {
		System.out.println("User id " + userId);
		String SQL = "SELECT  board.title, board.description, board.board_id, board_access.user_id, board_access.board_access_id FROM snippet.board, snippet.board_access  where board.board_id = board_access.board_id and board_access.access_status='P' and board.user_id= ?";
		List<BoardVO> approvalList = jdbcTemplateObject.query(SQL,
				new Object[] { userId }, new ApprovalListMapper());
		System.out.println("boardAccessRequest -- " + approvalList.size());
		if (approvalList != null && approvalList.size() > 0) {
			return approvalList;
		} else
			return null;

	}
}
