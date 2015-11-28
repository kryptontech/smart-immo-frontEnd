package net.krypton.smartimmo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.krypton.smartimmo.model.AllMethods;
import net.krypton.smartimmo.model.FormSearch;


public class SearchController {

	AllMethods  search;
	
	@RequestMapping(value="recherche", method= RequestMethod.POST)
	public String Recherche(FormSearch fs)
	{
		
		
		return "bien-list";
	}
	
}
