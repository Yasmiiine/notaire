package com.example.tp.ws;

import com.example.tp.bean.EtatContrat;
import com.example.tp.service.EtatContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestion d'un cabinet d'un notaire/etatContrat")
public class EtatContratRes {
    @GetMapping("/Numero/numordre")
    public List<EtatContrat> findByNumero(@PathVariable int numeroOrdre) {
        return etatContratService.findByNumeroOrdre(numeroOrdre);
    }
    @GetMapping("/Code/code")
    public EtatContrat findByCodeContrat( String code) {
        return etatContratService.findByCode(code);
    }
    @GetMapping("/")
    public List<EtatContrat> findAll() {
        return etatContratService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody EtatContrat etatContrat) {
        return etatContratService.save(etatContrat);
    }

    @Autowired
    private EtatContratService etatContratService;



}
