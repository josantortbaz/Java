/*
 * Clase para hacer pruebas.
 */
package prueba;

import DAO.EmpleadosDAO;
import modelo.Empleado;

public class BuscarEmpleado {

    public static void main(String[] args) {
        
        String apellido = "Amaya";
        EmpleadosDAO ce = new EmpleadosDAO();
        Empleado le = ce.obtenEmpleado(apellido);        

        System.out.println(
                "CODIGO\tNOMBRE\tAPELLID\tFEC.NAC.\tSALARIO\tDireccion");

        System.out.println(le.getCodigo() + "\t" + le.getCodigo() + "\t" + 
                le.getApellido() + "\t" + le.getFec_nacimiento() + "\t" + 
                le.getSalario()  + "\t" + le.getDireccion());
    }
}