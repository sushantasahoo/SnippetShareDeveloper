package edu.sjsu.cmpe275.group12.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import edu.sjsu.cmpe275.group12.model.CommentVO;
import edu.sjsu.cmpe275.group12.model.SnippetVO;
import edu.sjsu.cmpe275.group12.model.UserVO;
import edu.sjsu.cmpe275.group12.service.CommentService;
import edu.sjsu.cmpe275.group12.service.SnippetService;
import edu.sjsu.cmpe275.group12.util.SnippetConstants;
import edu.sjsu.cmpe275.group12.util.SnippetUtil;

/**
 * Handles requests for the application home page.
 */
@SessionAttributes("userSession")
@RestController
public class SnippetController {
	/*
	 * @Autowired SnippetDao snippetDao;
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(SnippetController.class);

	/**
	 * 
	 * @param userSession
	 * @return
	 */
	@RequestMapping(value = "/{boardId}/createSnippet", method = RequestMethod.GET)
	public ModelAndView snippetDashboard(@PathVariable("boardId") int boardId,
			@ModelAttribute("userSession") UserVO userSession) {
		ModelAndView modelAndView = new ModelAndView();

		if (SnippetUtil.authenticateUser(userSession)) {
			modelAndView.addObject("boardId", boardId);
			modelAndView.setViewName("V2_CreateSnippet");
		} else {
			modelAndView.addObject("AuthenticationFailure",
					SnippetConstants.INVALID_USER);
			modelAndView.addObject("boardId", boardId);
			modelAndView.setViewName("V2_ViewBoard");
		}
		return modelAndView;

	}

	/**
	 * 
	 * @param snippetVO
	 * @param userSession
	 * @return
	 */
	@RequestMapping(value = "/{boardId}/addSnippet", method = RequestMethod.POST)
	public ModelAndView addSnippet(@PathVariable("boardId") int boardId,
			@ModelAttribute("snippetVO") SnippetVO snippetVO,
			@ModelAttribute("userSession") UserVO userSession) {
		ModelAndView modelAndView = new ModelAndView();
		SnippetService snippetService = new SnippetService();

		snippetVO.setUserId(userSession.getUserId());
		snippetVO.setBoardId(boardId);
		if (SnippetUtil.authenticateUser(userSession)) {
			boolean isCreated = snippetService.createSnippet(snippetVO);
			System.out.println("Snippet Created: Title ID: "
					+ snippetVO.getTitle() + "  Category: "
					+ snippetVO.getContent() + snippetVO.getBoardId());

			if (isCreated) {
				// TODO :: Change the name of the view to redirect to all
				// snippets under particular board
				modelAndView.addObject(snippetVO);
				modelAndView.setViewName("V2_ViewBoard");
			} else {
				modelAndView.addObject("Cannot Create Board",
						SnippetConstants.SNIPPET_CREATION_FAILED);
				modelAndView.setViewName("V2_ViewSnippet");
			}
		} else {
			modelAndView.addObject("AuthenticationFailure",
					SnippetConstants.INVALID_USER);
			modelAndView.setViewName("V2_HomePage");
		}
		return modelAndView;

	}

	/**
	 * 
	 * @param snippetVO
	 * @param userSession
	 * @return
	 */
	@RequestMapping(value = "/updateSnippet", method = RequestMethod.POST)
	public ModelAndView updateSnippet(
			@ModelAttribute("snippetVO") SnippetVO snippetVO,
			@ModelAttribute("userSession") UserVO userSession) {
		ModelAndView modelAndView = new ModelAndView();
		SnippetService snippetService = new SnippetService();

		if (SnippetUtil.authenticateUser(userSession)) {
			boolean isCreated = snippetService.updateSnippet(snippetVO);
			System.out.println("Snippet Created: Title ID: "
					+ snippetVO.getTitle() + "  Category: "
					+ snippetVO.getContent());

			if (isCreated) {
				// TODO :: Change the name of the view to redirect to all
				// snippets under particular board
				modelAndView.addObject(snippetVO);
				modelAndView.setViewName("ViewBoard");
			} else {
				modelAndView.addObject("Cannot Create Board",
						SnippetConstants.SNIPPET_CREATION_FAILED);
				modelAndView.setViewName("V2_ViewSnippet");
			}
		} else {
			modelAndView.addObject("AuthenticationFailure",
					SnippetConstants.INVALID_USER);
			modelAndView.setViewName("V2_HomePage");
		}
		return modelAndView;
	}

	/**
	 * 
	 * @param snippetVO
	 * @param userSession
	 * @return
	 */
	@RequestMapping(value = "/deleteSnippet", method = RequestMethod.DELETE)
	public ModelAndView deleteSnippet(
			@ModelAttribute("snippetVO") SnippetVO snippetVO,
			@ModelAttribute("userSession") UserVO userSession) {

		return null;
	}

	/**
	 * 
	 * @param snippetVO
	 * @param userSession
	 * @return
	 */
	@RequestMapping(value = "/snippet/{boardId}/{snippetId}", method = RequestMethod.GET)
	public ModelAndView commentOnSnippet(
			@PathVariable("snippetId") int snippetId,
			@PathVariable("boardId") int boardId,
			@ModelAttribute("snippetVO") SnippetVO snippetVO,
			@ModelAttribute("userSession") UserVO userSession) {
		ModelAndView modelAndView = new ModelAndView();
		SnippetService snippetService = new SnippetService();
		CommentService commentService = new CommentService();
		if (SnippetUtil.authenticateUser(userSession)) {
			SnippetVO snippet = snippetService.getSnippetById(snippetId);
			List<CommentVO> comments = commentService.getBoardbyId(snippetId);
			if(snippet!=null){
				modelAndView.addObject("snippet", snippet);
				modelAndView.addObject("boardId", boardId);
				modelAndView.addObject("comments", comments);
				System.out.println(comments);
				modelAndView.setViewName("V2_ViewSnippet");
			}
			else{
				modelAndView.addObject("Cannot find snippet",
						SnippetConstants.SNIPPET_FETCHING_FAILED);
				modelAndView.setViewName("V2_ViewBoard");
			}

		}
		else{
			modelAndView.addObject("AuthenticationFailure",
					SnippetConstants.INVALID_USER);
			modelAndView.setViewName("V2_HomePage");
		}

		return modelAndView;
	}

	/**
	 * 
	 * @param boardId
	 * @param userSession
	 * @return
	 */
	@RequestMapping(value = "/getSnippet/{boardId}", method = RequestMethod.POST)
	public ModelAndView getSnippetList(@PathVariable("boardId") int boardId,
			@ModelAttribute("userSession") UserVO userSession) {
		ModelAndView modelAndView = new ModelAndView();
		SnippetService snippetService = new SnippetService();
		if (SnippetUtil.authenticateUser(userSession)) {
			List<SnippetVO> lst = snippetService.getSnippetsByBoardId(boardId);
			modelAndView.addObject(lst);
			modelAndView.setViewName("V2_ViewBoard");
		}
		return null;
	}

	@RequestMapping(value = "/addComment/{boardId}/{snippetId}", method = RequestMethod.GET)
	public ModelAndView addComment(@PathVariable("boardId") int boardId,
			@PathVariable("snippetId") int snippetId,
			@ModelAttribute("userSession") UserVO userSession) {
		ModelAndView modelAndView = new ModelAndView();
		SnippetService snippetService = new SnippetService();
		if (SnippetUtil.authenticateUser(userSession)) {
			modelAndView.addObject("boardId", boardId);
			modelAndView.addObject("snippetId",snippetId);
			modelAndView.setViewName("V2_AddComment");
		}
		return modelAndView;
	}



	@RequestMapping(value = "/postComment/{boardId}/{snippetId}", method = RequestMethod.POST)
	public ModelAndView postComment(@ModelAttribute("commentVO") CommentVO commentVO,
			@PathVariable("boardId") int boardId,
			@PathVariable("snippetId") int snippetId,
			@RequestParam("comment") String comment, 
			@ModelAttribute("userSession") UserVO userSession) {
		ModelAndView modelAndView = new ModelAndView();
		SnippetService snippetService = new SnippetService();
		CommentService commentService = new CommentService();
		if (SnippetUtil.authenticateUser(userSession)) {
			commentVO.setSnippetId(snippetId);
			commentVO.setComment(comment);
			commentVO.setUserId(userSession.getUserId());
			if(commentService.createComment(commentVO)){
				SnippetVO snippet = snippetService.getSnippetById(snippetId);
				List<CommentVO> comments = commentService.getBoardbyId(snippetId);
				if(snippet!=null){
					modelAndView.addObject("snippet", snippet);
					modelAndView.addObject("boardId", boardId);
					modelAndView.addObject("comments", comments);
					System.out.println(comments);
					modelAndView.setViewName("V2_ViewSnippet");
				}
			}
			else{
				modelAndView.addObject("Cannot add Comment",
						SnippetConstants.COMMENT_CREATION_FAILED);
				modelAndView.setViewName("V2_ViewSnippet");
			}
		}
		return modelAndView;

	}

}
