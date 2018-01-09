package br.com.juliano.cadastro_cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.juliano.cadastro_cliente.domain.Cliente;
import br.com.juliano.cadastro_cliente.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository repository;

	public List<Cliente> findAll() {
		return repository.findAll();
	}

	public void save(Cliente cliente) {
		repository.saveAndFlush(cliente);
	}


}
