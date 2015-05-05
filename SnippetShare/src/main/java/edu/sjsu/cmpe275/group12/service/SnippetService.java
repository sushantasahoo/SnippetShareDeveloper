package edu.sjsu.cmpe275.group12.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.sjsu.cmpe275.group12.model.SnippetVO;
import edu.sjsu.cmpe275.group12.dao.SnippetDao;

public class SnippetService {
	ApplicationContext context = 
			new ClassPathXmlApplicationContext("Beans.xml");

	SnippetDao snippetDao = 
			(SnippetDao)context.getBean("snippetDaoImpl");

	/**
	 * Creates the snippet and returns true if snippet is created
	 * @param snippet
	 * @return
	 */
	public boolean createSnippet(SnippetVO snippet){
		if(snippet.getBoardId()!=0 && snippet.getTitle()!=null && snippet.getUserId() != 0){
			return snippetDao.createSnippet(snippet);
		}
		return false;
	}

	/**
	 * List all the snippet with given board Id
	 * @param boardId
	 * @return list
	 */
	public List<SnippetVO> getSnippetsByBoardId(int boardId){
		if( boardId!= 0){
			return snippetDao.getSnippetByBoardId(boardId);
		}
		return null;
	}

	
	/**
	 * Returns a Snippet by provided snippet Id
	 * @param snippetId
	 * @return SnippetVO
	 */
	public SnippetVO getSnippetById(int snippetId){
		if(snippetId!=0){
			return snippetDao.getSnippet(snippetId);
		}
		return null;
	}



}
