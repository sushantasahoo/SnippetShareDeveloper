package edu.sjsu.cmpe275.group12.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.sjsu.cmpe275.group12.dao.BoardDao;

/**
 * Handles requests for the application home page.
 */
@RestController
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);


	//********************************Snippet Share APIs**********************************//
	
	//Board APIs
	
	//access is public or private
	@RequestMapping(value = "/createBoard/{access}", method = RequestMethod.POST)
	public String createBoard(Locale locale, Model model){
		return null;
	}
	
	@RequestMapping(value = "/editBoard", method = RequestMethod.POST)
	public String editBoard(Locale locale, Model model){
		return null;
	}
	
	@RequestMapping(value = "/listPublicBoard", method = RequestMethod.GET)
	public String listPublicBoard(Locale locale, Model model){
		return null;
	}
	
	@RequestMapping(value = "/listPrivateBoard", method = RequestMethod.GET)
	public String listPrivateBoard(Locale locale, Model model){
		return null;
	}
	
	@RequestMapping(value = "/requestBoardAccess", method = RequestMethod.GET)
	public String requestBoardAccess(Locale locale, Model model){
		return null;
	}
	
	@RequestMapping(value = "/viewPublicBoard", method = RequestMethod.POST)
	public String viewPublicBoard(Locale locale, Model model){
		return null;
	}
	
	@RequestMapping(value = "/viewPrivateBoard", method = RequestMethod.POST)
	public String viewPrivateBoard(Locale locale, Model model){
		return null;
	}

}
