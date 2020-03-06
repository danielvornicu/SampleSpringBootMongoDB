package tech.dev.to;

import tech.dev.commons.to.base.TransferObject;

import java.io.Serializable;

/**
 * Description de la classe
 * <p>
 * Date: 04/03/2020
 *
 * @author d.vornicu
 * @version 1.0 $Revision$ $Date$
 */

public class ClientTO extends TransferObject implements Serializable {

    private String id;

    //@NotEmpty(message = "{client.validation.prenom.empty}")
    private String prenom;

    //@NotEmpty(message = "{client.validation.nom.empty}")
    private String nom;

    public ClientTO() {
        this.id = "";
    }

    public String getId() {
        return id;
    }

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

    @Override
    public String toString() {
        return "Client [" +
                "id=" + this.getId() + ", " +
                "prenom='" + this.getPrenom()+ "', " +
                "nom='" + this.getNom() +
                ']';
    }
}
