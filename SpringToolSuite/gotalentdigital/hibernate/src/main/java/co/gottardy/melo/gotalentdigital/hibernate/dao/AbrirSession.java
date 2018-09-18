package co.gottardy.melo.gotalentdigital.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AbrirSession {
	
	private Session session;
	
	public AbrirSession() {
		
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
	}

	public Session obtenerSessionFactory() {
		return session;
	}

}
