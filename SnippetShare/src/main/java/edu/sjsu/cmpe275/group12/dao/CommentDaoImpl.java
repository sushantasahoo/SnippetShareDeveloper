package edu.sjsu.cmpe275.group12.dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import edu.sjsu.cmpe275.group12.model.CommentVO;

public class CommentDaoImpl implements CommentDao {
	// protected SessionFactory sessionFactory;
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	private Log log = LogFactory.getLog(this.getClass());

	/**
	 * Setting Hibernate session factory
	 */


	public void setDataSource(DataSource dataSource) {
		 this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void createComment(CommentVO comment) {
		String SQL = "insert into Comment (comment_id, snippet_id, email, comment) values (?, ?, ?, ?)";

		jdbcTemplateObject.update(SQL, comment.getCommentId(),
				comment.getSnippetId(), "avdhut.thakar@gmail.com","hello");
		System.out.println("Created Record Name = " + comment.getCommentId()
				+ " Age = " + comment.getCommentId());
		return;

	}

	@Override
	public List<CommentVO> getComment(long snippetId) {
		// TODO Auto-generated method stub
		 String SQL = "select * from Comment where snippet_id="+snippetId;
	      List <CommentVO> commentList = jdbcTemplateObject.query(SQL, 
	                                new CommentsMapper());
	      return commentList;
	}

	@Override
	public void deleteComment(long commentId) {
		// TODO Auto-generated method stub

	}

}
