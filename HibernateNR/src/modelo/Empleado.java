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
    
    private String codigo, nombre, apellido;
    private java.sql.Date fecha_nacimiento;
    private double salario;
    
    public Empleado () {
    }
    
    public Empleado (String c, String n, String a, Date f, double s) {
        codigo = c;
        nombre = n;
        apellido = a;
        fecha_nacimiento = f;
        salario = s;
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

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public double getSalario() {
        return salario;
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

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
