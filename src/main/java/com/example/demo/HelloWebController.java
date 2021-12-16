package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//@RequestMapping("/hello")
@Controller
public class HelloWebController {
	@GetMapping("/web")
	public String Hello() {
		return "Hello";
	} 
	@GetMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("message","this is custom message");
		return "message";
	}

}
