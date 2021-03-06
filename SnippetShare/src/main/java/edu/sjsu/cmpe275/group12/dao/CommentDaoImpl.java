package edu.sjsu.cmpe275.group12.dao;

import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;

import edu.sjsu.cmpe275.group12.model.BoardAccessVO;
import edu.sjsu.cmpe275.group12.model.CommentVO;

public class CommentDaoImpl implements CommentDao {

	private JdbcTemplate jdbcTemplateObject;

	private Log log = LogFactory.getLog(this.getClass());



	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean createComment(CommentVO comment) {
		String SQL = "insert into `snippet`.`comment` (snippet_id, comment, user_id) values (?, ?, ?)";

		try{
			jdbcTemplateObject.update(SQL, comment.getSnippetId(), comment.getComment(), comment.getUserId());
			return true;
		}
		catch(DuplicateKeyException ex){
			return false;
		}



	}

	@Override
	public List<CommentVO> getComment(int snippetId) {
		String SQL = "select c.*,c.comment_id, u.first_name from snippet.comment c, snippet.user u where snippet_id= ? and u.user_id=c.user_id;";
		List<CommentVO> comments =  jdbcTemplateObject.query(SQL, 
				new Object[]{ snippetId }, new CommentMapper());

		if(comments!=null && comments.size()>0){
			return comments;
		}
		else 
			return null;
	}

	@Override
	public int deleteComment(int snippetId) {
		String SQL = "DELETE FROM `snippet`.`comment` WHERE snippet_id = ? ;";
		Object[] param_snippetId = { snippetId };
		int[] types = {Types.INTEGER};
		int rows = jdbcTemplateObject.update(SQL, param_snippetId, types);
		System.out.println(rows + " row(s) deleted.");
		return rows;
	}

	@Override
	public void updateComment(CommentVO comment) {
		String SQL = "UPDATE `snippet`.`comment` SET `comment` =  ?  WHERE `comment_id` = ? ;";
		jdbcTemplateObject.update(SQL, comment.getComment(), comment.getCommentId() );
	}

}
