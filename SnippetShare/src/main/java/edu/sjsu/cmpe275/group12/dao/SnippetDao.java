package edu.sjsu.cmpe275.group12.dao;

import java.util.List;

import edu.sjsu.cmpe275.group12.model.SnippetVO;

public interface SnippetDao {

	public boolean createSnippet(SnippetVO snippet);
	public void updateSnippet(SnippetVO snippet);
	public SnippetVO getSnippet(int snippetId);
	public void deleteSnippet(int snippetId);
	public List<SnippetVO> getSnippetByBoardId(int boardId);
}
