package com.xyz.firstprojects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class FirstprojectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectsApplication.class, args);
	}
	@RequestMapping("/m/{track}/{module}/{lesson}")
	public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module,@PathVariable("lesson") String lesson) {
		return "Track: " +track+" Module: "+module+" Lesson: "+lesson;
	}
	
}

