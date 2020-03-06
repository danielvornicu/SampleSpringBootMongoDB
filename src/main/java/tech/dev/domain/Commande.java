package tech.dev.domain;

import java.util.Date;

/**
 * Classe Commande
 * <p>
 * Date: 03/03/2020
 *
 * @author d.vornicu
 * @version 1.0 $Revision$ $Date$
 */

public class Commande {
    private String id;
    private Integer nombreProduits;
    private Long montant;
    private Date date;

    public Commande() {
    }

    public Commande(Integer nombreProduits, Long montant, Date date) {
        this.nombreProduits = nombreProduits;
        this.montant = montant;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public Integer getNombreProduits() {
        return nombreProduits;
    }

    public Long getMontant() {
        return montant;
    }

    public Date getDate() {
        return date;
    }
}
