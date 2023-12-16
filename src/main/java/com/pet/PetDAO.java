package com.pet;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PetDAO {
    @Autowired
    SqlSession sqlSession;

    public int insertPet(PetVO vo){
        int count = sqlSession.insert("Pet.insertPet", vo);
        return count;
    }
    public int deletePet(int seq){
        int count = sqlSession.delete("Pet.deletePet", seq);
        return count;
    }
    public int updatePet(PetVO vo){
        int count = sqlSession.update("Pet.updatePet", vo);
        return count;
    }

    public PetVO getPet(int seq){
        PetVO one = sqlSession.selectOne("Pet.getPet",seq);
        return one;
    }

    public List<PetVO> getPetList(){
        List<PetVO> list = sqlSession.selectList("Pet.getPetList");
        return list;
    }
}
