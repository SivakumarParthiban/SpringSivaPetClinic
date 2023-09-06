package com.spring5.sivapetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping({ "", "/", "index", "index.html" })
	public String index() {
		return "index";
	}
	
	@RequestMapping({ "/vets","oops" })
	public String findOwners(Model model) {
		return "notimplemented";
	}
}
