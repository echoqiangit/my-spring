package com.example.myspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/v1")
public class MyWebServiceController {

	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	
	@PostMapping("/login")
	public String postLogin(@RequestBody User user) {
		System.out.println(user.getUsername());
		String response =  "{\"User\":{\"Name\":\"" + user.getUsername() + "\"},\"AuthId\":\"abc\"}";
		System.out.println(response);
		return response;
	}
}
