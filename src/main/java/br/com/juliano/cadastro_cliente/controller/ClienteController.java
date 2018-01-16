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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.juliano.cadastro_cliente.domain.Cliente;
import br.com.juliano.cadastro_cliente.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	private static final Logger logger = LoggerFactory
			.getLogger(ClienteController.class);

	
	@Autowired
	ClienteService service;

	@GetMapping("/listar")
	public String lista(Model model) {
		logger.debug("Entrada no método de listar");
		List<Cliente> clientes = service.findAll();
		model.addAttribute("clientes",clientes);
		return "clientes/view";
	}
	
	@PostMapping("/salvar")
	public String salvar(Cliente cliente, RedirectAttributes redirectAttributes) {
		service.save(cliente);
		redirectAttributes.addFlashAttribute("sucesso", "Cliente cadastrado com sucesso");
		return "redirect:listar";
	}
	
	@GetMapping("/criar")
	public String criar(Model model) {
		return "clientes/criar";
	}	

	
}
