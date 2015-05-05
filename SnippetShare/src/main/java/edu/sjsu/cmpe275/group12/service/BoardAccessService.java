package edu.sjsu.cmpe275.group12.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.sjsu.cmpe275.group12.dao.BoardAccessDao;

public class BoardAccessService {
	 ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      BoardAccessDao boardAccessDao = 
      (BoardAccessDao)context.getBean("boardAccessDaoImpl");
	
}
