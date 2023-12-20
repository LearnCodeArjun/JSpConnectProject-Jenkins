package com.main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	
	@GetMapping("/")
	public String main() {
		return "home";
		
	}
	
	@GetMapping("/about")
	public String About() {
		return "about";
		
	}

}
