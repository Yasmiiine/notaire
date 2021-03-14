package com.example.tp.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// Créer la classe Java pour le modèle Etat contrat, cette classe est une représentation
// de la table
@Entity
//@Entity déclare la classe comme un entity bean
public class EtatContrat {
//@Id déclare la propriété identifiante de cet entity bean
    @Id
    /* @GeneratedValue Cette annotation indique que la clé primaire est
 générée de façon automatique lors de l’insertion en base. Strategy = GenerationType.AUTO :
 La génération de la clé primaire est laissée à l’implémentation.
*/
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
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



































