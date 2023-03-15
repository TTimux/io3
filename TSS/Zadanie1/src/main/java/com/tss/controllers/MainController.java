package com.tss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String page(Model model) {
		model.addAttribute("attribute", "Nazwisko Imie IO3");
		return "/views/index.jsp";
	}
}
