package com.example.tp.dao;

import com.example.tp.bean.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
//code etatcontrat:liste contrat
import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ContratDao extends JpaRepository<Contrat,Long> {
    Contrat findByRef(String reference);
    int deleteByReference(String reference);
    List<Contrat> findByRefLikeAndMontantGreaterThan(String reference, BigDecimal montant);
    @Query("SELECT c FROM Contrat c WHERE c.montant>= :mt")
    List<Contrat> findByMontantsup(@Param("mt") BigDecimal montant);
   int  deleteByNotaireRef(String reference);


    /*List<Contrat>  findByCodeTypeContrat(String codeTypeContrat);*/
   /* List<Contrat>findByCodeEtatContrat(String codeEtatContrat);*/

}
