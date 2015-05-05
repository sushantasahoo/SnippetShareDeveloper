package edu.sjsu.cmpe275.group12.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.sjsu.cmpe275.group12.dao.BoardAccessDaoImpl;
import edu.sjsu.cmpe275.group12.model.BoardAccessVO;
import edu.sjsu.cmpe275.group12.dao.BoardAccessDao;

public class BoardAccessService {
	 ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      BoardAccessDaoImpl boardAccessDao = 
      (BoardAccessDaoImpl)context.getBean("boardAccessDaoImpl");
      
      
      /**
       * Creates Board Access Request
       * @param boardAccess
       * @return
       */
      public boolean createBoardAccess(BoardAccessVO bAccess){
    	  if(bAccess.getBoardId()!=0 && bAccess.getUserId()!=0 && bAccess.getAccessStatus().equals("P")){
    		  return boardAccessDao.createBoardAccess(bAccess);
    	  }
    	  
    	  return false;
      }
      
      /**
       * Checks whether user has already requested for the board Access
       * @param boardId
       * @param userId
       * @return
       */
      public boolean isBoardAccess(int boardId, int userId){
    	  if(boardId!= 0 && userId != 0){
    		  BoardAccessVO bAccess =boardAccessDao.getBoardAccess(boardId, userId);
    		  if(bAccess!=null && bAccess.getAccessStatus().equals("A")){
    			  return true;
    		  }
    	  }
    	  
    	  return false;
      }
      
      
      /**
       * Returns list of all the request made to the private Board using boardId
       * This method is called when logged in user provides his board id to see all pending requests 
       * @param boardId
       * @return
       */
      public List<BoardAccessVO> getBoardAccessRequest(int boardId){
    	  if(boardId != 0){
    		  return boardAccessDao.getBoardAccessRequest(boardId);
    	  }
    	  return null;
      }
      
      
      /**
       * Approves the request made by the user for private board
       * Input as boardAccessVO with updated accessStatus
       * @param bAccess
       * @return
       */
      public boolean approveRequest(BoardAccessVO bAccess){
    	  if(bAccess.getUserId()!=0 && bAccess.getAccessStatus().equals("A") 
    			  && bAccess.getBoardId() != 0){
    		  boardAccessDao.updateBoardAccess(bAccess);
    		  return true;
    	  }
    	  return false;
      }
      
      
      /**
       * Decline request of any user requested for access to board, 
       * @param boardId
       * @param userId
       * @return
       */
      public boolean declineRequest(int boardId, int userId){
    	  if(boardId!=0 && userId != 0){
    		  boardAccessDao.deleteBoardAccess(boardId, userId);
    	  } 
    	 return false;
      }

}
