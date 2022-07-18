package com.clepalhome.vendas.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clepalhome.vendas.domain.Categoria;
import com.clepalhome.vendas.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
		
//===================================== LISTAR =============================================
		@RequestMapping(value="/{id}", method=RequestMethod.GET)// verbos GET, POST, DELETE
		public ResponseEntity<Categoria> find(@PathVariable Integer id){
			Categoria obj = service.find(id);
			return ResponseEntity.ok().body(obj);
	}

//==================================== INSERIR =============================================

}
