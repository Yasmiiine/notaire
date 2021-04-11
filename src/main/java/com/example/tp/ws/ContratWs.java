package com.example.tp.ws;

import com.example.tp.bean.Contrat;
import com.example.tp.bean.TypeContrat;
import com.example.tp.service.ContratService;
import com.example.tp.vo.ContratVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;
import java.util.Stack;

@RestController
@RequestMapping("gestion-contrat/contrat")
public class ContratWs {
    @GetMapping("/ref/{reference}")
    public Contrat findByRef(@PathVariable String reference) {
        return contratservice.findByRef(reference);
    }

    @Transactional
    public int deleteByRef(String reference) {
        return contratservice.deleteByRef(reference);
    }
    @GetMapping("/ref/{reference}/mt/{montant}")
    public List<Contrat> findByReflikeAndGreaterthanMontant( @PathVariable String reference,@PathVariable BigDecimal montant) {

        return contratservice.findByReflikeAndMontantGreaterthan(reference, montant);
    }
    @GetMapping("/")
    public List<Contrat> findAll() {
        return  contratservice.findAll();
    }
   @PostMapping("/")
    public int save(@RequestBody Contrat contrat) {
        return contratservice.save(contrat);
    }
    @GetMapping("/montant-greater_than/{montant}")
    public List<Contrat> findByMontantsup(@PathVariable BigDecimal montant) {
        return contratservice.findByMontantsup(montant);
    }

   @PostMapping("/search")
    public List<Contrat> search(@RequestBody ContratVO contratVo) {
        return contratservice.search(contratVo);
    }

    /*@GetMapping("/codeTypeContrat/codeTypeContrat")
    public List<Contrat> findByCodeTypeContrat(@PathVariable String codeTypeContrat) {
        return contratservice.findByCodeTypeContrat(codeTypeContrat);
    }

    public boolean test(String codeTypeContrat, TypeContrat typeContrat) {
        return contratservice.test(codeTypeContrat, typeContrat);
    }*/
    @GetMapping("/ref/{reference}")
    public List<Contrat> findByNotaireReference( @PathVariable String reference) {
        return contratservice.findByNotaireReference(reference);
    }
    @PostMapping("/")
    public int saveContratsNotaire( @RequestBody  Contrat contrat) {
        return contratservice.saveContratsNotaire(contrat);
    }

    @Autowired
    private ContratService contratservice;
}
