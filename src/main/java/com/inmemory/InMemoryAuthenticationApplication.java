package com.inmemory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/products")
public class InMemoryAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(InMemoryAuthenticationApplication.class, args);
	}

	@GetMapping("/getall")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String getAll() {
		return "Get all from eKart";
	}
	
	@GetMapping("/get")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String getOneProduct() {
		return "Product from eKart";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to eKart";
	}
	
}
