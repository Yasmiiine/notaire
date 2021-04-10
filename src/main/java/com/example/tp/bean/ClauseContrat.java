package com.example.tp.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ClauseContrat {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String libClause;
        private int idClause;
        private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibClause() {
        return libClause;
    }

    public void setLibClause(String libClause) {
        this.libClause = libClause;
    }

    public int getIdClause() {
        return idClause;
    }

    public void setIdClause(int idClause) {
        this.idClause = idClause;
    }


}
