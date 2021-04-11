package com.example.tp.dao;

import com.example.tp.bean.Partie;
import com.example.tp.bean.TypeContrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartieDao extends JpaRepository<Partie,Long> {
    Partie findByLibelle(String libelle);
    List<Partie> findByNomLikeAndPrenomLike(String nom, String prenom);
    int deleteByLibelle(String libelle);

}
