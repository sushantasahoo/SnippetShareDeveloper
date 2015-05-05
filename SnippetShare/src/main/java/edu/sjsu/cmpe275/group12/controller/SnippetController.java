package edu.sjsu.cmpe275.group12.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.sjsu.cmpe275.group12.model.SnippetVO;
import edu.sjsu.cmpe275.group12.model.UserVO;
import edu.sjsu.cmpe275.group12.service.SnippetService;
import edu.sjsu.cmpe275.group12.util.SnippetUtil;

/**
 * Handles requests for the application home page.
 */
@RestController
public class SnippetController {
	/*@Autowired
	SnippetDao snippetDao;*/
	private static final Logger logger = LoggerFactory.getLogger(SnippetController.class);

	
	//********************************Snippet Share APIs**********************************//
	
	//Snippet APIs

	@RequestMapping(value = "/addSnippet", method = RequestMethod.POST)
	public ModelAndView addSnippet(@ModelAttribute("snippetVO") SnippetVO snippetVO,
			@ModelAttribute("userSession") UserVO userSession){
		ModelAndView modelAndView = new ModelAndView();
		SnippetService snippetService = new SnippetService();
		
		snippetVO.setUserId(userSession.getUserId());
		
		if (SnippetUtil.authenticateUser(userSession)) {
			boolean isCreated = snippetService.createSnippet(snippetVO);
			System.out.println("Board Created: Title ID: "+ snippetVO.getTitle()+"  Category: "+snippetVO.getContent());
			
			if (isCreated) {
				modelAndView.addObject(snippetVO);
				modelAndView.setViewName("V2_ViewSnippet");
			} else {
				modelAndView.addObject("Cannot Create Board",
						"Board already exists");
				modelAndView.setViewName("DashBoard");
			}
		}
		else{
			modelAndView.addObject("AuthenticationFailure",
					"UserId and Password Invalid");
			modelAndView.setViewName("ViewBoard");
		}
		return modelAndView;
		
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
