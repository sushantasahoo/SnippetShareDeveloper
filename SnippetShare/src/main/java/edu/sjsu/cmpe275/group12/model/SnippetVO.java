package edu.sjsu.cmpe275.group12.model;

import java.io.Serializable;



public class SnippetVO implements Serializable {

	
	private int snippetId;

	private int boardId;

	private String title;

	private String tags;

	private String content;

	private int userId;
	
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
	 * @return the boardId
	 */
	public int getBoardId() {
		return boardId;
	}

	/**
	 * @param boardId the boardId to set
	 */
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the tags
	 */
	public String getTags() {
		return tags;
	}

	/**
	 * @param tags the tags to set
	 */
	public void setTags(String tags) {
		this.tags = tags;
	}

	/**
	 * @return the contentt
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param contentt the content to set
	 */
	public void setContent(String content) {
		this.content = content;
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
