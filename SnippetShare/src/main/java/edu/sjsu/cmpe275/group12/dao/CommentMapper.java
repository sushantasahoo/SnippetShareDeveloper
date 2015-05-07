package edu.sjsu.cmpe275.group12.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import edu.sjsu.cmpe275.group12.model.CommentVO;


public class CommentMapper implements RowMapper<CommentVO> {

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public CommentVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		CommentVO comment = new CommentVO();
		comment.setCommentId(rs.getInt("comment_id"));
		comment.setSnippetId(rs.getInt("snippet_id"));
		comment.setComment(rs.getString("comment"));
		comment.setUserId(rs.getInt("user_id"));
		comment.setUserName(rs.getString("first_name"));
	    return comment;
	}

}
