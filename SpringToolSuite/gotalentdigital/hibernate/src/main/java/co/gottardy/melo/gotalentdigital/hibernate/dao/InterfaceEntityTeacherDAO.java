package co.gottardy.melo.gotalentdigital.hibernate.dao;

import java.util.List;

import co.gottardy.melo.gotalentdigital.hibernate.model.Teacher;

public interface InterfaceEntityTeacherDAO {
	
	public void guardarObjeto(Teacher teacher);
	public void eliminarObjetoPorId(Long idTeacher);
	public void actualizarObjeto(Teacher teacher);
	
	public List<Teacher> listaTodosLosObjectos();
	public Teacher buscarPorId(Long idTeacher);
	public Teacher buscarPorNombre(String Name);
	
	
}
