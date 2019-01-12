package com.xyz.firstprojects;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	public static void main(String[] args) {
	}
	@RequestMapping("{word}")
	public String four(@PathVariable("word") String word) {
		if(word.equals("dojo")) {
			return "The "+word+" is awesome!";
		}
		if(word.equals("burbank-dojo")) {
			return word+" is located in Southern California.";
		}
		if(word.equals("san-jose")) {
			return "SJ dojo is the HQ.";
		}
		else {
			return "Please try another keyword";
		}
	}
}
