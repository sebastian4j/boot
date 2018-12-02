package com.sebastian.boot.uno.beans;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * bean que genera un mensaje.
 * 
 * @author Sebastian Avila A.
 *
 */
@Component
public class Saludador {
  private static final Logger LOGGER = LoggerFactory.getLogger(Saludador.class);
  
  @Value("${propiedad-1}")
  private String propieda1;
  @Value("${no-existe:default}")
  private String noExiste;
  
  @PostConstruct
  private void init() {
    LOGGER.info("{}, {}", propieda1, noExiste);
  }
}
