package com.spring5.sivapetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("owners")
@Controller
public class OwnerController {

	@RequestMapping({"","/","index","index.html"})
	public String listOwners() {
		return "owners/index";
	}
}
