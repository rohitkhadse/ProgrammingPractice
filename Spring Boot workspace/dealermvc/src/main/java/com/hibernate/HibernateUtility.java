package com.hibernate;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {

	  private static final SessionFactory sessionFactory = buildSessionFactory();

	    private static SessionFactory buildSessionFactory() {
	        try {
	            // Create the SessionFactory from hibernate.cfg.xml
	            //return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        	
	        	Configuration cfg=new Configuration();  
	            cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	            SessionFactory factory=cfg.buildSessionFactory(); 
	            return factory;
	        }
	        catch (Throwable ex) {
	            // Make sure you log the exception, as it might be swallowed
	            System.err.println("SessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }

	    public static void shutdown() {
	    	// Close caches and connection pools
	    	getSessionFactory().close();
	    }

}
