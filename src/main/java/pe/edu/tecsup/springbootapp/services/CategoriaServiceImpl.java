package pe.edu.tecsup.springbootapp.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.tecsup.springbootapp.entities.Categoria;
import pe.edu.tecsup.springbootapp.repositories.CategoriaRepository;


@Service
public class CategoriaServiceImpl implements CategoriaService {

	private static Logger log = LoggerFactory.getLogger(CategoriaServiceImpl.class);
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	
	@Override
	public List<Categoria> listar() throws Exception {
		
		log.info("Call listar() ....! ");
		return categoriaRepository.findAll();
	}  

	
}
