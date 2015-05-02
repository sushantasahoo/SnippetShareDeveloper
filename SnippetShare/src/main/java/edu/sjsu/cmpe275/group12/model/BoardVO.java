package edu.sjsu.cmpe275.group12.model;

import java.io.Serializable;


public class BoardVO implements Serializable {


	private long boardId;

	private String title;

	private String category;

	private String owner;

	private String description;

	private char accessType;

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
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
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

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the accessType
	 */
	public char getAccessType() {
		return accessType;
	}

	/**
	 * @param accessType the accessType to set
	 */
	public void setAccessType(char accessType) {
		this.accessType = accessType;
	}

}
