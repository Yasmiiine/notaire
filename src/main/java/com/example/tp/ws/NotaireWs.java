package com.example.tp.ws;

import com.example.tp.bean.Notaire;
import com.example.tp.service.NotaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("gestion-cabinet-notaire/notaire1")
public class NotaireWs {
    @GetMapping("/ref/{ref}")
    public Notaire findByReference(@PathVariable String ref) {
        return notaireService.findByReference(ref);
    }
    @GetMapping("/ref/{ref}/nom/{nom}")
    public List<Notaire> findByReferenceLikeAndNomLike(@PathVariable String ref,@PathVariable String nom) {
        return notaireService.findByReferenceLikeAndNomLike(ref, nom);
    }
    @GetMapping("/passWord/{passWord}")
    public List<Notaire> findByPassWordLike(@PathVariable String passWord) {
        return notaireService.findByPassWordLike(passWord);
    }
    @GetMapping("/")
    public List<Notaire> findAll() {
        return notaireService.findAll();
    }
    @PostMapping("/")
    public int save( @RequestBody Notaire notaire) {
        return notaireService.save(notaire);
    }
    @DeleteMapping("/reference/{reference}")
    int deleteByRef( @PathVariable String reference){
        return notaireService.deleteByRef(reference);
    }
    @Autowired
    private NotaireService notaireService;
}
