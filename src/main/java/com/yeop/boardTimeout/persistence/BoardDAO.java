package com.yeop.boardTimeout.persistence;

import com.yeop.boardTimeout.domain.BoardDTO;

public interface BoardDAO {
    int create(BoardDTO dto) throws Exception;

    BoardDTO read(Integer bno) throws Exception;

    int update(BoardDTO dto) throws Exception;

    int delete(Integer bno) throws Exception;
}
