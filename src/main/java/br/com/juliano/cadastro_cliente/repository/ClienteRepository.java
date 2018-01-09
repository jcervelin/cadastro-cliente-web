package br.com.juliano.cadastro_cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.juliano.cadastro_cliente.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
