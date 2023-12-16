package com.user;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

    private final SqlSessionTemplate sqlSession;

    @Autowired
    public UserDAO(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public UserVO getUser(UserVO vo) {
        return sqlSession.selectOne("getUser", vo);
    }
}