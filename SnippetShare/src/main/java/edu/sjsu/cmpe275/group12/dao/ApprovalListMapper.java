package edu.sjsu.cmpe275.group12.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.sjsu.cmpe275.group12.model.BoardVO;

public class ApprovalListMapper implements RowMapper<BoardVO> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet,
	 * int)
	 */
	@Override
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("iiiiiiiiiiiiiiii "+rs.getInt("user_id"));
		BoardVO board = new BoardVO();
		board.setBoardId(rs.getInt("board_id"));
		board.setTitle(rs.getString("title"));
		board.setUserId(rs.getInt("user_id"));
		board.setDescription(rs.getString("description"));
		board.setRequestId(rs.getInt("board_access_id"));
		System.out.println(">>>>>>>> "+board.getRequestId());
		
		return board;
	}

}
