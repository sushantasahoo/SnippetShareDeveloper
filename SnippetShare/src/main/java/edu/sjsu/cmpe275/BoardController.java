package edu.sjsu.cmpe275;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
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
