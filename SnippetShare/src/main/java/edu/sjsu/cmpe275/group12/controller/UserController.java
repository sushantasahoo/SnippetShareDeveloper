package edu.sjsu.cmpe275.group12.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import edu.sjsu.cmpe275.group12.model.UserVO;
import edu.sjsu.cmpe275.group12.service.UserService;
import edu.sjsu.cmpe275.group12.util.SnippetConstants;
import edu.sjsu.cmpe275.group12.util.SnippetUtil;

/**
 * Handles requests for the application home page.
 */
@RestController
@SessionAttributes("userSession")
public class UserController {
	/*
	 * @Autowired UserDao userDao;
	 * 
	 * @Autowired BoardDao boardDao;
	 */

	private static final Logger logger = LoggerFactory
			.getLogger(UserController.class);

/*	*//**
	 * Simply selects the home view to render by returning its name.
	 *//*
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.setViewName("redirect:Home");
		return modelAndView;
	}*/

	/**
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/createAccount", method = RequestMethod.POST)
	public ModelAndView createAccount(@ModelAttribute("user") UserVO user) {
		ModelAndView modelAndView = new ModelAndView();
		if (user.getPassword() != null && user.getPassword()!=""){
			user.setPassword(SnippetUtil.encryptedPassword(user.getPassword()));
		}
		UserService userService = new UserService();
		modelAndView.addObject("userSession", user);
		
		boolean isCreated = userService.createUser(user);
		if (isCreated) {
			modelAndView.setViewName("V2_Dashboard");
		} else {
			modelAndView.addObject("Cannot Create Account",
					"Email ID already exists");
			modelAndView.setViewName("V2_HomePage");
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public ModelAndView signinGet(@ModelAttribute("userSession") UserVO userSession) {
		ModelAndView modelAndView= new ModelAndView();
		if (authenticateUser(userSession)) {
			modelAndView.setViewName("V2_Dashboard");
		}
		else{
		System.out.println("In SignIn get method");
		modelAndView.setViewName("redirect:V2_HomePage");
		}
		return modelAndView;
	}

	/**
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public ModelAndView signin(@ModelAttribute("user") UserVO user) {
		ModelAndView modelAndView = new ModelAndView();
		if (user.getPassword() != null && user.getPassword()!=""){
			user.setPassword(SnippetUtil.encryptedPassword(user.getPassword()));
		}
		UserService userService = new UserService();
		UserVO user1 = userService.getUser(user.getEmail(), user.getPassword());

		// Authenticate User
		if (user1 != null) {
			if (user1.getPassword().equals(user.getPassword())) {
				modelAndView.addObject("userSession", user1);
				modelAndView.setViewName("V2_Dashboard");
			} else {
				modelAndView.addObject("AuthenticationFailure",
						SnippetConstants.INVALID_USER);
				modelAndView.setViewName("V2_HomePage");
			}
		} else {
			modelAndView.addObject("AuthenticationFailure",
					SnippetConstants.INVALID_USER);
			modelAndView.setViewName("V2_HomePage");
		}

		return modelAndView;
	}
	
	@RequestMapping(value = "/signout", method = RequestMethod.GET)
	public ModelAndView signout(SessionStatus sessionStatus) {
		ModelAndView modelAndView = new ModelAndView();
		sessionStatus.setComplete();
		modelAndView.setViewName("V2_HomePage");
		return modelAndView;
	}

	@RequestMapping(value = "/viewProfile", method = RequestMethod.GET)
	public ModelAndView viewProfile(
			@ModelAttribute("userSession") UserVO userSession) {
		ModelAndView modelAndView = new ModelAndView();
		if (authenticateUser(userSession)) {
			modelAndView.setViewName("V2_Profile");
		} else {
			modelAndView.addObject("AuthenticationFailure",
					SnippetConstants.INVALID_USER);
			modelAndView.setViewName("V2_HomePage");
		}
		return modelAndView;
	}

	@RequestMapping(value = "/updateProfile", method = RequestMethod.POST)
	public ModelAndView updateProfile(
			@ModelAttribute("userSession") UserVO userSession,
			@ModelAttribute("user") UserVO user) {
		ModelAndView modelAndView = new ModelAndView();
		if (authenticateUser(userSession)) {
			// userDao.updateUser(user);
			System.out.println("Updated");
			modelAndView.setViewName("V2_Profile");
		} else {
			modelAndView.addObject("AuthenticationFailure",
					"Login Again Session Expired");
			modelAndView.setViewName("V2_HomePage");
		}
		return modelAndView;
	}

	@RequestMapping(value = "/deleteProfile", method = RequestMethod.DELETE)
	public ModelAndView deleteProfile(
			@ModelAttribute("userSession") UserVO userSession,
			@ModelAttribute("user") UserVO user) {
		ModelAndView modelAndView = new ModelAndView();
		UserService userService=new UserService();
		
		if (authenticateUser(userSession)) {
			userService.deleteUser(user.getUserId());
			System.out.println("Deleted");
			modelAndView.setViewName("V2_HomePage");
		} else {
			modelAndView.addObject("AuthenticationFailure",
					SnippetConstants.INVALID_USER);
			modelAndView.setViewName("V2_HomePage");
		}
		return modelAndView;
	}

	boolean authenticateUser(UserVO user) {
		UserService userService = new UserService();
		UserVO user1 = userService.getUser(user.getEmail(), user.getPassword());
		if (user1 != null) {
			return true;
		} else {
			return false;
		}

	}

}
