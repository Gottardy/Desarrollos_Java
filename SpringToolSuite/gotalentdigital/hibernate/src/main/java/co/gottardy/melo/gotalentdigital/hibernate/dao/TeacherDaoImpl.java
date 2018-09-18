package co.gottardy.melo.gotalentdigital.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;

import co.gottardy.melo.gotalentdigital.hibernate.model.Teacher;

public class TeacherDaoImpl extends AbrirSession implements InterfaceEntityTeacherDAO{

	private AbrirSession abrirSession;
	
	public TeacherDaoImpl() {
		abrirSession = new AbrirSession();
	}

	@Override 
	public void guardarObjeto(Teacher teacher) {
		abrirSession.obtenerSessionFactory().persist(teacher);
		abrirSession.obtenerSessionFactory().getTransaction().commit();
	}

	@Override
	public void eliminarObjetoPorId(Long idTeacher) {
		try {
			Teacher teacher = abrirSession.obtenerSessionFactory().get(Teacher.class, idTeacher);
			abrirSession.obtenerSessionFactory().delete(teacher);
			abrirSession.obtenerSessionFactory().getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			abrirSession.obtenerSessionFactory().getTransaction().rollback();
		}
	}

	@Override
	public void actualizarObjeto(Teacher teacher) {
		abrirSession.obtenerSessionFactory().update(teacher);
		abrirSession.obtenerSessionFactory().getTransaction().commit();		
	}

	@Override
	public List<Teacher> listaTodosLosObjectos() {
		return abrirSession.obtenerSessionFactory().createQuery("from Teacher").list();
	}

	@Override
	public Teacher buscarPorId(Long idTeacher) {
		return abrirSession.obtenerSessionFactory().load(Teacher.class,idTeacher);
	}

	@Override
	public Teacher buscarPorNombre(String Name) {
		return null;
	}

}
