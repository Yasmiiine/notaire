package com.example.tp.dao;

import com.example.tp.bean.Notaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotaireDao extends JpaRepository<Notaire, Long> {
     Notaire findByReference(String ref);
     List<Notaire> findByReferenceLikeAndNomLike(String ref, String nom);
     List<Notaire>findByPassWordLike(String passWord);
      int deleteByReference(String reference);
}

