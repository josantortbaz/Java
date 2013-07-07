/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author josea
 */
public class Empleado implements Serializable {
    
    private String codigo;
    private String nombre;
    private String apellido;
    private Date fec_nacimiento;
    private float salario;
    private String direccion;

    public Empleado() {
    }

    public Empleado(String codigo, String nombre, String apellido, Date fec_nacimiento, float salario, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fec_nacimiento = fec_nacimiento;
        this.salario = salario;
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFec_nacimiento() {
        return fec_nacimiento;
    }

    public float getSalario() {
        return salario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFec_nacimiento(Date fec_nacimiento) {
        this.fec_nacimiento = fec_nacimiento;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
