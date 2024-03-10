package com.files.bo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@PostMapping("/createBlogs")
	public boolean createBlogs() {
		return true;
	}
	
}
