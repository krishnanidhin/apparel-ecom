package com.example.apparelecom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CatalogController {

	@GetMapping
	String index() {
		return "index";
		
	}
}
