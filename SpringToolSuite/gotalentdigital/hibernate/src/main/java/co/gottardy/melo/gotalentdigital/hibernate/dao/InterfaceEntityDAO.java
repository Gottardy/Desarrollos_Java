package co.gottardy.melo.gotalentdigital.hibernate.dao;

import java.util.List;

public interface InterfaceEntityDAO {
	
	void guardarObjeto(Object obj);
	void eliminarObjetoPorId(Long idObject);
	void actualizarObjeto(Object obj);
	
	List<Object> listaTodosLosObjectos();
	Object buscarPorId(Long idObjeto);
	Object buscarPorNombre(String Name);
	
	
}
