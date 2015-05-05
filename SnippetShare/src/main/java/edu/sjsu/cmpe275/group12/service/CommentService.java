package edu.sjsu.cmpe275.group12.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.sjsu.cmpe275.group12.dao.CommentDao;

public class CommentService {
	 ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

	 CommentDao commentDao = 
      (CommentDao)context.getBean("commentDaoImpl");
}
