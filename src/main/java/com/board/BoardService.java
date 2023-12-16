package com.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// BoardService.java
public interface BoardService {
    List<BoardVO> getBoardList();
    int insertBoard(BoardVO vo);
    int updateBoard(BoardVO vo);
    int deleteBoard(int seq);
    BoardVO getBoard(int seq);
}
