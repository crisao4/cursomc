package com.nelioalves.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// anotação do spring para controler/mapeamento 
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResourse {
	
	// para que seja uma função precisa da anotação do spring(inclusão dos verbos, GET, POST, DELET e put)
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST esta fucionando!";
	}

}
