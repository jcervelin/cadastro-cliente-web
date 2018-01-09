package br.com.juliano.cadastro_cliente;

import javax.annotation.PostConstruct;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class CadastroClienteWebAgoraVaiApplication extends SpringBootServletInitializer {

	
	public static void main(String[] args) {
		SpringApplication.run(CadastroClienteWebAgoraVaiApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CadastroClienteWebAgoraVaiApplication.class);
	}
}
