package modelo;

/**
 * Document   : Empleado
 * Created on : 15-jun-2013, 16:48:51
 * Author     : JAOrtiz
 */
public class Empleado extends Persona {

	private String codigo, direccion;
	private double salario;

	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

        public String getDireccion () {
            return this.direccion;
        }
        
        public void setDireccion (String direccion) {
            this.direccion = direccion;
        }
        
	public Empleado(String cod) {
            codigo = cod;
	}
        
        public Empleado() {            
	}

	public Empleado(java.lang.String cod, java.lang.String nom,
			java.lang.String ape, java.sql.Date fecha, double sal,
                        String dire) {
		codigo = cod;
		super.nombre = nom;
		super.apellido = ape;
		super.fechaNacimiento = fecha;
		salario = sal;
                direccion = dire;
	}
}