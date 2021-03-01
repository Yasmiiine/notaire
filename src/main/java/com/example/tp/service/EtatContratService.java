package com.example.tp.service;

import com.example.tp.bean.EtatContrat;
import com.example.tp.dao.EtatContratDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtatContratService {
    public List<EtatContrat> findByNumeroOrdre(int numeroOrdre) {
        return etatContratDao.findByNumeroOrdre(numeroOrdre);
    }

    public EtatContrat findByCode(String code) {
        return etatContratDao.findByCode(code);
    }

    public List<EtatContrat> findAll() {
        return etatContratDao.findAll();
    }

    public int save(EtatContrat etatContrat) {
        if (findByCode(etatContrat.getCode())!= null) {
            return -1;
        }
        else {
            etatContratDao.save(etatContrat);
            return 1;
        }
    }



    @Autowired
    private EtatContratDao etatContratDao;
}
