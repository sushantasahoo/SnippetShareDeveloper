package edu.sjsu.cmpe275.group12.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.sjsu.cmpe275.group12.dao.SnippetDao;

public class SnippetService {
	 ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      SnippetDao snippetDao = 
      (SnippetDao)context.getBean("snippetDaoImpl");
      
      
}
