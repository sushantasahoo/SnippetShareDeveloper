package edu.sjsu.cmpe275.group12.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.sjsu.cmpe275.group12.dao.CommentDao;
import edu.sjsu.cmpe275.group12.model.CommentVO;

public class CommentService {
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	CommentDao commentDao = (CommentDao) context.getBean("commentDaoImpl");

	/**
	 * Creates user with and returns sets Created UserId to user Object and
	 * returns success
	 * 
	 * @param user
	 * @return
	 */
	public boolean createBoard(CommentVO commentVO) {
		if (commentVO.getComment() != null
				&& !commentVO.getComment().equals("")
				&& commentVO.getUserId() != 0 && commentVO.getSnippetId() != 0) {
			return commentDao.createComment(commentVO);
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

	public CommentVO updateBoard(CommentVO commentVO) {
		if (commentVO.getComment() != null
				&& !commentVO.getComment().equals("")
				&& commentVO.getUserId() != 0 && commentVO.getSnippetId() != 0) {
			commentDao.updateComment(commentVO);
			return commentVO;
		} else {
			return commentVO;
		}

	}

	/**
	 * User board with provided boardId
	 * 
	 * @param
	 * @return
	 */
	public List<CommentVO> getBoardbyId(int snippetId) {
		if (snippetId != 0) {
			return commentDao.getComment(snippetId);
		}
		return null;
	}

	/**
	 * delete user with given userID and Returns boolean as token of success
	 * 
	 * @param userId
	 * @return
	 */
	public boolean deleteCommentById(int snippetId) {
		// Check userWith Id in DB if exists delete it and return boolean as
		// success
		int nmberOfRows = commentDao.deleteComment(snippetId);
		if (nmberOfRows > 0) {
			return true;
		}

		return false;
	}
}
