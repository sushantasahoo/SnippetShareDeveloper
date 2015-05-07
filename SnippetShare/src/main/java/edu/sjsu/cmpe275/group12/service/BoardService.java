package edu.sjsu.cmpe275.group12.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.sjsu.cmpe275.group12.dao.BoardDao;
import edu.sjsu.cmpe275.group12.model.BoardVO;

public class BoardService {
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	BoardDao boardDao = (BoardDao) context.getBean("boardDaoImpl");

	/**
	 * Creates user with and returns sets Created UserId to user Object and
	 * returns success
	 * 
	 * @param user
	 * @return
	 */
	public boolean createBoard(BoardVO boardVO) {
		if (boardVO.getTitle() != null && !boardVO.getTitle().equals("")
				&& boardVO.getUserId() != 0) {
			boolean isdone = boardDao.createBoard(boardVO);
			int id =getBoardIdByTitle(boardVO.getTitle(), boardVO.getUserId());
			boardVO.setBoardId(id);
			return isdone;
		} else {
			return false;
		}
	}

	public int getBoardIdByTitle(String title, int id){
		if(title!=null){
			return boardDao.getBoardIdByTitle(title, id);
		}
		return 0;
	}
	
	/**
	 * Returns user details for given email and password If user doesn't exists
	 * returns null else returns userVO object
	 * 
	 * @param email
	 * @param password
	 * @return
	 */

	public BoardVO updateBoard(BoardVO boardVO) {
		if (boardVO.getTitle() != null && !boardVO.getTitle().equals("")
				&& boardVO.getBoardId() != 0) {
			boardDao.updateBoard(boardVO);
			return boardVO;
		} else {
			return boardVO;
		}

	}

	/**
	 * User board with provided boardId
	 * 
	 * @param
	 * @return
	 */
	public BoardVO getBoardbyId(int boardId) {
		if(boardId != 0){
			return boardDao.getBoardbyId(boardId); 
		}
		return null;
	}

	/**
	 * Get List of all boards in application, provide userId for authenticity 
	 * @param userid
	 * @return
	 */
	public List<BoardVO> getAllBoardList(int userId){
		if(userId != 0){
			return boardDao.getAllBoardList();
		}
		return null;

	}

	/**
	 * Get All boards of user including private boards
	 * @param userid
	 * @return
	 */
	public List<BoardVO> getBoardByUserId(int userId){
		if(userId != 0){
			return boardDao.getBoardByUserId(userId);
		}
		return null;

	}

	/**
	 * List all boards of user with given access type 
	 * Key-U for public boards and key-R for private boards
	 * @param accessType
	 * @return
	 */
	public List<BoardVO> getBoardByAccessType(String accessType){
		if(accessType.equals("U")||accessType.equals("R")){
			return boardDao.getBoardsByAccessType(accessType);
		}
		return null;
	}
	
	
	/**
	 * List of all boards based on category
	 * @param category
	 * @return
	 */
	public List<BoardVO> getBoardByCategory(String category, String accessType){
		if(!category.equals("")  && category!=null && !accessType.equals("") && accessType!=null){
			return boardDao.getBoardsByCategory(category, accessType);
		}
		return null;
	}

	/**
	 * delete user with given userID and Returns boolean as token of success
	 * 
	 * @param userId
	 * @return
	 */
	public boolean deleteBoardById(int boardId) {
		if (boardId != 0) {
			// Check userWith Id in DB if exists delete it and return boolean as
			// success
			BoardVO deletedBoard = boardDao.getBoardbyId(boardId);
			if (deletedBoard != null) {
				boardDao.deleteBoardById(boardId);
				return true;
			}
		}
		return false;
	}
	
	public List<BoardVO> getBoardNonAccessByUser(int userId){
  	  if(userId != 0){
  		  return boardDao.getBoardNonAccessByUser(userId);
  	  }
  	  return null;
    }
}
