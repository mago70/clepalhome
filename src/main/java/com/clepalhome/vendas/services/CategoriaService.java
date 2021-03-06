package com.clepalhome.vendas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clepalhome.vendas.domain.Categoria;
import com.clepalhome.vendas.repositories.CategoriaRepository;
import com.clepalhome.vendas.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired 
	private CategoriaRepository repo;
	
//===================================== LISTAR =============================================
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
//==================================== INSERIR =============================================

}
