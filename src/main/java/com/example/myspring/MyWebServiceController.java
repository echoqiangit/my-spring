package com.example.myspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebServiceController {

	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
}
