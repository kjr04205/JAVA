package com.fastcampus.ch4.dao;

import java.util.List;
import com.fastcampus.ch4.domain.CommentDto;

public interface CommentDao {
	int count(Integer bno) throws Exception;

	int deleteAll(Integer bno);

	int delete(Integer cno, String commenter) throws Exception;

	int insert(CommentDto dto) throws Exception;

	List<CommentDto> selectAll(Integer bno) throws Exception;

	CommentDto select(Integer cno) throws Exception;

	int update(CommentDto dto) throws Exception;
}
