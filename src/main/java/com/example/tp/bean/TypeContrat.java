package com.example.tp.bean;


import javax.persistence.*;
import java.util.List;

@Entity
public class TypeContrat {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String description;
    private double honoraireMin;
    private double chargeMin;
    @OneToMany(mappedBy = "typeContrat")
    private List<Contrat> contrat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getHonoraireMin() {
        return honoraireMin;
    }

    public void setHonoraireMin(double honoraireMin) {
        this.honoraireMin = honoraireMin;
    }

    public double getChargeMin() {
        return chargeMin;
    }

    public void setChargeMin(double chargeMin) {
        this.chargeMin = chargeMin;
    }
}
