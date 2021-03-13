package com.example.tp.service;
import com.example.tp.bean.Contrat;
import com.example.tp.dao.ContratDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class ContratService {
    public Contrat findByRef(String reference) {
        return contratdao.findByReference(reference);
    }
    @Transactional
    public int deleteByRef(String reference) {
        return contratdao.deleteByReference(reference);
    }

    public List<Contrat> findByReflikeAndMontantGreaterthan(String reference, double montant) {
        return contratdao.findByReferenceLikeAndMontantGreaterThan(reference, montant);
    }

    public List<Contrat> findAll() {
        return contratdao.findAll();
    }

    public  int  save(Contrat contrat) {
        if(findByRef(contrat.getReference()) != null){
            return -1;
        }else {
            contratdao.save(contrat);
            return 1;
        }
    }


   /* public List<Contrat> search(ContratVO contratvo){
       String query="select c from Contrat c where 1=1 ";
                if(contratvo.getReference()!=null)
                    query+=" And c.reference Like'% "+contratvo.getReference()+"'%" ;
                if(contratvo.getMtMin()!=null)
                    query+=" And c.montant>="+contratvo.getMtMin();
                if(contratvo.getMtMax()!=null)
                    query+=" And c.montant<="+contratvo.getMtMax();
                return EntityManager.createQuery(query).getResultList();

    }*/

    @Autowired
    private ContratDao contratdao;

}