package com.example.tp.service;

import com.example.tp.bean.TypeContrat;
import com.example.tp.dao.TypeContratDao;
import com.example.tp.vo.TypeContratVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class TypeContratService {

    public TypeContrat findByCode(String code) {
        return typeContratDao.findByCode(code);
    }

    @Transactional
    public TypeContrat deleteByCode(String code) {
        return typeContratDao.deleteByCode(code);
    }

    public TypeContrat findByDescription(String description) {
        return typeContratDao.findByDescription(description);
    }

    @Transactional
    public TypeContrat deleteByDescription(String description) {
        return typeContratDao.deleteByDescription(description);
    }

    public TypeContrat findByHonoraireMinGreaterThan(double honoraireMin) {
        return typeContratDao.findByHonoraireMinGreaterThanEqual(honoraireMin);
    }

    public TypeContrat findByChargeMinGreaterThan(double chargeMin) {
        return typeContratDao.findByChargeMinLessThan(chargeMin);
    }

    public List<TypeContrat> findAll() {
        return typeContratDao.findAll();
    }

    public TypeContrat getOne(Long aLong) {
        return typeContratDao.getOne(aLong);
    }


    public int save(TypeContrat typeContrat) {
        if(findByCode(typeContrat.getCode())!=null) {
            return -1;
        }else{
            typeContratDao.save(typeContrat);
            return 1;
        }
    }

    public int setChargeMin(String code,double nvcharge)
    {
        TypeContrat contrat=findByCode(code);
        if(contrat==null){
            return -1;
        }else{
            contrat.setChargeMin(nvcharge);
            return 1;
        }
    }

  /*  public List<TypeContrat> search(TypeContratVO tcVO){

        String query= " select t from TypeContrat t where 1=1";
        if(tcVO.getCode()!=null)
            query+=" AND t.code like '%" +tcVO.getCode()+"'%";
        if(tcVO.getChargeMinMin()!=null)
            query+=" AND t.chargeMin>="+tcVO.getChargeMinMin();
        if(tcVO.getChargeMinMax()!=null)
            query+=" AND t.chargeMin<="+tcVO.getChargeMinMax();

        return entityManager.createQuery(query).getResultList();

    }*/


    @Autowired
    private TypeContratDao typeContratDao;
    @Autowired
    private EntityManager entityManager;
}
