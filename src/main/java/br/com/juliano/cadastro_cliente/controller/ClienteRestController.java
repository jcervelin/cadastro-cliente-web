package br.com.juliano.cadastro_cliente.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.juliano.cadastro_cliente.domain.Cliente;
import br.com.juliano.cadastro_cliente.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteRestController {
	
	private static final Logger logger = LoggerFactory
			.getLogger(ClienteRestController.class);

	
	@Autowired
	ClienteService service;

	@GetMapping("/listar")
	public List<Cliente> lista() {
		logger.debug("Entrada no método de listar Rest");
		List<Cliente> clientes = service.findAll();
		return clientes;
	}
	
	@PostMapping("/salvar")
	public void salvar(Cliente cliente) {
		service.save(cliente);
	}
	
}
