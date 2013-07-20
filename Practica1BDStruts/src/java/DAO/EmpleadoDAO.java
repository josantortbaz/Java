/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import modelo.Empleado;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author josea
 */
public class EmpleadoDAO {
    private Session sesion;
    private Transaction tx;

    private void iniciaOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrió error en capa de acceso a datos", he);
    }

    public Empleado obtenEmpleado (String ap) throws HibernateException {
        Empleado emp = null;
        String query = "from Empleado emp where emp.apellido = '" + ap + "'";
        try {
            iniciaOperacion();
            /* Si hay varios resultados, devolvemos siempre el primero */
             List<Empleado> lista= sesion.createQuery(query).list();
             if (lista.size() > 0) {
                 emp = lista.get(0);
             }
        } finally {
            sesion.close();
        }
        return emp;
    }
}
