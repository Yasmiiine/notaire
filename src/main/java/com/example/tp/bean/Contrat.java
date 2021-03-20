package com.example.tp.bean;

import javax.persistence.*;

@Entity
public class Contrat {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String reference;
    private String codeTypeContrat;
    private String codeEtatContrat;
    private double montant;

    public TypeContrat getTypeContrat() {
        return typeContrat;
    }

    public void setTypeContrat(TypeContrat typeContrat) {
        this.typeContrat = typeContrat;
    }

    @ManyToOne
    private TypeContrat typeContrat;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getcodeTypeContrat() {
        return codeTypeContrat;
    }

    public void setcodeTypeContrat(String idcodeTypeContrat) {
        this.codeTypeContrat = idcodeTypeContrat;
    }

    public String getCodeEtatContrat() {
        return codeEtatContrat;
    }

    public void setCodeEtatContrat(String codeEtatContrat) {
        this.codeEtatContrat = codeEtatContrat;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}