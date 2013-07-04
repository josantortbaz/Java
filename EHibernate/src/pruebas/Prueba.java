/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author josea
 */
import java.util.List;
import java.sql.*;
import modelo.Departamento;
import DAO.DepartamentosDAO;

public class Prueba {

    public static void main(String[] args) {
        DepartamentosDAO depDAO = new DepartamentosDAO();
        Departamento depRecuperado = null;
        long idAEliminar = 0;
// Crea el objeto para parsear dos datos del formulario, tipos String a tipo Date -fecha- , tipos
//String a tipo Time -hora- y String a tipo int -telefono-.
        String nombre = "nombre0";
        String area = "area0";
//Creamos tes instancias de Contacto
        Departamento d1 = new Departamento("dep1", "area1");
        Departamento d2 = new Departamento("dep2", "area2");
        Departamento d3 = new Departamento("dep3", "dep3");
//Guardamos las tres instancias, guardamos el id del contacto1 para usarlo posteriormente 
        idAEliminar = depDAO.guardaDepartamento(d1);
        depDAO.guardaDepartamento(d2);
        depDAO.guardaDepartamento(d3);
//Modificamos el contacto 2 y lo actualizamos
        d2.setNombre("Nuevo Departamento 2");
        depDAO.actualizaDepartamento(d2);
//Recuperamos el contacto1 de la base de datos
        depRecuperado = depDAO.obtenDepartamento(idAEliminar);
        System.out.println("Recuperamos a " + depRecuperado.getNombre());
//Eliminamos al contactoRecuperado (que es el contacto3)
        depDAO.eliminaDepartamento(depRecuperado);
//Obtenemos la lista de contactos que quedan en la base de datos y la //mostramos
        List<Departamento> listaDeps = depDAO.obtenListaDepartamentos();
        System.out.println("Hay " + listaDeps.size() + "departamentos en la base de datos");
        for (Departamento c : listaDeps) {
            System.out.println("-> " + c.getNombre() + " -> " + c.getArea());
        }
    }
}