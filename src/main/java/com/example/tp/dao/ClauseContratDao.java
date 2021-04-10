package com.example.tp.dao;

import com.example.tp.bean.ClauseContrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClauseContratDao extends JpaRepository<ClauseContrat,Long> {
    public List<ClauseContrat> findByIdClauseLikeAndLibClause(int idClause, String libClause);
    public ClauseContrat deleteByIdClause(int idClause);
    public ClauseContrat findByLibClause(String libClause);
}
