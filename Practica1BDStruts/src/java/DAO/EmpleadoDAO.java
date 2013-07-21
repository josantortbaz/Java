/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.util.ArrayList;
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
    
    public List<Empleado> obtenEmpleados () throws HibernateException {
        String query = "from Empleado emp";
        List<Empleado> lista = new ArrayList<Empleado>();
        try {
            iniciaOperacion();
            /* Si hay varios resultados, devolvemos siempre el primero */
             lista= sesion.createQuery(query).list();
        } finally {
            sesion.close();
        }
        return lista;
    }
    
    public Empleado insertaEmpleado (Empleado e) throws HibernateException {
        Empleado emp = e;
        try {
            iniciaOperacion();
            sesion.saveOrUpdate(e);            
        } catch (Exception ex) {
            emp = null;
        } finally {
            tx.commit();
            sesion.close();
        }
        return emp;
    }
    
    public List<Empleado> eliminaEmpleado (String codigo) throws HibernateException {
        Empleado e;
        String query = "from Empleado emp where emp.codigo = '" + codigo + "'";
        try {
            iniciaOperacion();
            List<Empleado> lista= sesion.createQuery(query).list();
             if (lista.size() > 0) {
                 e = lista.get(0);
                 sesion.delete(e);
             } else {
                 return null;
             }
        } finally {
            tx.commit();
            sesion.close();
        }
        return obtenEmpleados();
    }
}
