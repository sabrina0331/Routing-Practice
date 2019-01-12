package com.xyz.firstprojects;


import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectsApplication.class, args);
	}
	@RequestMapping("/coding")
	public String one() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/coding/python")
	public String two() {
		return "Python/Django was awesome!";
	}
	@RequestMapping("/coding/java")
	public String three() {
		return "Java/Spring is better!";
	}

}
