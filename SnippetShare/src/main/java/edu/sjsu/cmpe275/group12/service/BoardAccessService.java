package edu.sjsu.cmpe275.group12.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.sjsu.cmpe275.group12.dao.BoardAccessDaoImpl;

public class BoardAccessService {
	 ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      BoardAccessDaoImpl boardAccessDao = 
      (BoardAccessDaoImpl)context.getBean("boardAccessDaoImpl");
	
}
