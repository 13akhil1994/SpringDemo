package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/test")
	public String test() {
		System.out.println("--testing...");
		return "success.jsp";
	}
}
