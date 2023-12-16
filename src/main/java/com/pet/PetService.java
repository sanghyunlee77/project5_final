package com.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    @Autowired
    PetDAO petDAO;
    public List<PetVO> getPetList(){
        return petDAO.getPetList();
    }
    public PetVO getPet(int seq){
        return petDAO.getPet(seq);
    }
    public int insertPet(PetVO vo){
        return petDAO.insertPet(vo);
    }
    public int deletePet(int seq){
        return petDAO.deletePet(seq);
    }
    public int updatePet(PetVO vo){
        return petDAO.updatePet(vo);
    }
}
