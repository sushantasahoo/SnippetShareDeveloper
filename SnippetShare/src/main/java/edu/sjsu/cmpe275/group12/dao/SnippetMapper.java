package edu.sjsu.cmpe275.group12.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import edu.sjsu.cmpe275.group12.model.BoardAccessVO;
import edu.sjsu.cmpe275.group12.model.SnippetVO;

public class SnippetMapper implements RowMapper<SnippetVO> {

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public SnippetVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		SnippetVO snippet = new SnippetVO();
		snippet.setSnippetId(rs.getInt("snippet_id"));
		snippet.setBoardId(rs.getInt("board_id"));
		snippet.setTitle(rs.getString("title"));
		snippet.setTags(rs.getString("tags"));
		snippet.setContent(rs.getString("content"));
		snippet.setUserId(rs.getInt("user_id"));
	    return snippet;
	}

}
