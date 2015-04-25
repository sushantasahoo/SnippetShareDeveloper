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
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	//********************************Snippet Share APIs**********************************//
	
	//User APIs
	
	@RequestMapping(value = "/createAccount", method = RequestMethod.POST)
	public String createAccount(Locale locale, Model model){
		return null;
	}
	
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String signin(Locale locale, Model model){
		return null;
	}
	
	@RequestMapping(value = "/signout", method = RequestMethod.POST)
	public String signout(Locale locale, Model model){
		return null;
	}
	
	@RequestMapping(value = "/updateProfile", method = RequestMethod.POST)
	public String updateProfile(Locale locale, Model model){
		return null;
	}
	
	@RequestMapping(value = "/deleteProfile", method = RequestMethod.DELETE)
	public String deleteProfile(Locale locale, Model model){
		return null;
	}
	
}
