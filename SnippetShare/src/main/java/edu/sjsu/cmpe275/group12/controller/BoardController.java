package edu.sjsu.cmpe275.group12.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import edu.sjsu.cmpe275.group12.model.BoardVO;
import edu.sjsu.cmpe275.group12.model.SnippetVO;
import edu.sjsu.cmpe275.group12.model.UserVO;
import edu.sjsu.cmpe275.group12.service.BoardAccessService;
import edu.sjsu.cmpe275.group12.service.BoardService;
import edu.sjsu.cmpe275.group12.service.SnippetService;
import edu.sjsu.cmpe275.group12.util.SnippetConstants;
import edu.sjsu.cmpe275.group12.util.SnippetUtil;

/**
 * Handles requests for the application home page.
 */
@RestController
@SessionAttributes("userSession")
public class BoardController {
	/*
	 * @Autowired BoardDao boardDao;
	 * 
	 * @Autowired BoardAccessDao boardAccessDao;
	 */
/*	public List<String> categotyList = new ArrayList<String>() {
		{
			add("Health");
			add("Business");
			add("Schools");
			add("Politics");
			add("Military");
			add("Sports");
			add("Software");
			add("Economics");
			add("History");
			add("Environment");
		}
	};*/
	
	private static final Logger logger = LoggerFactory
			.getLogger(BoardController.class);

	// ********************************Snippet Share APIs**********************************//

	// Board APIs

	// access is public or private
	@RequestMapping(value = "/createBoard", method = RequestMethod.POST)
	public ModelAndView createBoard(@ModelAttribute("board") BoardVO boardVO,
			@ModelAttribute("userSession") UserVO userSession) {
		ModelAndView modelAndView = new ModelAndView();
		BoardService boardService = new BoardService();
		BoardAccessService boardAccessService = new BoardAccessService();

		SnippetService snippetService = new SnippetService();
		
		boardVO.setUserId(userSession.getUserId());
		
		if (SnippetUtil.authenticateUser(userSession)) {
			boolean isCreated = boardService.createBoard(boardVO);

			System.out.println("Board Created: Title ID: "+ boardVO.getTitle()+"  Category: "+boardVO.getCategory());
			
			if (isCreated) {
				modelAndView.addObject(boardVO);
				List<BoardVO> publicBoardList= boardService.getBoardByAccessType("U");
				List<BoardVO> privateBoardList=boardAccessService.getBordAccessByUser(userSession.getUserId());
				modelAndView.addObject("publicBoardList",publicBoardList);
				modelAndView.addObject("privateBoardList",privateBoardList);
				modelAndView.addObject("userSession", userSession);
				modelAndView.setViewName("V2_Dashboard");
				
			} else {
				modelAndView.addObject("Cannot Create Board",
						"Board already exists");
				modelAndView.setViewName("V2_DashBoard");
			}
		}
		else{
			modelAndView.addObject("AuthenticationFailure",
					"UserId and Password Invalid");
			modelAndView.setViewName("V2_ViewBoard");
		}
		return modelAndView;
	}

	@RequestMapping(value = "/editBoard", method = RequestMethod.POST)
	public ModelAndView editBoard(@ModelAttribute("board") BoardVO boardVO,
			@ModelAttribute("userSession") UserVO userSession) {
		ModelAndView modelAndView = new ModelAndView();
		BoardService boardService = new BoardService();
		SnippetService snippetService = new SnippetService();

		boardVO.setUserId(userSession.getUserId());

		if (SnippetUtil.authenticateUser(userSession)) {
			BoardVO boardVO1 = boardService.updateBoard(boardVO);
			System.out.println("Board Created: Title ID: "
					+ boardVO1.getTitle() + "  Category: "
					+ boardVO1.getCategory());
			modelAndView.addObject(boardVO1);
			modelAndView.setViewName("ViewBoard");
		} else {
			modelAndView.addObject("AuthenticationFailure",
					SnippetConstants.INVALID_USER);
			modelAndView.setViewName("ViewBoard");
		}
		return modelAndView;
	}

	@RequestMapping(value = "/viewBoard/{boardId}", method = RequestMethod.GET)
	public ModelAndView viewBoard(@PathVariable("boardId") int boardId,
			@ModelAttribute("userSession") UserVO userSession) {
		ModelAndView modelAndView = new ModelAndView();
		SnippetService snippetService = new SnippetService();
		if (SnippetUtil.authenticateUser(userSession)) {
			List <SnippetVO> snippetList = snippetService.getSnippetsByBoardId(boardId);
			System.out.println("Board id "+boardId);
			System.out.println(snippetList+"--------------------");
			if (snippetList != null){				
			modelAndView.addObject("snippetList",snippetList);
			modelAndView.addObject("boardId",boardId);
			modelAndView.setViewName("V2_ViewBoard");
			}
			else {
			modelAndView.addObject("snippetList",new ArrayList<SnippetVO>());
			modelAndView.setViewName("V2_ViewBoard");
			modelAndView.addObject("boardId",boardId);
		}
		}else {
			modelAndView.addObject("AuthenticationFailure",
					SnippetConstants.INVALID_USER);
			modelAndView.setViewName("ViewBoard");
		}
		return modelAndView;
	}

	@RequestMapping(value = "/viewPrivateBoard/{boardId}", method = RequestMethod.POST)
	public ModelAndView viewPrivateBoard(
			@ModelAttribute("userSession") UserVO userSession,
			@PathVariable("id") long boardId) {
		ModelAndView modelAndView = new ModelAndView();
		/*
		 * if(null!=boardAccessDao.getBoardAccess(boardId,
		 * userSession.getEmail())){
		 * 
		 * } boardDao.getBoardById(boardId);
		 */
		modelAndView.setViewName("ViewBoard");
		return modelAndView;
	}

	@RequestMapping(value = "/requestBoardAccess", method = RequestMethod.GET)
	public String requestBoardAccess(Locale locale, Model model) {
		return null;
	}

	@RequestMapping(value = "/deleteBoard/{id}", method = RequestMethod.GET)
	public ModelAndView deleteBoard(@ModelAttribute("board") BoardVO boardVO,
			@ModelAttribute("userSession") UserVO userSession) {
		ModelAndView modelAndView = new ModelAndView();
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/listPublicBoard", method = RequestMethod.GET)
	public ModelAndView listPublicBoard() {
		ModelAndView modelAndView = new ModelAndView();
		// modelAndView.addObject("publicBoards",
		// boardDao.getBoardsByAccessType('U'));
		return modelAndView;
	}

	@RequestMapping(value = "/listPrivateBoard", method = RequestMethod.GET)
	public ModelAndView listPrivateBoard() {
		ModelAndView modelAndView = new ModelAndView();
		// modelAndView.addObject("publicBoards",
		// boardDao.getBoardsByAccessType('U'));
		return modelAndView;
	}


	
}
