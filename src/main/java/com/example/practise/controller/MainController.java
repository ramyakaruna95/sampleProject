package com.example.practise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping(value="ping")
	public String ping(){
		return "ping success";
	}
}
