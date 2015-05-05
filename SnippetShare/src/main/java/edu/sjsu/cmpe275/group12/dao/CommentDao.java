package edu.sjsu.cmpe275.group12.dao;

import java.util.List;

import edu.sjsu.cmpe275.group12.model.CommentVO;

public interface CommentDao {
	public void createComment(CommentVO comment);
	public List<CommentVO> getComment(int snippetId);
	public void deleteComment(int commentId);
}
