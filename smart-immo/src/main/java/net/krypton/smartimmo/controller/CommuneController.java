package net.krypton.smartimmo.controller;

import java.util.List;

import net.krypton.smartimmo.entities.Commune;
import net.krypton.smartimmo.service.CommuneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommuneController {

	@Autowired
	CommuneService communeService;
	
	@RequestMapping("/saveCommune")
	public Commune enregistrerCommune(Commune a){
		return communeService.ajouterCommune(a);
	}
	
	@RequestMapping("/modifyCommune")
	public Commune modifierCommune(Commune a){
		return communeService.modifierCommune(a);
	}
	
	@RequestMapping("/deleteCommune")
	public void supprimerCommune(int idCommune){
		
		communeService.supprimerCommune(idCommune);
	}
	
	
	@RequestMapping("/viewCommune")
	public Commune consulterCommune(int idCommune)
	{
		return communeService.consulterCommune(idCommune);
	}
	
	@RequestMapping("/viewCommunes")
	public List<Commune> consulterCommunes()
	{
		return communeService.consulterCommunes();
	}
	
}
