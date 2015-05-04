package edu.sjsu.cmpe275.group12.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.sjsu.cmpe275.group12.dao.CommentDaoImpl;

public class CommentService {
	 ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

	 CommentDaoImpl commentDao = 
      (CommentDaoImpl)context.getBean("commentDaoImpl");
}