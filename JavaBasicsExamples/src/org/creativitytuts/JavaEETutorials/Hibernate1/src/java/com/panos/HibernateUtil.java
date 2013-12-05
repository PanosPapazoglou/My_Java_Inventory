/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.panos;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * // Eiinai to antistoixo tou..
 * // apla etsi einai pio abstract..me tin HibernateUtil i opoia paragete kai aytomata apo to NetBeans
 * // συνηθισμένη αρχικοποίηση
	AnnotationConfiguration config = new AnnotationConfiguration();
	config.addAnnotatedClass(Person.class);
	config.configure();

	// θέλουμε να αποθηκεύσουμε στη βάση τον Vincent Hanna
	Person person = new Person();
	person.setName("Vincent Hanna");

	// χρονοβόρα αρχικοποίηση - 1 φορά για κάθε εφαρμογή
	SessionFactory factory = config.buildSessionFactory();
	// πάρε το session
	Session session = factory.getCurrentSession();
	// αποθήκευσε
	session.beginTransaction();
	session.save(person);
	session.getTransaction().commit();
        * 
        * 
 * @author panos
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
