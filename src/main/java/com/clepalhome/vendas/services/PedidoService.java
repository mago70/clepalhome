package com.clepalhome.vendas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clepalhome.vendas.domain.Pedido;
import com.clepalhome.vendas.repositories.PedidoRepository;
import com.clepalhome.vendas.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired 
	private PedidoRepository repo;
	
//===================================== LISTAR =============================================
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
	
//==================================== INSERIR =============================================

}
