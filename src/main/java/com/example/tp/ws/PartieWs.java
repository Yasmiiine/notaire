package com.example.tp.ws;

import com.example.tp.bean.Partie;
import com.example.tp.service.PartieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("gestion-notaire/partie")
public class PartieWs {

    @Autowired
    private PartieService partieService;

    @GetMapping("/libelle/{libelle}")
    public Partie findByLibelle(String libelle) {
        return partieService.findByLibelle(libelle);
    }

    @GetMapping("/nom/{nom}/prenom/{prenom}")
    public List<Partie> findByNomLikeAndPrenomLike(String nom, String prenom) {
        return partieService.findByNomLikeAndPrenomLike(nom, prenom);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(String libelle) {
        return partieService.deleteByLibelle(libelle);
    }

    @GetMapping("/")
    public List<Partie> findAll() {
        return partieService.findAll();
    }

    @GetMapping("/id/{id}")
    public Partie getOne(Long aLong) {
        return partieService.getOne(aLong);
    }

    @PostMapping("/")
    public int save(Partie partie) {
        return partieService.save(partie);
    }
}
