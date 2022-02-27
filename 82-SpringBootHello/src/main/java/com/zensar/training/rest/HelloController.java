package com.zensar.training.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/greet")//if it is  in url the below functions executes an on web browser
	public String sayHello() {
		return "Welcom to REST API";
	}
}
///greet are exposed as REST end point