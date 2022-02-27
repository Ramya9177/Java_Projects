package com.zensar.training.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloClientController {
	
	@GetMapping("sayHello")
	public String f1() {
		RestTemplate restTemplate;//predefined class-->mapping to other application  //communicate with other microservices		
		restTemplate=new RestTemplate();
		String restval=restTemplate.getForObject("http://localhost:8081/greet/Ramya",String.class);
		return restval;
	}

}
