package edu.sjsu.cmpe275.group12.model;

import java.io.Serializable;

import javax.persistence.Column;

public class BoardAccessVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	@Column(name = "BOARDID")
	private long boardId;

	@Column(name = "USERID", nullable = false)
	private String userId;

	@Column(name = "ACCESSSTATUS", nullable = false)
	private char accessStatus;

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

	/**
	 * @return the accessStatus
	 */
	public char getAccessStatus() {
		return accessStatus;
	}

	/**
	 * @param accessStatus the accessStatus to set
	 */
	public void setAccessStatus(char accessStatus) {
		this.accessStatus = accessStatus;
	}

	

}
