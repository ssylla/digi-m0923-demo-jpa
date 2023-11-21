package fr.digi.m0923.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name = "PARTICULIER")
public class Particulier extends Client {

    @Column(name = "NOM_CLIENT", length = 25, nullable = false)
    protected String nom;
    @Column(name = "PRENOM_CLIENT", length = 25, nullable = false)
    protected String prenom;

    public Particulier() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Particulier{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
