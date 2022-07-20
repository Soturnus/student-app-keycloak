package com.soturno.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@ComponentScan({"com.soturno.controller, com.soturno.service, "
	+ "com.soturno.security"})
@EntityScan("com.soturno.entity")
@EnableJpaRepositories("com.soturno.repository")
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SinglesignonKeycloakApplication {

	public static void main(String[] args) {
		
//		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//		String password1 = bCryptPasswordEncoder.encode("john123");
//		String password2 = bCryptPasswordEncoder.encode("sachin123");
//		String password3 = bCryptPasswordEncoder.encode("rivas199");
		
		SpringApplication.run(SinglesignonKeycloakApplication.class, args);
	}

}
