package com.example.tp.ws;

import com.example.tp.bean.ClauseContrat;
import com.example.tp.dao.ClauseContratDao;
import com.example.tp.service.ClauseContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("gestion d'un cabinet d'un notaire/clause contrat")
public class ClauseContratWs {
    @Autowired
    private ClauseContratService clauseContratService;

    @GetMapping("/id/{idClause}/libelle/{libclause}")
    public List<ClauseContrat> findByIdClauseLikeAndLibClause(@PathVariable int idClause, @PathVariable String libClause) {
        return clauseContratService.findByIdClauseLikeAndLibClause(idClause, libClause);
    }
    @Transactional
    @DeleteMapping("/id/{idClause}")
    public ClauseContrat deleteByIdClause(int idClause) {
        return clauseContratService.deleteByIdClause(idClause);
    }
    @GetMapping("/libelle/{libClause}")
    public ClauseContrat findByLibClause(String libClause) {
        return clauseContratService.findByLibClause(libClause);
    }
    @PostMapping("/")
    public int save(ClauseContrat clauseContrat) {
        return clauseContratService.save(clauseContrat);
    }
    @PutMapping("/")
    public int créer(@RequestBody ClauseContrat clauseContrat) {
        return clauseContratService.créer(clauseContrat);
    }
    @PutMapping("/Libelle/{libelle}/Description/{des")
    public int modifier(@RequestBody ClauseContrat clauseContrat,@PathVariable String libelle, @PathVariable String descrip) {
        return clauseContratService.modifier(clauseContrat, libelle, descrip);
    }
}


