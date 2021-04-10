package com.example.tp.service;

import com.example.tp.bean.ClauseContrat;
import com.example.tp.dao.ClauseContratDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClauseContratService {
    @Autowired
    private ClauseContratDao clauseContratDao;

    public List<ClauseContrat> findByIdClauseLikeAndLibClause(int idClause, String libClause) {
        return clauseContratDao.findByIdClauseLikeAndLibClause(idClause, libClause);
    }

    public ClauseContrat deleteByIdClause(int idClause) {
        return clauseContratDao.deleteByIdClause(idClause);
    }

    public ClauseContrat findByLibClause(String libClause) {
        return clauseContratDao.findByLibClause(libClause);
    }

    public int save(ClauseContrat clauseContrat) {
        if (findByLibClause(clauseContrat.getLibClause()) != null) {
            return -1;
        } else {
            clauseContratDao.save(clauseContrat);
            return 1;
        }
    }

    public int modifier(ClauseContrat clauseContrat,String libelle, String descrip) {
        // on teste si clause contrat existe deja pour le modifier
     if(findByLibClause(clauseContrat.getLibClause())!=null){
         clauseContrat.setLibClause(libelle);
         clauseContrat.setDescription(descrip);
         clauseContratDao.save(clauseContrat);
         return 1;
     }else{
         return -1;
     }
     }
    public int créer(ClauseContrat clauseContrat){
        if(findByLibClause(clauseContrat.getLibClause())!=null){
            return -1;
        }else{
            ClauseContrat clauseContrat1=new ClauseContrat();
            return 1;
        }

    }


}