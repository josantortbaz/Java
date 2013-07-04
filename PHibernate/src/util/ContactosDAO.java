/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.List;
import modelo.Contacto;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author josea
 */
public class ContactosDAO {

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

    public long guardaContacto(Contacto contacto) {
        long id = 0;
        try {
            iniciaOperacion();
            id = (Long) sesion.save(contacto);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return id;

    }

    public void actualizaContacto(Contacto contacto) throws HibernateException {
        try {
            iniciaOperacion();
            sesion.update(contacto);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    public void eliminaContacto(Contacto contacto) throws HibernateException {
        try {
            iniciaOperacion();
            sesion.delete(contacto);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    public Contacto obtenContacto(long idContacto) throws HibernateException {
        Contacto contacto = null;
        try {
            iniciaOperacion();
            contacto = (Contacto) sesion.get(Contacto.class, idContacto);
        } finally {
            sesion.close();
        }
        return contacto;
    }

    public List<Contacto> obtenListaContactos() throws HibernateException {
        List<Contacto> listaContactos = null;
        try {
            iniciaOperacion();
            listaContactos = sesion.createQuery("from Contacto").list();
        } finally {
            sesion.close();
        }
        return listaContactos;
    }
}
