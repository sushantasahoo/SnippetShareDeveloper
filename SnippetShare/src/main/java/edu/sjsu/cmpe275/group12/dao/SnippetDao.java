package edu.sjsu.cmpe275.group12.dao;

import edu.sjsu.cmpe275.group12.model.SnippetVO;

public interface SnippetDao {

	public void createSnippet(SnippetVO snippet);
	public void updateSnippet(SnippetVO snippet);
	public SnippetVO getSnippet(long snippetId);
	public void deleteSnippet(long snippetId);
}
