package br.com.juliano.cadastro_cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.juliano.cadastro_cliente.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {

}
