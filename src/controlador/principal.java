/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.*;
import org.hibernate.Query;

        
import org.hibernate.Session;
import org.hibernate.Transaction;
import vista.prin;

/**
 *
 * @author Duber
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//        Session sesion = HibernateUtil.getSessionFactory().openSession();
//        Transaction transaccion =sesion.getTransaction();
//        Usuarios usuario = new Usuarios("duber","1234");
//        usuario.setTipo("Admin");
//        transaccion.begin();
//        sesion.save(usuario);
//        transaccion.commit();
//        sesion.close();
        
        
//        Session sesion = HibernateUtil.getSessionFactory().openSession();
//        
//       Query query = sesion.createQuery("SELECT c from Usuarios as c where idUsuario=1 ");
//       Usuarios us = (Usuarios) query.uniqueResult();
//       
//        System.out.println(us.getFaseses().size());
//       
//       Fases fase = new Fases(us, "1234", "Inical");
//       Proyectos proyecto = new Proyectos(us, "1234", "Nombre", 3);
//       us.addFase(fase);
//       us.addProyecto(proyecto);
//       
//       
//       
////        Transaction transaccion =sesion.getTransaction();
////       
////        transaccion.begin();
////       

////        
////        sesion.update(us);
////        transaccion.commit();
//        sesion.close();
        
           
        
        
//        Session sesion = HibernateUtil.getSessionFactory().openSession();
//        
//       Query query = sesion.createQuery("SELECT c from Usuarios as c where idUsuario=1 ");
//       Usuarios us = (Usuarios) query.uniqueResult();
//       
//        System.out.println(us.getFaseses().size());
//       
//        System.out.println(us.getFase(1).getNombre());
//       us.getFase(1).setNombre("Final");
//       
//       
//       
//        Transaction transaccion =sesion.getTransaction();
//       
//        transaccion.begin();
//       
//       
//        
//        sesion.update(us);
//        transaccion.commit();
//        sesion.close();
        
        
//          Session sesion = HibernateUtil.getSessionFactory().openSession();
//        
//       Query query = sesion.createQuery("SELECT c from Usuarios as c where idUsuario=1 ");
//       Usuarios us = (Usuarios) query.uniqueResult();
////       
////       Fasesdelproyecto fasesdelproyecto = new Fasesdelproyecto(us.getFase(1),us.getProyecto(1));
////       us.getProyecto(1).addFaseDelProyecto(fasesdelproyecto);
////       
////        
////      Defectos defecto = new Defectos(us.getProyecto(1).getFaseDelProyecto(1), "23147", "Fallas en whiles");
//       Proyectos  proyecto = us.getProyecto(1);
//       proyecto.setNombre("Final");
//        System.out.println();
//        
////       
////       
//        Transaction transaccion =sesion.getTransaction();
//       
//        transaccion.begin();
//       
//       
////        sesion.save(defecto);
//        sesion.update(us);
//        transaccion.commit();
//        sesion.close();
//        
//        
       
        
        
             Session sesion = HibernateUtil.getSessionFactory().openSession();
                Query query = sesion.createQuery("SELECT C FROM Usuarios as C where idUsuario=1");
                Usuarios u = (Usuarios) query.uniqueResult();
              
                
                new prin(u).setVisible(true);
                  sesion.close();
    }
    
}
