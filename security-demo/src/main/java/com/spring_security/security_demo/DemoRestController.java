package com.spring_security.security_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	
	//localhost:8080/GetMsg
	@GetMapping ("/GetMsg")
	public String getMsg () 
	
	{
		System.out.println("Hello ");
		return "return hello  ";
	}

}
