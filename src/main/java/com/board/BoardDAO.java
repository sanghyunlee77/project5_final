package com.board;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class BoardDAO {

    JdbcTemplate jdbcTemplate;

    @Autowired
    SqlSession sqlSession;

    public int insertBoard(BoardVO vo) {
        int result = sqlSession.insert("Board.insertBoard", vo);
        return result;
    }

    // 글 삭제
    public int deleteBoard(int seq) {
        String sql = "DELETE FROM PETDATA WHERE seq = ?";
        return jdbcTemplate.update(sql, seq);
    }

    public int updateBoard(BoardVO vo) {
        String sql = "UPDATE PETDATA SET "
                + "mname = ?, "
                + "fname = ?, "
                + "picture = ?, "
                + "kind = ?, "
                + "pnumber = ?, "
                + "comeday = ?, "
                + "byeday = ?, "
                + "regdate = ?, "
                + "contents = ? "
                + "WHERE seq = ?";  // Assuming 'seq' is the primary key

        return jdbcTemplate.update(sql,
                vo.getMname(),
                vo.getFname(),
                vo.getPicture(),
                vo.getKind(),
                vo.getPnumber(),
                vo.getComeday(),
                vo.getByeday(),
                vo.getRegdate(),
                vo.getContents(),
                vo.getSeq()
        );
    }

    public List<BoardVO> getBoardList() {
        return sqlSession.selectList("Board.getBoardList");
    }

    public BoardVO getBoard(int seq) {
        return sqlSession.selectOne("Board.getBoard", seq);
    }

    class BoardRowMapper implements RowMapper<BoardVO> {

        @Override
        public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
            BoardVO vo = new BoardVO();
            vo.setSeq(rs.getInt("seq"));
            vo.setMname(rs.getString("mname"));
            vo.setFname(rs.getString("fname"));
            vo.setPicture(rs.getString("picture"));
            vo.setKind(rs.getString("kind"));
            vo.setPnumber(rs.getString("pnumber"));
            vo.setComeday(rs.getString("comeday"));
            vo.setByeday(rs.getString("byeday"));
            vo.setRegdate(rs.getTimestamp("regdate")); // Use getTimestamp directly
            vo.setContents(rs.getString("contents"));
            return vo;
        }
    }
}
