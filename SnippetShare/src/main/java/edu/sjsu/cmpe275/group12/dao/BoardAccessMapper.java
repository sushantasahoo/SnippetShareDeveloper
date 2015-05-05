package edu.sjsu.cmpe275.group12.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import edu.sjsu.cmpe275.group12.model.BoardAccessVO;
import edu.sjsu.cmpe275.group12.model.BoardVO;

public class BoardAccessMapper implements RowMapper<BoardAccessVO> {

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public BoardAccessVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		BoardAccessVO board = new BoardAccessVO();
		board.setBoardAccessId(rs.getInt("board_access_id"));
		board.setBoardId(rs.getInt("board_id"));
		board.setUserId(rs.getInt("user_id"));
		board.setAccessStatus(rs.getString("access_status"));
	    return board;
	}

}