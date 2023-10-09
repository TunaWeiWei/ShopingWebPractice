package com.web.billy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
			 
	@GetMapping({"/", "/index"})
	public String index() {
		return"index";
	}
	
	@GetMapping("/productIntro")
    public String productIntro() {
        return "productIntro";
	}
	
	@GetMapping("/buyingPage")
    public String buyingPage() {
        return "buyingPage";
	}	
}
