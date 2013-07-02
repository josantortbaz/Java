package DAO;

import java.util.*;
import java.sql.*;
import modelo.Empleado;

/**
 * Document   : EmpleadoDAO
 * Created on : 15-jun-2013, 16:48:34
 * Author     : JAOrtiz
 */
public class EmpleadosDAO {

    private Connection conexion = null;

    public EmpleadosDAO() {
    }

    /**
     * 
     * @param apellido: Apellido del empleado a buscar en BBDD
     * @return Empleado: El primer empleado encontrado.
     * 
     * Método para buscar un empleado en BBDD.
     * En primer lugar, abrimos una conexión a la BBDD local con los datos de log in:
     *      User: root
     *      Pass: toor
     * A continuación, buscamos el empleado con el apellido pasado por parámetro
     * y creamos el empleado a retornar con los datos obtenidos.
     * Por último, cerramos la conexión con la BBDD.
     * 
     */
    public Empleado obtenEmpleado(String apellido) {
        Empleado nv = null;
        try {
            abrirConexion();
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("select * from empleado where apellido like '"
                    + apellido + "'");
            rs.next();
            String codigo = rs.getString(1);
            String nombre = rs.getString(2);
            String apel = rs.getString(3);
            java.sql.Date fecha = rs.getDate(4);
            double salario = rs.getDouble(5);
            String direccion = rs.getString(6);
            nv = new Empleado(codigo, nombre, apel, fecha, salario, direccion);
            rs.close();
            stmt.close();
            cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nv;
    }

    public void abrirConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/prueba", 
                    "root", "toor");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
