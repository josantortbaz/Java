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
public class Persona implements Serializable {
    private long id;
    private String nombre;
    private Direccion direccion;

    public Persona() {
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
}
