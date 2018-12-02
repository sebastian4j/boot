package com.sebastian.boot.dos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * ejecutar con:
 * --add-exports java.annotation/javax.annotation.security=ALL-UNNAMED

 * @author Sebastian Avila A.
 *
 */
@SpringBootApplication
public class BootDosApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDosApplication.class, args);
	}
}
