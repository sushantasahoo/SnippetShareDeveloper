package edu.sjsu.cmpe275.group12.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import edu.sjsu.cmpe275.group12.dao.SnippetDaoImpl;

public class SnippetService {
	 ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      SnippetDaoImpl snippetDao = 
      (SnippetDaoImpl)context.getBean("snippetDaoImpl");
      
      
}
