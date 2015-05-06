package edu.sjsu.cmpe275.group12.dao;

import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import edu.sjsu.cmpe275.group12.model.SnippetVO;

public class SnippetDaoImpl implements SnippetDao{
		//protected SessionFactory sessionFactory;
		
	private JdbcTemplate jdbcTemplateObject;



	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

		private Log log = LogFactory.getLog(this.getClass());


		@Override
		public boolean createSnippet(SnippetVO snippet) {
			String SQL = "INSERT INTO `snippet`.`snippet`(`board_id`,`title`,`tags`,`content`,`user_id`)VALUES(?,?,?,?,?);";
			try{
				jdbcTemplateObject.update(SQL, snippet.getBoardId(), snippet.getTitle(), 
						snippet.getTags(), snippet.getContent(), snippet.getUserId());
				return true;
			}
			catch(DuplicateKeyException ex){
				return false;
			}
		}
		
		/**
		 * Title, Tags and contents can be updated of snippet using snippet Id
		 * @param snippetVO
		 */

		@Override
		public void updateSnippet(SnippetVO snippet) {
			String SQL = "UPDATE `snippet`.`snippet` SET ` `title` = ?, `tags` = ?, `content` = ? WHERE `snippet_id` = ?;";
			jdbcTemplateObject.update(SQL, snippet.getTitle(), snippet.getTags(), snippet.getContent());	
		}

		@Override
		public SnippetVO getSnippet(int snippetId) {
			String SQL = "SELECT * from `snippet`.snippet` WHERE `snippet_id` = ?";
			List<SnippetVO> snippet =  jdbcTemplateObject.query(SQL, 
					new Object[]{ snippetId }, new SnippetMapper());

			if(snippet!=null && snippet.size()>0){
				return snippet.get(0);
			}
			else 
				return null;
		}

		@Override
		public void deleteSnippet(int snippetId) {
			String SQL = "DELETE FROM `snippet`.`snippet` WHERE snippet_id = ? ;";
			Object[] params = { snippetId };
			int[] types = {Types.INTEGER};
			int rows = jdbcTemplateObject.update(SQL, params, types);
			System.out.println(rows + " row(s) deleted.");
		}

		@Override
		public List<SnippetVO> getSnippetByBoardId(int boardId) {
			String SQL = "SELECT * from `snippet`.`snippet` WHERE `board_id` = ?";
			List<SnippetVO> snippet =  jdbcTemplateObject.query(SQL, 
					new Object[]{ boardId }, new SnippetMapper());
			
			if(snippet!=null && snippet.size()>0){
				return snippet;
			}
			else 
				return null;
		}

}
