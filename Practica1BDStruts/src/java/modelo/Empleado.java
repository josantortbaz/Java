/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author josea
 */
public class Empleado {
    
    private String codigo;
    private String nombre;
    private String apellido;
    private Date fnacimiento;
    private float salario;

    public Empleado() {
    }

    public Empleado(String codigo, String nombre, String apellido, Date fec_nacimiento, float salario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fnacimiento = fec_nacimiento;
        this.salario = salario;
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

    public Date getFnacimiento() {
        return fnacimiento;
    }

    public float getSalario() {
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

    public void setFnacimiento(Date fec_nacimiento) {
        this.fnacimiento = fec_nacimiento;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
