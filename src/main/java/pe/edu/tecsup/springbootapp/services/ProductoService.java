package pe.edu.tecsup.springbootapp.services;

import java.util.List;

import pe.edu.tecsup.springbootapp.entities.Producto;

public interface ProductoService {

	List<Producto> findAll() throws Exception;

	Producto findById(Long id) throws Exception;

	void save(Producto producto) throws Exception;
	
	void deleteById(Long id) throws Exception;

}
