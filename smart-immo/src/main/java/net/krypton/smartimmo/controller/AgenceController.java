package net.krypton.smartimmo.controller;

import java.util.List;

import net.krypton.smartimmo.entities.Agence;
import net.krypton.smartimmo.service.AgenceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller

public class AgenceController {

	@Autowired
	AgenceService agenceService;
	
	@RequestMapping("/saveAgence")
	public Agence enregistrerAgence(Agence a){
		return agenceService.ajouterAgence(a);
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
