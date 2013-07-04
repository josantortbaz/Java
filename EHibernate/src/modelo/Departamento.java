/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author JAOrtiz
 */

public class Departamento implements Serializable {
    long id;
    String nombre;
    String area;

    public Departamento() {
    }

    public Departamento(String nombre, String area) {
        this.nombre = nombre;
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
