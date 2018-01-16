/*package br.com.juliano.cadastro_cliente.carga;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.juliano.cadastro_cliente.domain.Cliente;
import br.com.juliano.cadastro_cliente.domain.Item;
import br.com.juliano.cadastro_cliente.domain.Pedido;
import br.com.juliano.cadastro_cliente.repository.ClienteRepository;

@Component
public class RepositoryTest 
implements ApplicationRunner 
{

	private static final long ID_CLIENTE_JULIANO = 11l;
	private static final long ID_CLIENTE_ZE_PEQUENO = 22l;
	
	private static final long ID_ITEM1 = 100l;
	private static final long ID_ITEM2 = 101l;
	private static final long ID_ITEM3 = 102l;
	
	private static final long ID_PEDIDO1 = 1000l;
	private static final long ID_PEDIDO2 = 1001l;
	private static final long ID_PEDIDO3 = 1002l;
	
	@Autowired
    private ClienteRepository clienteRepository;
	
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

    	System.out.println(">>> Iniciando carga de dados...");
    	Cliente juliano = new Cliente(ID_CLIENTE_JULIANO,"Juliano Cervelin","São Paulo");
    	Cliente zePequeno = new Cliente(ID_CLIENTE_ZE_PEQUENO,"Zé Pequeno","Cidade de Deus");    	
    	
    	Item item1 = new Item(ID_ITEM1,"Item 1 com salada",25d);
    	Item item2 = new Item(ID_ITEM2,"Item 2 sem salada",27d);
		Item item3 = new Item(ID_ITEM3,"Item 3 à moda",30d);
    	
    	List<Item> listaPedidoJuliano1 = new ArrayList<Item>();
    	listaPedidoJuliano1.add(item1);

    	List<Item> listaPedidoZePequeno1 = new ArrayList<Item>();
    	listaPedidoZePequeno1.add(item2);
    	listaPedidoZePequeno1.add(item3);
    	
    	Pedido pedidoDoJuliano = new Pedido(ID_PEDIDO1,juliano,listaPedidoJuliano1,item1.getPreco());
    	juliano.novoPedido(pedidoDoJuliano);
    	
    	Pedido pedidoDoZepequeno = new Pedido(ID_PEDIDO2,zePequeno,listaPedidoZePequeno1, item2.getPreco()+item3.getPreco());
    	zePequeno.novoPedido(pedidoDoZepequeno);
    	
    	System.out.println(">>> Pedido 1 - Juliano : "+ pedidoDoJuliano);
    	System.out.println(">>> Pedido 2 - Ze Pequeno: "+ pedidoDoZepequeno);
    	
       
		clienteRepository.saveAndFlush(zePequeno);
		System.out.println(">>> Gravado cliente 2: "+zePequeno);

		List<Item> listaPedidoJuliano2 = new ArrayList<Item>();
		listaPedidoJuliano2.add(item2);
    	Pedido pedido2DoJuliano  = new Pedido(ID_PEDIDO3,juliano,listaPedidoJuliano2,item2.getPreco());
    	juliano.novoPedido(pedido2DoJuliano);
    	clienteRepository.saveAndFlush(juliano);
    	System.out.println(">>> Pedido 2 - Juliano : "+ pedido2DoJuliano);
    	System.out.println(">>> Gravado cliente 1: "+juliano);
		
    }
 
}*/