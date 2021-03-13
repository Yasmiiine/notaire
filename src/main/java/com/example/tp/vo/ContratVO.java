package com.example.tp.vo;

public class ContratVO {
    private long id;
    private String reference;
    private String codeTypeContrat;
    private String codeEtatContrat;
    private Double mtMin;
    private Double mtMax;

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

    public String getCodeTypeContrat() {
        return codeTypeContrat;
    }

    public void setCodeTypeContrat(String codeTypeContrat) {
        this.codeTypeContrat = codeTypeContrat;
    }

    public String getCodeEtatContrat() {
        return codeEtatContrat;
    }

    public void setCodeEtatContrat(String codeEtatContrat) {
        this.codeEtatContrat = codeEtatContrat;
    }

    public Double getMtMin() {
        return mtMin;
    }

    public void setMtMin(Double mtMin) {
        this.mtMin = mtMin;
    }

    public Double getMtMax() {
        return mtMax;
    }

    public void setMtMax(Double mtMax) {
        this.mtMax = mtMax;
    }
}
