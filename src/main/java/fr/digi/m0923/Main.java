package fr.digi.m0923;

import fr.digi.m0923.bo.Article;
import fr.digi.m0923.bo.Client;
import fr.digi.m0923.bo.Fournisseur;
import fr.digi.m0923.bo.Particulier;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
            EntityManager em = emf.createEntityManager()) {

            em.getTransaction().begin();
            /*
            //Création d'un nouveau fournisseur
            Fournisseur fournisseurACreer = new Fournisseur("Sebsy Corp.", "12345");
            em.persist(fournisseurACreer);

            //Récupération du fournisseur dont l'id est 3
            Fournisseur fournisseur = em.find(Fournisseur.class, 3);
            System.out.println(fournisseur);

            //Modification du fournisseur dont l'id est 5
            Fournisseur fournisseurAModifier = em.find(Fournisseur.class, 9);
            if (null != fournisseurAModifier) {
                fournisseurAModifier.setRaisonSociale("Diginamic Perols");
            }

            //Suppression du fournisseur dont l'id est 4
            Fournisseur fournisseurASupprimer = em.find(Fournisseur.class, 6);
            if (null != fournisseurASupprimer) {
                em.remove(fournisseurASupprimer);
            }
            */

            Article article = em.find(Article.class, 2);
            System.out.println(article.getFournisseur().getRaisonSociale());


            Client test = new Particulier();
            test.setTelephone("060606");

            em.persist(test);
            em.getTransaction().commit();
        }
    }
}