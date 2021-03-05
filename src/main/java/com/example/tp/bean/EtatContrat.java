package com.example.tp.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// Créer la classe Java pour le modèle Etat contrat, cette classe est une représentation de la table
@Entity
public class EtatContrat {

    @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String code;
        private String libelle;
        private int numeroOrdre;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {

        return libelle;
    }

    public void setLibelle(String libelle) {

        this.libelle = libelle;
    }

    public int getNumeroOrdre() {

        return numeroOrdre;
    }

    public void setNumeroOrdre(int numeroOrdre) {

        this.numeroOrdre = numeroOrdre;
    }

}



































