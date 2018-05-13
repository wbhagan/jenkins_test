package com.jenkins.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;	

@RestController
public class JenkinsController {
	
	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message;

	@RequestMapping("/")
	public String welcome() {
		return this.message;
	}
}
