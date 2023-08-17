package com.spring5.sivapetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring5.sivapetclinic.service.OwnerService;

@RequestMapping("owners")
@Controller
public class OwnerController {
	
	public final OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}

	@RequestMapping({"","/","index","index.html"})
	public String listOwners(Model model) {
		model.addAttribute("owners",ownerService.findAll());
		return "owners/index";
	}
}
