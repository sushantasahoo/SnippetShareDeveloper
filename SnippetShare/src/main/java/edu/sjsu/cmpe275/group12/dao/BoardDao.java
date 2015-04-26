package edu.sjsu.cmpe275.group12.dao;

import java.util.List;

import edu.sjsu.cmpe275.group12.model.BoardVO;

public interface BoardDao {
	
	public void createBoard(BoardVO board);
	public void updateBoard(BoardVO board);
	public BoardVO getBoardById(long boardId);
	public List<BoardVO> getBoardsByAccessType(char accessType);
	public List<BoardVO> getBoardsByCategory(String category);
	public List<BoardVO> getBoardsByTitle(String title);
	public void deleteBoardById(long boardId);
}
