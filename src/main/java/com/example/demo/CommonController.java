package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	
	@RequestMapping(value="login")
	public Customer login() {
		System.out.println("loign....");
		Customer c=new Customer();
		c.setCname("john123");
		c.setId(100);
		return c;
	}
}
