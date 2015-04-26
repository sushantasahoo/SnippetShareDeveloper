package edu.sjsu.cmpe275.group12.dao;

import edu.sjsu.cmpe275.group12.model.BoardAccessVO;

public interface BoardAccessDao {

	public void createBoardAccess(BoardAccessVO user);
	public void updateBoardAccess(BoardAccessVO user);
	public BoardAccessVO getBoardAccess(String boardId, String email);
	public void deleteBoardAccess(String boardId, String email);
}
