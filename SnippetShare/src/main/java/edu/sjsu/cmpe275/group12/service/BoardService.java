package edu.sjsu.cmpe275.group12.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.sjsu.cmpe275.group12.dao.BoardDaoImpl;
import edu.sjsu.cmpe275.group12.model.BoardVO;
import edu.sjsu.cmpe275.group12.model.UserVO;

public class BoardService {
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	BoardDaoImpl boardDao = (BoardDaoImpl) context.getBean("boardDaoImpl");

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
			return boardDao.createBoard(boardVO);
		} else {
			return false;
		}

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
	 * updated User with provided user object
	 * 
	 * @param
	 * @return
	 */
	public BoardVO getBoardbyId(BoardVO boardVO) {
	
		return boardVO;
	}

	
//	
	
	
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
}
