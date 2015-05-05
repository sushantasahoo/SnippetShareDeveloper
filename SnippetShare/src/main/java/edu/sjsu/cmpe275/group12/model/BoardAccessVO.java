package edu.sjsu.cmpe275.group12.model;

import java.io.Serializable;


public class BoardAccessVO implements Serializable {

	private static final long serialVersionUID = 2L;

	private int boardAccessId;
	
	private int boardId;

	private int userId;

	private String accessStatus;

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

	/**
	 * @return the accessStatus
	 */
	public String getAccessStatus() {
		return accessStatus;
	}

	/**
	 * @param accessStatus the accessStatus to set
	 */
	public void setAccessStatus(String accessStatus) {
		this.accessStatus = accessStatus;
	}

	/**
	 * @return the boardAccessId
	 */
	public int getBoardAccessId() {
		return boardAccessId;
	}

	/**
	 * @param boardAccessId the boardAccessId to set
	 */
	public void setBoardAccessId(int boardAccessId) {
		this.boardAccessId = boardAccessId;
	}

	

}
