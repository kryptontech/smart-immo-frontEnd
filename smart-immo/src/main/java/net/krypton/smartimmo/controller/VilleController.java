package net.krypton.smartimmo.controller;

import java.util.List;

import net.krypton.smartimmo.entities.Ville;
import net.krypton.smartimmo.service.VilleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VilleController {

	@Autowired
	VilleService villeService;

	@RequestMapping("/saveVille")
	public Ville enregistrerVille(Ville a){
		return villeService.ajouterVille(a);
	}
	
	@RequestMapping("/modifyVille")
	public Ville modifierVille(Ville a){
		return villeService.modifierVille(a);
	}
	
	@RequestMapping("/deleteVille")
	public void supprimerVille(int idVille){
		
		villeService.supprimerVille(idVille);
	}
	
	
	@RequestMapping("/viewVille")
	public Ville consulterVille(int idVille)
	{
		return villeService.consulterVille(idVille);
	}
	
	@RequestMapping("/viewVilles")
	public List<Ville> consulterVilles()
	{
		return villeService.consulterVilles();
	}
	
	
}

