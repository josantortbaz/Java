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
import modelo.Contacto;
import util.ContactosDAO;

public class Prueba {

    public static void main(String[] args) {
        ContactosDAO contactosDAO = new ContactosDAO();
        Contacto contactoRecuperado = null;
        long idAEliminar = 0;
// Crea el objeto para parsear dos datos del formulario, tipos String a tipo Date -fecha- , tipos
//String a tipo Time -hora- y String a tipo int -telefono-.
        Date fechaParseado = Date.valueOf("2010-11-10");
        Time horaParseado = Time.valueOf("10:34:34");
        int telefonoParseado = 12345678;
//Creamos tes instancias de Contacto
        Contacto contacto1 = new Contacto("Contacto 1", "contacto1@contacto.com",
                telefonoParseado, fechaParseado, horaParseado);
        Contacto contacto2 = new Contacto("Contacto 2", "contacto2@contacto.com",
                telefonoParseado, fechaParseado, horaParseado);
        Contacto contacto3 = new Contacto("Contacto 3", "contacto3@contacto.com",
                telefonoParseado, fechaParseado, horaParseado);
//Guardamos las tres instancias, guardamos el id del contacto1 para usarlo posteriormente 
        idAEliminar = contactosDAO.guardaContacto(contacto1);
        contactosDAO.guardaContacto(contacto2);
        contactosDAO.guardaContacto(contacto3);
//Modificamos el contacto 2 y lo actualizamos
        contacto2.setNombre("Nuevo Contacto 2");
        contactosDAO.actualizaContacto(contacto2);
//Recuperamos el contacto1 de la base de datos
        contactoRecuperado = contactosDAO.obtenContacto(idAEliminar);
        System.out.println("Recuperamos a " + contactoRecuperado.getNombre());
//Eliminamos al contactoRecuperado (que es el contacto3)
        contactosDAO.eliminaContacto(contactoRecuperado);
//Obtenemos la lista de contactos que quedan en la base de datos y la //mostramos
        List<Contacto> listaContactos = contactosDAO.obtenListaContactos();
        System.out.println("Hay " + listaContactos.size() + "contactos en la base de datos");
        for (Contacto c : listaContactos) {
            System.out.println("-> " + c.getNombre());
        }
    }
}