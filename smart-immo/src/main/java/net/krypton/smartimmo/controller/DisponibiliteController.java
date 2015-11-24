package net.krypton.smartimmo.controller;

import java.util.List;

import net.krypton.smartimmo.entities.Disponibilite;
import net.krypton.smartimmo.service.DisponibiliteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisponibiliteController {

	@Autowired
	DisponibiliteService disponibiliteService;
	
	@RequestMapping("/saveDisponibilite")
	public Disponibilite enregistrerDisponibilite(Disponibilite a){
		return disponibiliteService.ajouterDisponibilite(a);
	}
	
	@RequestMapping("/modifyDisponibilite")
	public Disponibilite modifierDisponibilite(Disponibilite a){
		return disponibiliteService.modifierDisponibilite(a);
	}
	
	@RequestMapping("/deleteDisponibilite")
	public void supprimerDisponibilite(int idDisponibilite){
		
		disponibiliteService.supprimerDisponibilite(idDisponibilite);
	}
	
	
	@RequestMapping("/viewDisponibilite")
	public Disponibilite consulterDisponibilite(int idDisponibilite)
	{
		return disponibiliteService.consulterDisponibilite(idDisponibilite);
	}
	
	@RequestMapping("/viewDisponibilites")
	public List<Disponibilite> consulterDisponibilites()
	{
		return disponibiliteService.consulterDisponibilites();
	}
	
	
}
