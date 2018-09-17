package co.gottardy.melo.gotalentdigital.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.gottardy.melo.gotalentdigital.hibernate.model.Course;
import co.gottardy.melo.gotalentdigital.hibernate.model.Teacher;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Session session = iniciarSessionFactory();
        /*
        Teacher teacher = new Teacher("Anahi Salgado","Avatar");
        realizarTransaccion(session, teacher);
        */
        Course course = new Course("Java Avanzado", "Hibernate", "Rest API");
        realizarTransaccion(session,course);
        
        
    }

	public static void realizarTransaccion(Session session, Object obj) {
		session.beginTransaction();
        session.save(obj);
        session.getTransaction().commit();
        session.close();
	}

	public static Session iniciarSessionFactory() {
		SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
		return session;
	}
}
