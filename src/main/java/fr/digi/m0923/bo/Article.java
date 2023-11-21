package fr.digi.m0923.bo;

import jakarta.persistence.*;

@Entity(name = "ARTICLE")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "REF")
    private String ref;
    @Column(name = "DESIGNATION")
    private String libelle;
    @Column(name = "PRIX")
    private Double prix;

    @ManyToOne
    @JoinColumn(name = "ID_FOU")
    private Fournisseur fournisseur;

    public Article() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Article{");
        sb.append("id=").append(id);
        sb.append(", ref='").append(ref).append('\'');
        sb.append(", libelle='").append(libelle).append('\'');
        sb.append(", prix=").append(prix);
        sb.append('}');
        return sb.toString();
    }
}
