package edu.sjsu.cmpe275.group12.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import edu.sjsu.cmpe275.group12.model.BoardVO;

public class BoardMapper implements RowMapper<BoardVO> {

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		BoardVO board = new BoardVO();
		board.setBoardId(rs.getInt("board_id"));
		board.setTitle(rs.getString("title"));
		board.setCategory(rs.getString("category"));
	//	board.setUserId(rs.getInt("user_id"));
		board.setDescription(rs.getString("description"));
	//	board.setAccessType(rs.getString("access_type"));
	    return board;
	}

}