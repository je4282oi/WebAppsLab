package com.kate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//Labels needed for server to identify commands
@Controller
@SpringBootApplication
public class DemoSpringApplication {

	//RequestMapping tells you url extension message with display at
	//This displays to http://127.0.0.1:8080/hello
	@RequestMapping("/hello")
	//ResponseBody tells you message that will display
	@ResponseBody
	String helloPage() {
		return "Hello from the hello page!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
	}
}
