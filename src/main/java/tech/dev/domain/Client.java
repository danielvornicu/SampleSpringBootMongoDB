package tech.dev.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Client
 * <p>
 * Date: 03/03/2020
 *
 * @author d.vornicu
 * @version 1.0 $Revision$ $Date$
 */
@Document(collection = "Clients")
public class Client extends Doc {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    //@Indexed(direction = IndexDirection.ASCENDING)
    private String prenom;

    private String nom;
    private Adresse adresse;
    private List<Commande> commandes;

    public Client() {
        this.commandes = new ArrayList<>();
    }

    public Client(String prenom, String nom, Adresse adresse) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
    }

    public Client(String prenom, String nom, Adresse adresse, List<Commande> commandes) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.commandes = commandes;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    @Override
    public String toString() {
        return "Client [" +
                "id=" + this.getId() + ", " +
                "prenom='" + this.getPrenom()+ "', " +
                "nom='" + this.getNom() + "', " +
                "adresse=" + this.getAdresse() + ", " +
                "commandes=" + this.getCommandes() +
                ']';
    }

}
