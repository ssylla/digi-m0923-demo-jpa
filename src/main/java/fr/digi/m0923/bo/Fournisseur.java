package fr.digi.m0923.bo;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "FOURNISSEUR")
public class Fournisseur extends Client{
    @Column(name="NOM")
    private String raisonSociale;
    @Transient
    private String siret;

    @OneToMany(mappedBy = "fournisseur")
    private Set<Article> articles;

    public Fournisseur() {}

    public Fournisseur(String raisonSociale, String siret) {
        this.raisonSociale = raisonSociale;
        this.siret = siret;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fournisseur{");
        sb.append("id=").append(id);
        sb.append(", raisonSociale='").append(raisonSociale).append('\'');
        sb.append(", siret='").append(siret).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
