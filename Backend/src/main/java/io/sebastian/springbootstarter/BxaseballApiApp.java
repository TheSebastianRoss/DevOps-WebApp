package io.sebastian.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class BxaseballApiApp {
	
	@GetMapping("/")
	public String getMessage() {
		return "Test message";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BxaseballApiApp.class, args);
	}
}
