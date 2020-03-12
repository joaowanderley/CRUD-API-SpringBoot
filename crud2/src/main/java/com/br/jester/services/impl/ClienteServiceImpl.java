package com.br.jester.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.jester.documents.Cliente;
import com.br.jester.repositories.ClienteRepository;
import com.br.jester.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRespository;
	
	@Override
	public List<Cliente> listarTodos() {
		return this.clienteRespository.findAll();
	}

	@Override
	public Cliente listarPorId(String id) {
		return this.clienteRespository.findById(id).get();
	}

	@Override
	public Cliente cadastrar(Cliente cliente) {
		return this.clienteRespository.save(cliente);
	}

	@Override
	public Cliente atualizar(Cliente cliente) {
		return this.clienteRespository.save(cliente);
	}

	@Override
	public void remover(String id) {
		this.clienteRespository.deleteById(id);
		
	}

}
