package com.github.dasister.sourcebans.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping(value = "/")
	public String home(Model model) {
		return "layout/base";
	}
}
