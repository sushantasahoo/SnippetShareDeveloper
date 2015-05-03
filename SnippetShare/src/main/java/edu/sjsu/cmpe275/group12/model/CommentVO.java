package edu.sjsu.cmpe275.group12.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COMMENT")
public class CommentVO {

	@Column(name = "COMMENTID", nullable = false)
	private long commentId;
	
	@Column(name = "SNIPPETID", nullable = false)
	private long snippetId;

	@Column(name = "COMMENT", nullable = false)
	private String comment;


	@Column(name = "COMMENTEDBY", nullable = false)
	private String userId;


	/**
	 * @return the commentId
	 */
	public long getCommentId() {
		return commentId;
	}


	/**
	 * @param commentId the commentId to set
	 */
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}
	
	
	/**
	 * @return the snippetId
	 */
	public long getSnippetId() {
		return snippetId;
	}


	/**
	 * @param snippetId the snippetId to set
	 */
	public void setSnippetId(long snippetId) {
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
	public String getUserId() {
		return userId;
	}


	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}



}
