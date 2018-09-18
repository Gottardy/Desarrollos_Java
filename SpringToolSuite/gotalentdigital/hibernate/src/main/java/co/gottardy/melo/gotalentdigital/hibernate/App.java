package co.gottardy.melo.gotalentdigital.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.gottardy.melo.gotalentdigital.hibernate.dao.TeacherDaoImpl;
import co.gottardy.melo.gotalentdigital.hibernate.model.Course;
import co.gottardy.melo.gotalentdigital.hibernate.model.Teacher;

public class App 
{
    
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //Creamos y almacenamos un objeto teacher
        Teacher teacher1 = new Teacher("Pablo","Avatar");
        TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
        teacherDaoImpl.guardarObjeto(teacher1);
        
        
        //Instaciamos un nuevo objeto teacher para listar todos los objetos
        //Se reliza un casteo del objeto y la lista de respuesta al objeto deseado
        TeacherDaoImpl teacherDaoImpl2 = new TeacherDaoImpl();
        List<Teacher> teachers =  teacherDaoImpl2.listaTodosLosObjectos();
        for (Teacher t : teachers) {
			System.out.println("Nombre : "+t.getName());
		}
        
        //Buscamos un Teacher por su id, lo modificamos y luego lo actulizamos
        TeacherDaoImpl teacherDaoImpl3 = new TeacherDaoImpl();
        Teacher teacher2 = new Teacher();
        teacher2 = teacherDaoImpl3.buscarPorId((long) 3);
        teacher2.setName("Gottardy Melo");
        teacherDaoImpl3.actualizarObjeto(teacher2);
        
        
    }

	public static void realizarTransaccion(Session session, Object obj) {
		session.beginTransaction();
        session.save(obj);
        session.getTransaction().commit();
        session.close();
	}

	public static Session obtenerSessionFactory() {
		SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
		return session;
	}
}
