package edu.sjsu.cmpe275.group12.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.sjsu.cmpe275.group12.model.CommentVO;

public class CommentsMapper implements RowMapper<CommentVO> {
	public CommentVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		CommentVO commentVO = new CommentVO();
		commentVO.setComment(rs.getString("comment"));
	
		commentVO.setCommentId(rs.getInt("comment_id"));
		return commentVO;
	}
}