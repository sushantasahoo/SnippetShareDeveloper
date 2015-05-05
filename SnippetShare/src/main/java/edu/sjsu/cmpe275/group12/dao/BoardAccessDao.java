package edu.sjsu.cmpe275.group12.dao;

import edu.sjsu.cmpe275.group12.model.BoardAccessVO;

public interface BoardAccessDao {

	public boolean createBoardAccess(BoardAccessVO bAccess);
	public void updateBoardAccess(BoardAccessVO bAccess);
	public BoardAccessVO getBoardAccess(int boardId, int userId);
	public void deleteBoardAccess(int boardId, int userId);
	
}
