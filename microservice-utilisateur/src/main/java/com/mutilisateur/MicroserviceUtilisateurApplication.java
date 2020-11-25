package com.mutilisateur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceUtilisateurApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceUtilisateurApplication.class, args);
	}

}
