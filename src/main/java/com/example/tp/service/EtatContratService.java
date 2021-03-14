package com.example.tp.service;

import com.example.tp.bean.EtatContrat;
import com.example.tp.dao.EtatContratDao;
import com.example.tp.vo.EtatContratVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class EtatContratService {
    public List search(EtatContratVo etatContratVo){
        String query= "select e from EtatContrat e where 1=1";
             if (etatContratVo.getCode()!=null)
                 query+= " And e.code like '%" + etatContratVo.getCode()+"'%";
             if (etatContratVo.getNumeroOrdreMin()!=null)
                 query+= " And e.numeroOrdre>=" + etatContratVo.getNumeroOrdreMin();
             if (etatContratVo.getNumeroOrdreMax()!=null)
                 query+= " And e.numeroOrdre<=" + etatContratVo.getNumeroOrdreMax();
              return entityManager.createQuery(query).getResultList();


    }


    public List<EtatContrat> findByNumeroOrdre(int numeroOrdre) {
        return etatContratDao.findByNumeroOrdre(numeroOrdre);
    }

    public EtatContrat findByCode(String code) {
        return etatContratDao.findByCode(code);
    }
    public EtatContrat findByLibelle(String libelle) {
        return etatContratDao.findByCode(libelle);
    }

    public List<EtatContrat> findAll() {
        return etatContratDao.findAll();
    }

    public int save(EtatContrat etatContrat) {
        if (findByCode(etatContrat.getCode())!= null) {
            return -1;
        }
        else if (findByLibelle(etatContrat.getLibelle())!= null){
            return -2;
        }
        else {
            etatContratDao.save(etatContrat);
            return 1;
        }
    }




    @Autowired
    private EtatContratDao etatContratDao;
    @Autowired
    private EntityManager entityManager;
}
