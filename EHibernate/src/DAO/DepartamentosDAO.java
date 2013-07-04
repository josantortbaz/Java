/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import modelo.Departamento;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author JAOrtiz
 */
public class DepartamentosDAO {
    
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
    
    public long guardaDepartamento(Departamento departamento) {
        long id = 0;
        try {
            iniciaOperacion();
            id = (Long) sesion.save(departamento);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return id;

    }

    public void actualizaDepartamento(Departamento departamento) throws HibernateException {
        try {
            iniciaOperacion();
            sesion.update(departamento);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    public void eliminaDepartamento(Departamento departamento) throws HibernateException {
        try {
            iniciaOperacion();
            sesion.delete(departamento);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    public Departamento obtenDepartamento(long idDepartamento) throws HibernateException {
        Departamento Departamento = null;
        try {
            iniciaOperacion();
            Departamento = (Departamento) sesion.get(Departamento.class, idDepartamento);
        } finally {
            sesion.close();
        }
        return Departamento;
    }

    public List<Departamento> obtenListaDepartamentos() throws HibernateException {
        List<Departamento> listaDepartamentos = null;
        try {
            iniciaOperacion();
            listaDepartamentos = sesion.createQuery("from Departamento").list();
        } finally {
            sesion.close();
        }
        return listaDepartamentos;
    }
}
