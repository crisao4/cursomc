package com.nelioalves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;

// anotação do spring para controler/mapeamento 
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResourse {
	
	// para que seja uma função precisa da anotação do spring(inclusão dos verbos, GET, POST, DELET e put)
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Informatica");
		Categoria cat2 = new Categoria(2, "Escritorio");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		// teste na web do REST
		//return "REST esta fucionando!";
		
		return lista;
	}

}
