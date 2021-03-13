package com.example.tp.dao;

import com.example.tp.bean.TypeContrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeContratDao extends JpaRepository<TypeContrat,Long> {

    TypeContrat findByCode(String code);
    TypeContrat deleteByCode(String code);
    TypeContrat findByDescription(String description);
    TypeContrat deleteByDescription(String description);
    TypeContrat findByHonoraireMinGreaterThanEqual(double honoraireMin);
    TypeContrat findByChargeMinLessThan(double chargeMin);

}
