package edu.sjsu.cmpe275.group12.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.sjsu.cmpe275.group12.dao.BoardDaoImpl;

public class BoardService {
	 ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

	 BoardDaoImpl boardDao = 
      (BoardDaoImpl)context.getBean("boardDaoImpl");
}
