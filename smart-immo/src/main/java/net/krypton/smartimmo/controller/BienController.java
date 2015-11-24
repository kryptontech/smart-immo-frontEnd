package net.krypton.smartimmo.controller;

import java.util.List;

import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.service.BienService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class BienController {

	@Autowired
	BienService bienService;
	
	@RequestMapping("/saveBien")
	public Bien enregistrerBien(Bien a){
		return bienService.ajouterBien(a);
	}
	
	@RequestMapping("/modifyBien")
	public Bien modifierBien(Bien a){
		return bienService.modifierBien(a);
	}
	
	@RequestMapping("/deleteBien")
	public void supprimerBien(int idBien){
		
		bienService.supprimerBien(idBien);
	}
	
	
	@RequestMapping("/viewBien")
	public Bien consulterBien(int idBien)
	{
		return bienService.consulterBien(idBien);
	}
	
	@RequestMapping("/viewBiens")
	public List<Bien> consulterBiens()
	{
		return bienService.consulterBiens();
	}
}
