package edu.sjsu.cmpe275.group12.dao;

import java.util.List;

import edu.sjsu.cmpe275.group12.model.BoardVO;

public interface BoardDao {
	
	public boolean createBoard(BoardVO board);
	public void updateBoard(BoardVO board);
	public BoardVO getBoardbyId(int boardId);
	public List<BoardVO> getBoardByUserId(int userId);
	public List<BoardVO> getBoardsByAccessType(String accessType);
	public List<BoardVO> getBoardsByCategory(String category, String accessType);
	public List<BoardVO> getBoardsByTitle(String title);
	public void deleteBoardById(int boardId);
	public List<BoardVO> getAllBoardList();
	public List<BoardVO> getBoardNonAccessByUser(int userId);
	int getLastInsertedBoardId();
	int getBoardIdByTitle(String title, int id);
}
