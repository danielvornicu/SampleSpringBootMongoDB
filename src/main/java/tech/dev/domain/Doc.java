package tech.dev.domain;

import java.io.Serializable;

/**
 * Description de la classe
 * <p>
 * Date: 04/03/2020
 *
 * @author d.vornicu
 * @version 1.0 $Revision$ $Date$
 */

public abstract class Doc implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
