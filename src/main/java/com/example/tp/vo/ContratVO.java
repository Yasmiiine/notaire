package com.example.tp.vo;

public class ContratVO {
    private long id;
    private String reference;
    private String codeTypeContrat;
    private String codeEtatContrat;
    private String montantMax;
    private String montantMin;
    private String montant;

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

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

    public String getMontantMax() {
        return montantMax;
    }

    public void setMontantMax(String montantMax) {
        this.montantMax = montantMax;
    }

    public String getMontantMin() {
        return montantMin;
    }

    public void setMontantMin(String montantMin) {
        this.montantMin = montantMin;
    }
}
