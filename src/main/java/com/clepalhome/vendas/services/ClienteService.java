package com.clepalhome.vendas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clepalhome.vendas.domain.Cliente;
import com.clepalhome.vendas.repositories.ClienteRepository;
import com.clepalhome.vendas.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired 
	private ClienteRepository cliRepo;
	
//===================================== LISTAR =============================================
	public Cliente find(Integer id) {
		Optional<Cliente> obj = cliRepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	
//==================================== INSERIR =============================================

}
