/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Duber
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    
    public static void save (Padre objeto){
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.getTransaction();
        transaccion.begin();
        sesion.save(objeto);
        transaccion.commit();
        sesion.close();
        
        
    }
    public static void update (Padre objeto){
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.getTransaction();
        transaccion.begin();
        sesion.update(objeto);
        transaccion.commit();
        sesion.close();
        
        
    }
}
