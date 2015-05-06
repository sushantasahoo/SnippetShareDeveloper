package edu.sjsu.cmpe275.group12.dao;

import java.util.List;

import edu.sjsu.cmpe275.group12.model.BoardAccessVO;
import edu.sjsu.cmpe275.group12.model.BoardVO;

public interface BoardAccessDao {

	public boolean createBoardAccess(BoardAccessVO bAccess);
	public void updateBoardAccess(int requestId, int userId, String approvalStatus);
	public BoardAccessVO getBoardAccess(int boardId, int userId);
	public void deleteBoardAccess(int boardId, int userId);
	public List<BoardAccessVO> getBoardAccessRequest(int boardId);
	public List<BoardVO> getBordAccessByUser(int userId);
	public List<BoardVO> getBoardApprovalLis(int userId);
	
}
