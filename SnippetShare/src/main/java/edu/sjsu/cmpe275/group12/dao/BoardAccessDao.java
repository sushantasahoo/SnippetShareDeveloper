package edu.sjsu.cmpe275.group12.dao;

import edu.sjsu.cmpe275.group12.model.BoardAccessVO;

public interface BoardAccessDao {

	public void createBoardAccess(BoardAccessVO user);
	public void updateBoardAccess(BoardAccessVO user);
	public BoardAccessVO getBoardAccess(long boardId, String email);
	public void deleteBoardAccess(long boardId, String email);
}
