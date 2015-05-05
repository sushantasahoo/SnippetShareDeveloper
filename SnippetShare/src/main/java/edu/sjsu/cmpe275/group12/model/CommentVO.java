package edu.sjsu.cmpe275.group12.model;


public class CommentVO {

	private int commentId;
	
	private int snippetId;

	private String comment;

	private int userId;


	/**
	 * @return the commentId
	 */
	public int getCommentId() {
		return commentId;
	}


	/**
	 * @param commentId the commentId to set
	 */
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	
	
	/**
	 * @return the snippetId
	 */
	public int getSnippetId() {
		return snippetId;
	}


	/**
	 * @param snippetId the snippetId to set
	 */
	public void setSnippetId(int snippetId) {
		this.snippetId = snippetId;
	}


	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}


	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}


	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}


	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}



}
