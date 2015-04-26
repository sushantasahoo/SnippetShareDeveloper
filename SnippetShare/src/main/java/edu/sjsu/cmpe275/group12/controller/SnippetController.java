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
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles requests for the application home page.
 */
@RestController
public class SnippetController {
	
	private static final Logger logger = LoggerFactory.getLogger(SnippetController.class);
	
	
	//********************************Snippet Share APIs**********************************//
	
	//Snippet APIs
	
	
	@RequestMapping(value = "/addSnippet", method = RequestMethod.POST)
	public String addSnippet(Locale locale, Model model){
		return null;
	}
	
	@RequestMapping(value = "/updateSnippet", method = RequestMethod.POST)
	public String updateSnippet(Locale locale, Model model){
		return null;
	}
	
	@RequestMapping(value = "/deleteSnippet", method = RequestMethod.DELETE)
	public String deleteSnippet(Locale locale, Model model){
		return null;
	}
	
	@RequestMapping(value = "/commentOnSnippet", method = RequestMethod.POST)
	public String commentOnSnippet(Locale locale, Model model){
		return null;
	}
	
	
}
