package com.thaloz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

	
	@GetMapping("/name")
	private String name() {
		return "Ricardo";
	}
}
