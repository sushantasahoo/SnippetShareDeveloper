package edu.sjsu.cmpe275.group12.model;

import java.io.Serializable;



public class SnippetVO implements Serializable {

	
	private long snippetId;

	private long boardId;

	private String title;

	private String tags;

	private String content;

	//Owner will be email id of user
	private String owner;
	
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
	 * @return the boardId
	 */
	public long getBoardId() {
		return boardId;
	}

	/**
	 * @param boardId the boardId to set
	 */
	public void setBoardId(long boardId) {
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
	 * @param contentt the contentt to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	
	
}
