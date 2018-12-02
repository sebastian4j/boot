package com.sebastian.boot.uno;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * obtener todos los beans del contexto.
 * --spring.profiles.active=desa|prod
 * 
 * @author Sebastian Avila A.
 *
 */
@PropertySources({@PropertySource("classpath:otros.properties")}) // agregado
@SpringBootApplication
public class Main implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {		
		var ctx = SpringApplication.run(Main.class, args);
		LOGGER.info("total de beans: {}", ctx.getBeanDefinitionCount());
		Arrays.asList(ctx.getBeanDefinitionNames()).forEach(l -> LOGGER.info(l));
	}
	
	@Override
    public void run(String...args) throws Exception {
		LOGGER.info("ejecutado despues del SpringApplication.run");
    }
}