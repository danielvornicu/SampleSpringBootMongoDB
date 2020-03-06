package tech.dev.domain;

/**
 * Classe Adresse
 * <p>
 * Date: 03/03/2020
 *
 * @author d.vornicu
 * @version 1.0 $Revision$ $Date$
 */

public class Adresse {
    private String id;
    private String ligne1;
    private String ligne2;
    private Integer codePostal;
    private String ville;

    public Adresse() {
    }

    public Adresse(String ligne1, String ligne2, Integer codePostal, String ville) {
        this.ligne1 = ligne1;
        this.ligne2 = ligne2;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public String getId() {
        return id;
    }

    public String getLigne1() {
        return ligne1;
    }

    public String getLigne2() {
        return ligne2;
    }

    public Integer getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }
}
