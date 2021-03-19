package com.example.tp.ws;
import com.example.tp.bean.TypeContrat;
import com.example.tp.service.TypeContratService;
import com.example.tp.vo.TypeContratVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestion-notaire/type-contrat")
public class TypeContratProvided {

    @GetMapping("/code/{code}")
    public TypeContrat findByCode(@PathVariable String code) {
        return typeContratService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    public TypeContrat deleteByCode(@PathVariable String code) {
        return typeContratService.deleteByCode(code);
    }

    @GetMapping("/description/{description}")
    public TypeContrat findByDescription(@PathVariable String description) {
        return typeContratService.findByDescription(description);
    }

    @DeleteMapping("/description/{description}")
    public TypeContrat deleteByDescription(@PathVariable String description) {
        return typeContratService.deleteByDescription(description);
    }


    @GetMapping("/honoraireMin/{honoraireMin}")
    public TypeContrat findByHonoraireMinGreaterThan(@PathVariable double honoraireMin) {
        return typeContratService.findByHonoraireMinGreaterThan(honoraireMin);
    }

    @GetMapping("/chargeMin/{chargeMin}")
    public TypeContrat findByChargeMinGreaterThan(@PathVariable double chargeMin) {
        return typeContratService.findByChargeMinGreaterThan(chargeMin);
    }

    @GetMapping("/")
    public List<TypeContrat> findAll() {
        return typeContratService.findAll();
    }

    @GetMapping("/id/{id}")
    public TypeContrat getOne(@PathVariable Long id) {
        return typeContratService.getOne(id);
    }

    @PostMapping("/")
    public int save(@RequestBody TypeContrat typeContrat) {
        return typeContratService.save(typeContrat);
    }

    @PutMapping("/setChargeMin/code/{code}/nvcharge/{nvcharge}")
    public int setChargeMin(@PathVariable String code, double nvcharge) {
        return typeContratService.setChargeMin(code, nvcharge);
    }

    @PostMapping("/search")
    public List<TypeContrat> search(@PathVariable TypeContratVO tcVO) {
        return typeContratService.search(tcVO);
    }

    @Autowired
    private TypeContratService typeContratService;

}
