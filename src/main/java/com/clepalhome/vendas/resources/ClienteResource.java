package com.clepalhome.vendas.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clepalhome.vendas.domain.Cliente;
import com.clepalhome.vendas.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
		
//===================================== LISTAR =============================================
		@RequestMapping(value="/{id}", method=RequestMethod.GET)// verbos GET, POST, DELETE
		public ResponseEntity<Cliente> find(@PathVariable Integer id){
			Cliente obj = service.find(id);
			return ResponseEntity.ok().body(obj);
	}

//==================================== INSERIR =============================================

}
