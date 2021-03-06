package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customerService/")
public class Controller {
	
	@Value("${greeting}")
	private String message ;
	
	@RequestMapping("/")
	public String test() {
		return "Customer-Service-Contorller" + message;
	}
}
