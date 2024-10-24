package com.coma.app.biz.board;

import java.util.List;

public interface BoardService {
	List<BoardDTO> selectAll(BoardDTO boardDTO);
	List<BoardDTO> selectAllSearchMatchId(BoardDTO boardDTO);
	List<BoardDTO> selectAllSearchPatternId(BoardDTO boardDTO);
	List<BoardDTO> selectAllSearchTitle(BoardDTO boardDTO);
	List<BoardDTO> selectAllSearchName(BoardDTO boardDTO);
	List<BoardDTO> selectAllRownum(BoardDTO boardDTO);
	BoardDTO selectOne(BoardDTO boardDTO);
	BoardDTO selectOneWriterId(BoardDTO boardDTO);
	BoardDTO selectOneCount(BoardDTO boardDTO);
	BoardDTO selectOneSearchIdCount(BoardDTO boardDTO);
	BoardDTO selectOneSearchTitleCount(BoardDTO boardDTO);
	BoardDTO selectOneSearchNameCount(BoardDTO boardDTO);
	boolean insert(BoardDTO boardDTO);
	boolean updateContentTitle(BoardDTO boardDTO);
	boolean updateCnt(BoardDTO boardDTO);
	boolean delete(BoardDTO boardDTO);
}