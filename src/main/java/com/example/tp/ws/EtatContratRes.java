package com.example.tp.ws;

import com.example.tp.bean.EtatContrat;
import com.example.tp.service.EtatContratService;
import com.example.tp.vo.EtatContratVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*@RequestMapping permet d'indiquer le mapping d'URL pour lequel le contrôleur
ou la méthode doit répondre :
value : définit l'URL à traiter ;
method : définit le type de la requête, GET dans ce cas.
@PathVariable permet de spécifier une valeur en dehors de l'URL (ex. : id) et
de l'assigner aux paramètres de la méthode.*/
@RestController
/*@RestController indique que les données renvoyées par chaque méthode seront écrites
directement dans le corps de la réponse au lieu de restituer un modèle
 */
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

    @PostMapping("/recherche-multicritere")
    public List search(@RequestBody EtatContratVo etatContratVo) {
        return etatContratService.search(etatContratVo);
    }

    @Autowired
    private EtatContratService etatContratService;



}
