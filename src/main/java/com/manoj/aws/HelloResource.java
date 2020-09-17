package com.manoj.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloResource {
	@GetMapping
	public String hello() {
		return "Hello message change";
	}

}
