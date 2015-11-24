package net.krypton.smartimmo.controller;

import java.util.List;

import net.krypton.smartimmo.entities.Categorie;
import net.krypton.smartimmo.service.CategorieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CategorieController {

	@Autowired
	CategorieService categorieService;
	
	@RequestMapping("/saveCategorie")
	public Categorie enregistrerCategorie(Categorie a){
		return categorieService.ajouterCategorie(a);
	}
	
	@RequestMapping("/modifyCategorie")
	public Categorie modifierCategorie(Categorie a){
		return categorieService.modifierCategorie(a);
	}
	
	@RequestMapping("/deleteCategorie")
	public void supprimerCategorie(int idCategorie){
		
		categorieService.supprimerCategorie(idCategorie);
	}
	
	
	@RequestMapping("/viewCategorie")
	public Categorie consulterCategorie(int idCategorie)
	{
		return categorieService.consulterCategorie(idCategorie);
	}
	
	@RequestMapping("/viewCategories")
	public List<Categorie> consulterCategories()
	{
		return categorieService.consulterCategories();
	}
	
}
