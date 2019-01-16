/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import model.AsistenciaMedica;
import model.Direccion;
import model.Profesor;
import model.Seguro;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Maite
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAMOS CONEXION
        //SessionFactory sessionFactory;
        //Configuration configuration = new Configuration();
        //configuration.configure();
        //sessionFactory = configuration.buildSessionFactory();
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        // CREAMOS UN OBJETO
        // Direccion dir = new Direccion(8, "Calle la reina", 5, "Xativa", "Valencia");
        // Profesor profesor = new Profesor(17, "Pepe", "Garcia", "Perez");
        //profesor.setDireccion(dir);
        AsistenciaMedica asis = new AsistenciaMedica(2322, "Asistencia medica general ", "Tanatorio", "Enterrar al cadaver");
        Seguro seguro2 = new Seguro(435, "X353453456", "PEPE", "BANANO", "SIR", 55, asis);
        
        //CREAR UNA SESION
        Session session = factory.openSession();
        session.beginTransaction();

        //GUARDAR OBJETO
        //session.saveOrUpdate(profesor);
        // Profesor profesor2 = session.get(Profesor.class, 1);
        //profesor.setNombre("Jorge");
        //session.update(profesor);
        //session.delete(profesor);
        session.saveOrUpdate(seguro2);

        //CERRAR CONEXION
        session.getTransaction().commit();
        session.close();
        factory.close();

    }

}
