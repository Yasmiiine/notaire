package com.example.tp.dao;

import com.example.tp.bean.EtatContrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EtatContratDao extends JpaRepository<EtatContrat, Long> {
    public List<EtatContrat> findByNumeroOrdre(int numeroOrdre);

    public EtatContrat findByCode(String code);

}
