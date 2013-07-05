/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author josea
 */
public class Direccion implements Serializable {
    private long id;
    private String calle;
    private String codigoPostal;

    public Direccion() {
    }

    public long getId() {
        return id;
    }

    public String getCalle() {
        return calle;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
}
