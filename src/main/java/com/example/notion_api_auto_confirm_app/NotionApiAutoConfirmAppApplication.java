package com.example.notion_api_auto_confirm_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class NotionApiAutoConfirmAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotionApiAutoConfirmAppApplication.class, args);
	}

	@RestController
	class HelloController {
		@GetMapping("/")
		public String hello() {
			return "Hello, Spring Boot";
		}
	}

}
