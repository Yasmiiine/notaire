package com.example.tp.service;
import com.example.tp.bean.Contrat;
import com.example.tp.bean.TypeContrat;
import com.example.tp.dao.ContratDao;
import com.example.tp.vo.ContratVO;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
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

    /*public  int  save(Contrat contrat) {
        if(findByRef(contrat.getReference()) != null){
            return -1;
        }else {
            contratdao.save(contrat);
            return 1;
        }
    }*/
    public int save(Contrat contrat){
        if(findByRef(contrat.getReference())!=null){
            return -1;
        }
        TypeContrat typeContrat= typeContratService.findByCode(contrat.getTypeContrat().getCode());
        contrat.setTypeContrat(typeContrat);
        if(typeContrat==null){
            return -2;
        }else if(contrat.getcodeTypeContrat()!=typeContrat.getCode()){
            return -3;
        }else{
            typeContratService.save(typeContrat);
            contratdao.save(contrat);
            return 1;
        }
    }

    public List<Contrat> search(ContratVO contratVo) {
        String query = "SELECT c FROM Contrat c WHERE 1=1";
        if (contratVo.getReference() != null)
            query += " AND c.reference Like '%" + contratVo.getReference() + "%'";
        if (contratVo.getMontantMin() != null)
            query += " AND c.montant>=" + contratVo.getMontantMin();
        if (contratVo.getMontantMax() != null)
            query += " AND c.montant<=" + contratVo.getMontantMax();
        return entityManager.createQuery(query).getResultList();
    }
    public List<Contrat> findByMontantsup(double montant) {
        return contratdao.findByMontantsup(montant);
    }

    @Autowired
    private ContratDao contratdao;
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private TypeContratService typeContratService;

}