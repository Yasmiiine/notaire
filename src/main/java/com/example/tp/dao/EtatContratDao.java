package com.example.tp.dao;

import com.example.tp.bean.EtatContrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/*Annoter la classe par @Repository pour indiquer à Spring que
 la classe doit être ajoutée au contexte comme étant un Bean de type repository.*/
import java.util.List;
@Repository
public interface EtatContratDao extends JpaRepository<EtatContrat, Long> {
    public List<EtatContrat> findByNumeroOrdre(int numeroOrdre);
// list permet de sauvegarder les objets de etat contrat
    public EtatContrat findByCode(String code);
    public EtatContrat findByLibelle(String libelle);

}
