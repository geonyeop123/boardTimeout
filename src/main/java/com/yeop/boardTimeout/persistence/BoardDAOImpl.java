package com.yeop.boardTimeout.persistence;

import com.yeop.boardTimeout.domain.BoardDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardDAOImpl implements BoardDAO {

    @Autowired
    SqlSession session;

    private final static String namespace =
            "com.yeop.boardTimeout.mappers.BoardMapper.";

    @Override
    public int create(BoardDTO dto) throws Exception{
        return session.insert(namespace + "create", dto);
    }

    @Override
    public BoardDTO read(Integer bno) throws Exception{
        return session.selectOne(namespace + "read");
    }

    @Override
    public int update(BoardDTO dto) throws Exception{
        return session.update(namespace + "update", dto);
    }

    @Override
    public int delete(Integer bno) throws Exception{
        return session.update(namespace + "delete", bno);
    }
}
