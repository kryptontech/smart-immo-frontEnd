package net.krypton.smartimmo.controller;

import java.util.List;

import javax.validation.Valid;

import net.krypton.smartimmo.entities.Agence;
import net.krypton.smartimmo.entities.Fournisseur;
import net.krypton.smartimmo.model.AgenceModel;
import net.krypton.smartimmo.model.Test;
import net.krypton.smartimmo.service.AgenceService;
import net.krypton.smartimmo.service.FournisseurService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller

public class AgenceController {

	@Autowired
	FournisseurService fournisseurService;
	
	@Autowired
	AgenceService agenceService;
	
Test Test = new Test();
	
	@RequestMapping(value="/saveAgence", method = RequestMethod.POST)
	public String enregistrerFournisseur(@Valid Fournisseur v, BindingResult result, ModelMap model){
		v.setMdpFournisseur(Test.md5(v.getMdpFournisseur()));
		fournisseurService.ajouterFournisseur(v);
		return "redirect:/profile";
	}
	@RequestMapping(value = "/saveAgence", method = RequestMethod.GET)
	public String newFournisseur(ModelMap model){
		Fournisseur fournisseur = new Fournisseur();
		model.addAttribute("formAgence", fournisseur);
		
		return "formAgence";
	}
	
	@RequestMapping("/modifyAgence")
	public Agence modifierAgence(Agence a){
		return agenceService.modifierAgence(a);
	}
	
	@RequestMapping("/deleteAgence")
	public void supprimerAgence(int idAgence){
		
		agenceService.supprimerAgence(idAgence);
	}
	
	
	@RequestMapping("/viewAgence")
	public Agence consulterAgence(int idAgence)
	{
		return agenceService.consulterAgence(idAgence);
	}
	
	@RequestMapping("/viewAgences")
	public List<Agence> consulterAgences()
	{
		return agenceService.consulterAgences();
	}
	
}
