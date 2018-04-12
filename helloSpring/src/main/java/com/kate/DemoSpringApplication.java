package com.kate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DemoSpringApplication {
	//Label needed for server to identify commands

	@RequestMapping("/hello")
	@ResponseBody
	String helloPage() {
		return "Hello from the hello page!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
	}
}
