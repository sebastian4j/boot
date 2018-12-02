package com.sebastian.boot.uno.beans;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OtrosProperties {
	private static final Logger LOGGER = LoggerFactory.getLogger(OtrosProperties.class);

	@Value("${otros-uno}")
	private String otrosUno;
	@Value("${otros-dos}")
	private String otrosDos;
	@Value("${otros-tres}")
	private String otrosTres;

	@PostConstruct
	private void init() {
		LOGGER.info("{}, {}, {}", otrosUno, otrosDos, otrosTres);
	}
}
