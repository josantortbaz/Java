package modelo;

/**
 * Document   : Persona
 * Created on : 15-jun-2013, 16:48:03
 * Author     : JAOrtiz
 */
public class Persona {

    protected String nombre;
    protected String apellido;
    protected java.sql.Date fechaNacimiento;

    public Persona() {
    }

    public Persona(java.lang.String nom, java.lang.String ape, java.sql.Date fecha) {
        nombre = nom;
        apellido = ape;
        this.fechaNacimiento = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public java.sql.Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(java.sql.Date fec) {
        this.fechaNacimiento = fec;
    }
}
