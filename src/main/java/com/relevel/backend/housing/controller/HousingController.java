package com.relevel.backend.housing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HousingController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

