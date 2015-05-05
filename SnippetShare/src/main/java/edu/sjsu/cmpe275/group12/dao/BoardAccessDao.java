package edu.sjsu.cmpe275.group12.dao;

import edu.sjsu.cmpe275.group12.model.BoardAccessVO;

public interface BoardAccessDao {

	public void createBoardAccess(BoardAccessVO user);
	public void updateBoardAccess(BoardAccessVO user);
	public BoardAccessVO getBoardAccess(int boardId, int userId);
	public void deleteBoardAccess(int boardId, int userId);
}
