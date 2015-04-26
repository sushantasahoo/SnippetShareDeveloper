package edu.sjsu.cmpe275.group12.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.sjsu.cmpe275.group12.dao.UserDao;
import edu.sjsu.cmpe275.group12.model.UserVO;

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
	public ModelAndView home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		
		return new ModelAndView("HomePage");
	}
	
	@RequestMapping(value = "/SignIn", method = RequestMethod.GET)
	public ModelAndView signIn() {
		return new ModelAndView("SignIn");
	}
	
	@RequestMapping(value = "/Register", method = RequestMethod.GET)
	public ModelAndView register() {
		return new ModelAndView("Register");
	}
	
	//********************************Snippet Share APIs**********************************//
	
	//User APIs
	
	@RequestMapping(value = "/createAccount", method = RequestMethod.POST)
	public String createAccount(Locale locale, Model model){
		return null;
	}
	
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public ModelAndView signin(@ModelAttribute("user") UserVO user){
		
		return new ModelAndView("Dashboard");
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
