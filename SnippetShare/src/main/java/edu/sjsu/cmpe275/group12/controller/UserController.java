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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import edu.sjsu.cmpe275.group12.dao.BoardDao;
import edu.sjsu.cmpe275.group12.dao.UserDao;
import edu.sjsu.cmpe275.group12.model.UserVO;

/**
 * Handles requests for the application home page.
 */
@RestController
@SessionAttributes("userSession")
public class UserController {
	/*@Autowired
	UserDao userDao;
	@Autowired
	BoardDao boardDao;*/
	
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
	
	//********************************Snippet Share APIs**********************************//
	
	//User APIs
	
	@RequestMapping(value = "/createAccount", method = RequestMethod.POST)
	public ModelAndView createAccount(@ModelAttribute("user") UserVO user){
		ModelAndView modelAndView=new ModelAndView();
		//if(null==userDao.getUser(user.getEmail())){
		//userDao.createUser(user);
		//--mocking
		System.out.println(user.getFirstname());
		System.out.println(user.getLastname());
		System.out.println(user.getUserId());
		System.out.println(user.getEmail());
		System.out.println(user.getMobileNumber());
		System.out.println(user.getPassword());
		System.out.println(user.getAddress());
		//--mocking
		modelAndView.addObject("userSession", user);
		//modelAndView.addObject("publicBoards", boardDao.getBoardsByAccessType('R'));
		//modelAndView.addObject("privateBoards", boardDao.getBoardsByAccessType('U'));
		modelAndView.setViewName("Dashboard");
		//}
		/*else{
			modelAndView.addObject("AlreadyExists", "User already exists");
			modelAndView.setViewName("Register");
		}*/
		return modelAndView;	
	}
	
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public ModelAndView signin(@ModelAttribute("user") UserVO user){
		ModelAndView modelAndView=new ModelAndView();
		//UserVO user1=userDao.getUser(user.getEmail());
		//--mocking
		UserVO user1=new UserVO();
		user1.setEmail("vin@gmail.com");
		user1.setPassword("12345");
		//--mocking
		
		//Authenticate User
		if(user!=null){
			if(user1.getPassword().equals(user.getPassword())){
				modelAndView.addObject("userSession", user);
				//modelAndView.addObject("publicBoards", boardDao.getBoardsByAccessType('R'));
				//modelAndView.addObject("privateBoards", boardDao.getBoardsByAccessType('U'));
				modelAndView.setViewName("Dashboard");
			}
			else{
				modelAndView.addObject("AuthenticationFailure", "UserId and Password Invalid");
				modelAndView.setViewName("SignIn");
			}
		}
		else{
			modelAndView.addObject("AuthenticationFailure", "UserId and Password Invalid");
			modelAndView.setViewName("SignIn");
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "/signout", method = RequestMethod.POST)
	public ModelAndView signout(SessionStatus sessionStatus){
		ModelAndView modelAndView=new ModelAndView();
		sessionStatus.setComplete();
		modelAndView.setViewName("SignIn");
		return modelAndView;
	}
	
	@RequestMapping(value = "/viewProfile", method = RequestMethod.GET)
	public ModelAndView viewProfile(@ModelAttribute("userSession") UserVO userSession){
		ModelAndView modelAndView = new ModelAndView();
		if(authenticateUser(userSession)){
			modelAndView.setViewName("Profile");
		}
		else{
			modelAndView.addObject("AuthenticationFailure", "UserId and Password Invalid");
			modelAndView.setViewName("SignIn");
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "/updateProfile", method = RequestMethod.POST)
	public ModelAndView updateProfile(@ModelAttribute("userSession") UserVO userSession, @ModelAttribute("user") UserVO user){
		ModelAndView modelAndView = new ModelAndView();
		if(authenticateUser(userSession)){
			//userDao.updateUser(user);
			System.out.println("Updated");
			modelAndView.setViewName("Profile");
		}
		else{
			modelAndView.addObject("AuthenticationFailure", "Login Again Session Expired");
			modelAndView.setViewName("SignIn");
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "/deleteProfile", method = RequestMethod.DELETE)
	public ModelAndView deleteProfile(@ModelAttribute("userSession") UserVO userSession, @ModelAttribute("user") UserVO user){
		ModelAndView modelAndView = new ModelAndView();
		if(authenticateUser(userSession)){
			//userDao.deleteUser(email);
			System.out.println("Deleted");
			modelAndView.setViewName("HomePage");
		}
		else{
			modelAndView.addObject("AuthenticationFailure", "UserId and Password Invalid");
			modelAndView.setViewName("SignIn");
		}
		return modelAndView;
	}
	
	boolean authenticateUser(UserVO user) {
		// UserVO user1=userDao.getUser(user.getEmail());
		// --mocking
		UserVO user1 = new UserVO();
		user1.setEmail("vin@gmail.com");
		user1.setPassword("12345");
		// --mocking

		// Authenticate User
		if (user != null) {
			if (user1.getPassword().equals(user.getPassword())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}
	
}
