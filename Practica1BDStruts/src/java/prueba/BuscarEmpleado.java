/*
 * Clase para hacer pruebas.
 */
package prueba;

import DAO.EmpleadoDAO;
import modelo.Empleado;

public class BuscarEmpleado {

    public static void main(String[] args) {
        
        String apellido = "Amaya";
        EmpleadoDAO ce = new EmpleadoDAO();
        Empleado le = ce.obtenEmpleado(apellido);        

        System.out.println(
                "CODIGO\tNOMBRE\tAPELLID\tFEC.NAC.\tSALARIO");

        System.out.println(le.getCodigo() + "\t" + le.getCodigo() + "\t" + 
                le.getApellido() + "\t" + le.getFnacimiento() + "\t" + 
                le.getSalario());
    }
}