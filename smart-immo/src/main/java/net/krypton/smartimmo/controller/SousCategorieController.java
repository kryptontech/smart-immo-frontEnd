package net.krypton.smartimmo.controller;

import java.util.List;

import net.krypton.smartimmo.entities.SousCategorie;
import net.krypton.smartimmo.service.SousCategorieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SousCategorieController {

	@Autowired
	SousCategorieService sousCategorieService;
	
	@RequestMapping("/saveSousCategorie")
	public SousCategorie enregistrerSousCategorie(SousCategorie a){
		return sousCategorieService.ajouterSousCategorie(a);
	}
	
	@RequestMapping("/modifySousCategorie")
	public SousCategorie modifierSousCategorie(SousCategorie a){
		return sousCategorieService.modifierSousCategorie(a);
	}
	
	@RequestMapping("/deleteSousCategorie")
	public void supprimerSousCategorie(int idSousCategorie){
		
		sousCategorieService.supprimerSousCategorie(idSousCategorie);
	}
	
	
	@RequestMapping("/viewSousCategorie")
	public SousCategorie consulterSousCategorie(int idSousCategorie)
	{
		return sousCategorieService.consulterSousCategorie(idSousCategorie);
	}
	
	@RequestMapping("/viewSousCategories")
	public List<SousCategorie> consulterSousCategories()
	{
		return sousCategorieService.consulterSousCategories();
	}
	
}
