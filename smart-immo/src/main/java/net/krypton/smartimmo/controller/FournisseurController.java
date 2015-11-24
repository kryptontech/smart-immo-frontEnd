package net.krypton.smartimmo.controller;

import java.util.List;

import net.krypton.smartimmo.entities.Fournisseur;
import net.krypton.smartimmo.service.FournisseurService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FournisseurController {

	@Autowired
	FournisseurService fournisseurService;
	
	@RequestMapping("/saveFournisseur")
	public Fournisseur enregistrerFournisseur(Fournisseur a){
		return fournisseurService.ajouterFournisseur(a);
	}
	
	@RequestMapping("/modifyFournisseur")
	public Fournisseur modifierFournisseur(Fournisseur a){
		return fournisseurService.modifierFournisseur(a);
	}
	
	@RequestMapping("/deleteFournisseur")
	public void supprimerFournisseur(int idFournisseur){
		
		fournisseurService.supprimerFournisseur(idFournisseur);
	}
	
	
	@RequestMapping("/viewFournisseur")
	public Fournisseur consulterFournisseur(int idFournisseur)
	{
		return fournisseurService.consulterFournisseur(idFournisseur);
	}
	
	@RequestMapping("/viewFournisseurs")
	public List<Fournisseur> consulterFournisseurs()
	{
		return fournisseurService.consulterFournisseurs();
	}
	
}
