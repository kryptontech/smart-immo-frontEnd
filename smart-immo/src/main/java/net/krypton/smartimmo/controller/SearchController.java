package net.krypton.smartimmo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import net.krypton.smartimmo.model.AllMethods;
import net.krypton.smartimmo.service.BienService;

@Controller
public class SearchController {

	@Autowired
	BienService bienService;
	
	@Autowired
	AllMethods allMethods;
}
