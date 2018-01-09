package br.com.juliano.cadastro_cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.juliano.cadastro_cliente.domain.Item;

public interface ItemRepository extends JpaRepository<Item,Long> {

}
