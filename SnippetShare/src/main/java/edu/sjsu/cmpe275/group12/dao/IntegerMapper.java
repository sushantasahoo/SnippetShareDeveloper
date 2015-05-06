package edu.sjsu.cmpe275.group12.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import edu.sjsu.cmpe275.group12.model.BoardVO;

public class IntegerMapper  implements RowMapper<BoardVO> {

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		BoardVO board = new BoardVO();
		board.setBoardId(rs.getInt("board_id"));
	    return board;
	}

}
