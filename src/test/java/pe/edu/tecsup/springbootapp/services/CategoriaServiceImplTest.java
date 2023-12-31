package pe.edu.tecsup.springbootapp.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.tecsup.springbootapp.entities.Categoria;

@SpringBootTest
class CategoriaServiceImplTest {

	@Autowired
	CategoriaService categoriaService;
	
	@Test
	void testFindAll() throws Exception {
				
		List<Categoria> cats = categoriaService.findAll();
	
		// Verifica que existan categorias
		//     VALOR_ESPERADO  VALOR_OBTENIDO
		assertEquals(false, cats.isEmpty());
		
	}

}
